package com.programandoenjava.interfaz;

public class Main {
    public static void main(String[] args) {
        Mensaje obj = new Mensaje() {
            public void mostrarMensaje() {
                System.out.println("Hola desde una clase anónima.");
            }
        };
        obj.mostrarMensaje(); // Salida: Hola desde una clase anónima.
    }
}