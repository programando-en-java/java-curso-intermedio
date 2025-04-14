package com.programandoenjava;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        // Crear un ExecutorService con un pool de 3 hilos
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Enviar tareas al ExecutorService
        executor.submit(new Tarea());
        executor.submit(new Tarea());
        executor.submit(new Tarea());

        // Finalizar el servicio de ejecución
        executor.shutdown();

        ExecutorService executor2 = Executors.newSingleThreadExecutor();
        // Crear un ExecutorService con un pool de 1 hilo con un Callable
        executor2.submit(new Tarea());

        executor2.shutdown();
    }
}
