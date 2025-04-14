package com.programandoenjava;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3);
        List<String> palabras = List.of("Hola", "Mundo");

        imprimirLista(numeros);  // ✅ Funciona
        imprimirLista(palabras); // ✅ Funciona
    }

    public static void imprimirLista(List<?> lista) {
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }
}
