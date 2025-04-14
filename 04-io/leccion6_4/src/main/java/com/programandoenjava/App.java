package com.programandoenjava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try (OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("salida.txt"), "UTF-8")) {
            osw.write("Hola, mundo!\n");
            osw.write("Esto es un archivo escrito con OutputStreamWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("Hola, esto se imprime en la consola usando OutputStreamWriter.\n");
            osw.flush(); // Asegura que los datos se envíen a la salida
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
