package com.programandoenjava;

class Calculadora<T extends Number> {
    private T numero;

    public Calculadora(T numero) {
        this.numero = numero;
    }

    public double calcularDoble() {
        return numero.doubleValue() * 2;
    }
}