package com.programandoenjava.abstracta;

abstract class Animal {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    abstract void hacerSonido();

    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }
}
