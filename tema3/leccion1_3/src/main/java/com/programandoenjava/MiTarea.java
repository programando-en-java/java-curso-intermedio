package com.programandoenjava;

public class MiTarea implements Runnable {
    @Override
    public void run() {
        System.out.println("Este es el hilo en ejecución.");
    }
}