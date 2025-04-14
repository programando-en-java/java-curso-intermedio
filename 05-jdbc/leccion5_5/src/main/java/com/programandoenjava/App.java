package com.programandoenjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/mi_basedatos";
        String user = "mi_usuario";
        String password = "mi_contraseña";

        // Operaciones a realizar dentro de la transacción
        String insertSQL = "INSERT INTO usuarios(nombre, email) VALUES (?, ?)";
        String updateSQL = "UPDATE usuarios SET email = ? WHERE nombre = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // Desactivar el autocommit para iniciar la transacción
            conn.setAutoCommit(false);

            try (PreparedStatement pstmtInsert = conn.prepareStatement(insertSQL);
                 PreparedStatement pstmtUpdate = conn.prepareStatement(updateSQL)) {

                // Inserción de un nuevo usuario
                pstmtInsert.setString(1, "Carlos Martínez");
                pstmtInsert.setString(2, "carlos.martinez@example.com");
                pstmtInsert.executeUpdate();

                // Actualización de un usuario existente
                pstmtUpdate.setString(1, "carlos.updated@example.com");
                pstmtUpdate.setString(2, "Carlos Martínez");
                pstmtUpdate.executeUpdate();

                // Si todo va bien, confirmamos la transacción
                conn.commit();
                System.out.println("Transacción completada correctamente.");

            } catch (SQLException e) {
                // En caso de error, deshacemos todos los cambios
                conn.rollback();
                System.err.println("Error en la transacción, se ha realizado un rollback: " + e.getMessage());
            }

        } catch (SQLException e) {
            System.err.println("Error de conexión o SQL: " + e.getMessage());
        }
    }
}
