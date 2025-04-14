package com.programandoenjava;

public class App {
    public static void main(String[] args) {
        MiHilo hilo = new MiHilo();
        hilo.run(); // Llama al método run() directamente, no se ejecuta en un hilo separado
    }
}
