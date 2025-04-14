package com.programandoenjava;

class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter para nombre
    public String getNombre() {
        return nombre;
    }

    // Getter para edad
    public int getEdad() {
        return edad;
    }

    // Implementación de compareTo
    @Override
    public int compareTo(Persona otraPersona) {
        // Comparar por edad (orden ascendente)
        return Integer.compare(this.edad, otraPersona.getEdad());
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
}