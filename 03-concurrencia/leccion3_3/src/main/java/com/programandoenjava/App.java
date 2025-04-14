package com.programandoenjava;

public class App {
    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo();
        MiHilo hilo2 = new MiHilo();

        hilo1.start(); // Inicia la ejecución del hilo1 y llama al método run() de la clase MiHilo
        hilo2.start(); // Inicia la ejecución del hilo2 y llama al método run() de la clase MiHilo
    }
}
