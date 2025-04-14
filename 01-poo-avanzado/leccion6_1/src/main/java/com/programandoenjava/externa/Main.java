package com.programandoenjava.externa;

public class Main {
    public static void main(String[] args) {
        Externa.Interna obj = new Externa.Interna();
        obj.mostrar(); // Salida: Dentro de la clase interna estática.
    }
}