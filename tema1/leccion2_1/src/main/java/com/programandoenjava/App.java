package com.programandoenjava;

public class App {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        persona.mostrarNombre();

        Coche coche1 = new Coche("Toyota");
        coche1.mostrarCoche();

        Perro miPerro = new Perro("Mamífero", "Labrador");
        miPerro.mostrarInfo();

        Estudiante estudiante = new Estudiante();
        estudiante.mostrarNombres();
    }
}
