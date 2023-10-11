package com.seleccion;

public class Entrenador extends SeleccionFutbol {

    private String federacion;
    public Entrenador(int id, String nombre, String apellidos, int edad, String federacion) {
        super(id, nombre, apellidos, edad);
        this.federacion = federacion;
    }
}
