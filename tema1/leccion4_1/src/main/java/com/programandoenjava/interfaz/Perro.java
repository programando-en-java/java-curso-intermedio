package com.programandoenjava.interfaz;

class Perro implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace guau.");
    }
}