package com.programandoenjava;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Number> numeros = new ArrayList<>();
        agregarNumeros(numeros);
        List<Object> objetos = new ArrayList<>();
        agregarElementos(objetos);
    }

    public static void agregarNumeros(List<? super Integer> lista) {
        lista.add(10);
        lista.add(20);
    }

    public static void agregarElementos(List<? super String> lista) {
        lista.add("Hola");
        lista.add("Mundo");
    }
}
