package com.programandoenjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");
        lista.add("Java");  // Permite duplicados

        System.out.println(lista.get(0));
        System.out.println(lista);

        Set<String> conjunto = new HashSet<>();
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("Java");  // No se añade, ya que es un duplicado

        System.out.println(conjunto);

        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Java", 1);
        mapa.put("Python", 2);
        mapa.put("C++", 3);

        System.out.println(mapa.get("Java"));
        System.out.println(mapa);


        Queue<String> cola = new LinkedList<>();
        cola.add("Java");
        cola.add("Python");
        cola.add("C++");

        System.out.println(cola.poll());
        System.out.println(cola);
    }
}
