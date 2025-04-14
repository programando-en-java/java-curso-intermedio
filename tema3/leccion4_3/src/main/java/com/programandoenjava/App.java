package com.programandoenjava;

public class App {
    public static void main(String[] args) {
        MiHilo hiloSecundario = new MiHilo();
        hiloSecundario.start();  // Inicia el hilo secundario

        try {
            hiloSecundario.join(); // El hilo principal espera a que el hilo secundario termine
            System.out.println("Hilo principal: El hilo secundario ha terminado");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MiHiloConTiempo miHiloConTiempo = new MiHiloConTiempo();
        miHiloConTiempo.start(); // Inicia el hilo secundario

        try {
            miHiloConTiempo.join(2000); // El hilo principal espera máximo 2 segundos
            System.out.println("Hilo principal: Pasaron 2 segundos o el hilo secundario terminó");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
