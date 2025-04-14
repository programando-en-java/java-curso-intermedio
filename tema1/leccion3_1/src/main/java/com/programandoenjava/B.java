package com.programandoenjava;

public interface B {
    default void mostrar() {
        System.out.println("Método default en B");
    }
}
