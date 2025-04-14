package com.programandoenjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";
        String password = "admin";
        String createTableSQL = "CREATE TABLE IF NOT EXISTS usuarios (id SERIAL PRIMARY KEY, nombre VARCHAR(50), email VARCHAR(50))";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            Statement stmt = conn.createStatement();
            stmt.execute(createTableSQL);
            System.out.println("Tabla creada o ya existe.");

            stmt.execute("INSERT INTO usuarios (nombre, email) VALUES ('JUAN', 'juan@email.com')");
            stmt.execute("INSERT INTO usuarios (nombre, email) VALUES ('MARIA', 'maria@email.com')");
            System.out.println("Datos insertados.");

            ResultSet rs = stmt.executeQuery("SELECT id, nombre, email FROM usuarios");
            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
            }

            // Actualizar un registro
            int contador = stmt.executeUpdate("UPDATE usuarios SET nombre = 'JUAN PEREZ' WHERE id = 1");
            System.out.println("Registro actualizado: " + contador);

            ResultSet rs2 = stmt.executeQuery("SELECT id, nombre, email FROM usuarios");
            while (rs2.next()) {
                int id = rs2.getInt("id");
                String nombre = rs2.getString("nombre");
                String email = rs2.getString("email");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
            }
            rs.close();
            rs2.close();
        } catch (SQLException e) {
            System.err.println("Error al ejecutar la consulta: " + e.getMessage());
        }
    }
}
