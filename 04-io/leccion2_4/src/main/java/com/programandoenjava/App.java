package com.programandoenjava;

import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            // Crear un objeto FileWriter en modo sobrescritura
            FileWriter writer = new FileWriter("archivo.txt");

            // Escribir en el archivo
            writer.write("¡Hola, mundo!");
            writer.write("\nEste es un archivo de ejemplo.");

            // Cerrar el archivo
            writer.close();

            System.out.println("El archivo se ha escrito exitosamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
