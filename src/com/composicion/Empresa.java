package com.composicion;

/**
 * @author Edson Vladimir Sosa Sacari
 */
public class Empresa {
    private String cif;
    private Direccion dirección;

    public Direccion getDirección() {
        return dirección;
    }
    public void setDirección(Direccion dirección) {
        this.dirección = dirección;
    }
    public String getCif() {
        return cif;
    }
    public void setCif(String cif) {
        this.cif = cif;
    }
}
