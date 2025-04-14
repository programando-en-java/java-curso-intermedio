package com.programandoenjava;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Juan", 25));
        lista.add(new Persona("Ana", 30));
        lista.add(new Persona("Carlos", 20));

        // Ordenar por edad
        Collections.sort(lista, new ComparadorPorEdad());
        System.out.println("Ordenado por edad:");
        System.out.println(lista);

        // Ordenar por nombre
        Collections.sort(lista, new ComparadorPorNombre());
        System.out.println("Ordenado por nombre:");
        System.out.println(lista);


        // Ordenar por edad usando lambda
        lista.sort((p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()));
        System.out.println("Ordenado por edad con lambda:");
        System.out.println(lista);

        // Ordenar por nombre usando método de referencia
        lista.sort(Comparator.comparing(Persona::getNombre));
        System.out.println("Ordenado por nombre con método de referencia:");
        System.out.println(lista);
    }
}
