package com.programandoenjava;

class MiHilo extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Hilo secundario: Comienza");
            Thread.sleep(2000); // Simula un trabajo de 2 segundos
            System.out.println("Hilo secundario: Termina");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}