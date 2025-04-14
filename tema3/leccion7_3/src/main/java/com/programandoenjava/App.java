package com.programandoenjava;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        // Crear un ExecutorService
        ExecutorService executor = Executors.newFixedThreadPool(1);

        // Crear una tarea Callable
        Callable<Integer> tarea = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                // Simulando un cálculo que retorna un valor
                return 42;
            }
        };

        // Enviar la tarea al ExecutorService
        executor.submit(tarea);

        // Cerrar el ExecutorService
        executor.shutdown();
    }
}
