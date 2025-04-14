package com.programandoenjava.interna;

public class Main {
    public static void main(String[] args) {
        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();
        interna.mostrar(); // Salida: Hola desde la clase externa
    }
}