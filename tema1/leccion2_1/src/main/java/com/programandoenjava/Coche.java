package com.programandoenjava;

public class Coche {
    String marca;
    int ano;

    // Constructor principal
    Coche(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    // Constructor secundario que llama al principal
    Coche(String marca) {
        this(marca, 2023); // Llama al constructor principal con un valor por defecto
    }

    void mostrarCoche() {
        System.out.println("Marca: " + marca + ", Año: " + ano);
    }
}