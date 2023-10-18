package com.genericas;

public class ExcepcionPilaVacia extends RuntimeException {
    public ExcepcionPilaVacia() {
        this ("La Pila está vacía");
    }

    public ExcepcionPilaVacia(String excepcion) {
        super (excepcion);
    }
}
