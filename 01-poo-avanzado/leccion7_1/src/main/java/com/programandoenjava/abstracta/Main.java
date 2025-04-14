package com.programandoenjava.abstracta;

public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Animal() {
            void sonido() {
                System.out.println("El animal hace un sonido.");
            }
        };
        miAnimal.sonido(); // Salida: El animal hace un sonido.
    }
}