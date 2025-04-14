package com.programandoenjava;


public class App {
    public static void main(String[] args) {
        Calculadora<Integer> calc1 = new Calculadora<>(5);
        Calculadora<Double> calc2 = new Calculadora<>(5.5);

        System.out.println(sumar(10, 5));
        System.out.println(sumar(3.5, 2.5));
    }

    public static <T extends Number> double sumar(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }
}
