package com.seleccion;

public class Masajista extends SeleccionFutbol {
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.aniosExperiencia = aniosExperiencia;
    }
    // getter y setter

    public void darMasaje() {

    }
}
