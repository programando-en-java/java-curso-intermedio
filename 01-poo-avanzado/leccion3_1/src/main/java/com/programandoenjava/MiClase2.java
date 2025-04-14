package com.programandoenjava;

public class MiClase2 implements A, B {
    @Override
    public void mostrar() {
        System.out.println("Método sobrescrito para evitar conflicto.");
    }
}