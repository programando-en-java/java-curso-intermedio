package com.programandoenjava;

class MiHilo extends Thread {
    @Override
    public void run() {
        System.out.println("Hilo en ejecución: " + Thread.currentThread().getName());
    }
}