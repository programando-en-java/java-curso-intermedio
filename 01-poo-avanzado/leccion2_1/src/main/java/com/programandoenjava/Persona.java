package com.programandoenjava;

class Persona {
    String nombre = "Persona genérica";

    Persona() {

    }

    Persona(String nombre) {
        this.nombre = nombre; // `this.nombre` se refiere al atributo de la clase
    }

    void mostrarNombre() {
        System.out.println("Nombre: " + this.nombre);
    }
}
