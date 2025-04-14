package com.programandoenjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        Iterator<String> iterador = lista.iterator(); // Obtener el iterador

        while (iterador.hasNext()) {
            String elemento = iterador.next(); // Obtener el elemento
            System.out.println(elemento);
        }

    }
}
