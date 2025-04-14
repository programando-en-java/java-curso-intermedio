package com.programandoenjava;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class App
{
    public static void main( String[] args )
    {
        Persona persona = new Persona("Carlos", 30, "1234");

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {
            oos.writeObject(persona); // Serializa el objeto
            System.out.println("Objeto serializado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
