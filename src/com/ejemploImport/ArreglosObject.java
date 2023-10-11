package com.ejemploImport;

import com.domail.Persona;

public class ArreglosObject {

    public static void main(String[] args) {
        Persona personas[] = new Persona[2];

        personas[0] = new Persona("Edson Sosa");
        personas[1] = new Persona("Vladimir Sosa");

        System.out.println("Pesona 0: " + personas[0]);
        System.out.println("Pesona 1: " + personas[1]);

        for(int i = 0; i < personas.length; i++) {
            System.out.println("Persona " + i +" "+ personas[i].getNombre());
        }

        String frutas[] = {"Naranja", "Platano", "Banana"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Valor del Array " + ": " + frutas[i]);
        }

    }
}
