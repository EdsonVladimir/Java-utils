package com.colecciones;

import java.util.ArrayList;

public class ColeccionesArrayList {
    public static void main(String[] args) {
        /* Ejemplo 1. */
        /* Crearemos una colección de tipo List. En este caso un ArrayList.
        Para crear este objeto, lo haremos de forma genérica. Es decir,
        no sabemos el tipo de dato que se almacenará en la coleccion.*/
        ArrayList coleccion = new ArrayList();

        // Agregamos elementos a la colección con el método add().
        coleccion.add("Aprendiendo colecciones"); // Valor String
        coleccion.add(10); // Valor de entero
        coleccion.add(15.25); // Valor decimal
        coleccion.add("Ilerna"); //Valor texto
        coleccion.add('a'); // Valor tipo char

        // Para recorrer la coleccion usaremos un bucle for y el método size()
        for(int i = 0; i < coleccion.size(); i++) {
            System.out.println(coleccion.get(i));
        }

        /* Ejemplo 2. */
        /* Crearemos una colección de tipo List. En este caso un ArrayList.
        Para crear este objeto, lo haremos de forma en la que previamente
        sabremos el tipo de datos que se van a almacenar en la colección.*/
        ArrayList<String> coleccionEnteros = new ArrayList<String>();

        // Agregamos los elementos a la colección con el método add().
        coleccionEnteros.add("Elementos de tipo texto.");
        coleccionEnteros.add("Creando una colección con objetos tipo String.");
        coleccionEnteros.add("Este es el tercer elemento de la colección.");

        // Mostramos todo el contenido con el método toString()
        System.out.println(coleccionEnteros.toString());
    }
}
