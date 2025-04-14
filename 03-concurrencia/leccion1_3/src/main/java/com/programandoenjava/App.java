package com.programandoenjava;


public class App {
    public static void main(String[] args) {
        MiHilo hilo = new MiHilo();
        hilo.start(); // Inicia la ejecución del hilo

        MiTarea tarea = new MiTarea();
        Thread hilo2 = new Thread(tarea); // Pasa la tarea al hilo
        hilo2.start(); // Inicia la ejecución del hilo
    }
}
