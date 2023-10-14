package com.composicion;

public class PersonaNew {
    private String nombre;
    private int edad;

    private Direccion dirección;

    public PersonaNew(String nombre, int edad) {
        super();
        this.nombre = nombre;
        this.edad = edad;
    }
    public Direccion getDirección() {
        return dirección;
    }
    public void setDirección(Direccion dirección) {
        this.dirección = dirección;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
