package com.programandoenjava;

public class Perro extends Animal {
    String raza;

    Perro(String tipo, String raza) {
        super(tipo); // Llamando al constructor de Animal
        this.raza = raza;
    }

    void mostrarInfo() {
        System.out.println("Tipo: " + tipo + ", Raza: " + raza);
    }

    @Override
    void hacerSonido() {
        super.hacerSonido(); // Llama al método original de la superclase
        System.out.println("El perro ladra.");
    }
}
