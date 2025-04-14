package com.programandoenjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/potsgres";
        String user = "postgres";
        String password = "admin";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("Conexión exitosa a PostgreSQL!");
            } else {
                System.out.println("Fallo al conectar.");
            }
        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }
    }
}
