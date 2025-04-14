package com.programandoenjava;

class Contador {
    private int count = 0;

    // Método sincronizado
    public synchronized void incrementar() {
        count++;
    }

    public int obtenerCuenta() {
        return count;
    }
}