package com.programandoenjava;

public class MiHiloConTiempo extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Hilo secundario: Comienza");
            Thread.sleep(4000); // Simula un trabajo de 4 segundos
            System.out.println("Hilo secundario: Termina");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}