package com.programandoenjava;

class MiHilo extends Thread {
    @Override
    public void run() {
        System.out.println("Ejecutando hilo desde la clase Thread");
    }
}