package com.programandoenjava;

public class App {
    public static void main(String[] args) {
        Contador contador = new Contador();

        // Creamos múltiples hilos
        Thread hilo1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                contador.incrementar();
            }
        });

        Thread hilo2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                contador.incrementar();
            }
        });

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Cuenta final: " + contador.obtenerCuenta());
    }
}
