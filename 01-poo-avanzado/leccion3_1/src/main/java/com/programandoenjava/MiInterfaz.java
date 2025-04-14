package com.programandoenjava;

public interface MiInterfaz {
    default void metodoPorDefecto() {
        System.out.println("Este es un método default en una interfaz.");
    }
}