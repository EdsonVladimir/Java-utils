package com.seleccion;
public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
    }

    // getter y setter

}

//https://jarroba.com/herencia-en-la-programacion-orientada-a-objetos-ejemplo-en-java/