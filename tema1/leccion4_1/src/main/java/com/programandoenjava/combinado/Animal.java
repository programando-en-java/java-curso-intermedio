package com.programandoenjava.combinado;

abstract class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    abstract void hacerSonido();
}
