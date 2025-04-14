package com.programandoenjava;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Crear un ExecutorService
        ExecutorService executor = Executors.newFixedThreadPool(1);

        // Crear una tarea Callable
        Callable<Integer> tarea = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                // Simulando un cálculo que devuelve un valor
                return 42;
            }
        };

        // Enviar la tarea y obtener el Future
        Future<Integer> futuro = executor.submit(tarea);

        // Obtener el resultado de la tarea
        Integer resultado = futuro.get();
        System.out.println("Resultado de la tarea: " + resultado);

        Future<Integer> futuro2 = executor.submit(tarea);

        // Intentar cancelar la tarea
        boolean cancelado = futuro2.cancel(true);
        System.out.println("Tarea cancelada: " + cancelado);

        // Intentar obtener el resultado (si la tarea fue cancelada, lanzará una excepción)
        try {
            Integer resultado2 = futuro2.get();
            System.out.println("Resultado de la tarea: " + resultado2);
        } catch (CancellationException e) {
            System.out.println("La tarea fue cancelada.");
        } catch (ExecutionException e) {
            System.out.println("Error en la ejecución de la tarea: " + e.getCause());
        } catch (InterruptedException e) {
            System.out.println("La tarea fue interrumpida.");
        }

        // Cerrar el ExecutorService
        executor.shutdown();
    }
}
