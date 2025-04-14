package com.programandoenjava;

import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("archivo.txt")) {
            int caracter;
            while ((caracter = fr.read()) != -1) {
                System.out.print((char) caracter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader("archivo.txt")) {
            char[] buffer = new char[100]; // Leer de 100 en 100 caracteres
            int caracteresLeidos;
            while ((caracteresLeidos = fr.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, caracteresLeidos));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
