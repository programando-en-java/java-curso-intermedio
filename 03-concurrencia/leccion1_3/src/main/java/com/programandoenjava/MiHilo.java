package com.programandoenjava;

public class MiHilo extends Thread {
    @Override
    public void run() {
        System.out.println("Este es el hilo en ejecución.");
    }
}
