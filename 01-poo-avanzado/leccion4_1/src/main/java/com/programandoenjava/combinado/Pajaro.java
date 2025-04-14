package com.programandoenjava.combinado;

class Pajaro extends Animal implements Volador {
    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    void hacerSonido() {
        System.out.println("El pájaro canta.");
    }

    @Override
    public void volar() {
        System.out.println("El pájaro está volando.");
    }
}