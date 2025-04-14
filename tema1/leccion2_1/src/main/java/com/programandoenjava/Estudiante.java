package com.programandoenjava;

public class Estudiante extends Persona {
    String nombre = "Estudiante";

    Estudiante() {
        super();
    }

    Estudiante(String nombre) {
        super(nombre);
    }

    void mostrarNombres() {
        System.out.println("Nombre en Estudiante: " + nombre);
        System.out.println("Nombre en Persona: " + super.nombre);
    }
}