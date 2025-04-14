package com.programandoenjava;

import java.io.Serializable;

public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private int edad;
    private transient String contrasena;

    public Persona(String nombre, int edad, String contrasena) {
        this.nombre = nombre;
        this.edad = edad;
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre='" + nombre + "', edad=" + edad + '}';
    }
}