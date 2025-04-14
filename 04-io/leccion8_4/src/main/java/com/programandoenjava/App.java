package com.programandoenjava;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class App {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"))) {
            Persona persona = (Persona) ois.readObject(); // Deserializa el objeto
            System.out.println("Objeto deserializado: " + persona);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
