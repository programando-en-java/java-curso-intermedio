package com.programandoenjava.abstracta;

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    void hacerSonido() {
        System.out.println("El perro hace guau.");
    }
}