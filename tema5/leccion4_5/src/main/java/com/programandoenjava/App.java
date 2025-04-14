package com.programandoenjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "admin";

        String insertSQL = "INSERT INTO usuarios(nombre, email) VALUES (?, ?)";
        String selectSQL = "SELECT id, nombre, email FROM usuarios WHERE email = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            PreparedStatement pstmtInsert = conn.prepareStatement(insertSQL);

            String nombre = "Ana García";
            String email = "ana.garcia@example.com";

            pstmtInsert.setString(1, nombre);
            pstmtInsert.setString(2, email);

            int filasAfectadas = pstmtInsert.executeUpdate();

            System.out.println("Usuario insertado correctamente. Filas afectadas: " + filasAfectadas);

            PreparedStatement pstmt = conn.prepareStatement(selectSQL);
            String emailBuscado = "ana.garcia@example.com";
            pstmt.setString(1, emailBuscado);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("id");
                    String nombreEncontrado = rs.getString("nombre");
                    String emailEncontrado = rs.getString("email");

                    System.out.println("Usuario encontrado:");
                    System.out.println("ID: " + id + ", Nombre: " + nombreEncontrado + ", Email: " + emailEncontrado);
                } else {
                    System.out.println("No se encontró ningún usuario con ese email.");
                }
            }

        } catch (SQLException e) {
            System.err.println("Error en la consulta: " + e.getMessage());
        }
    }
}
