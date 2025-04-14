package com.programandoenjava;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Persona[] personas = {
                new Persona("Juan", 25),
                new Persona("Ana", 30),
                new Persona("Carlos", 20)
        };

        // Ordenar el array usando Comparable
        Arrays.sort(personas);

        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
