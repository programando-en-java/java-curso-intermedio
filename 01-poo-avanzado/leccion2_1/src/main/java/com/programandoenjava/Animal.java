package com.programandoenjava;

public class Animal {
    String tipo;

    Animal(String tipo) {
        this.tipo = tipo;
    }

    void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
