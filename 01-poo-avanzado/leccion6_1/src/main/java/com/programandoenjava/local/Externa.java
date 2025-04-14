package com.programandoenjava.local;

class Externa {
    void metodoExterno() {
        class ClaseLocal {
            void mostrar() {
                System.out.println("Dentro de la clase local.");
            }
        }
        ClaseLocal obj = new ClaseLocal();
        obj.mostrar();
    }
}
