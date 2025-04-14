package com.programandoenjava.interna;

class Externa {
    private String mensaje = "Hola desde la clase externa";

    class Interna {
        void mostrar() {
            System.out.println(mensaje); // Accede al atributo privado de Externa
        }
    }
}
