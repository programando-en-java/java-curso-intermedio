package com.programandoenjava;

public class App 
{
    public static void main( String[] args )
    {
        Animal miPerro = new Perro();
        miPerro.hacerSonido();

        Calculadora calc = new Calculadora();

        System.out.println(calc.sumar(5));
        System.out.println(calc.sumar(5, 7));
        System.out.println(calc.sumar(5.5, 4.3));
    }
}
