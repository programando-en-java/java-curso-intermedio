package com.programandoenjava;

public interface A {
    default void mostrar() {
        System.out.println("Método default en A");
    }
}
