package com.genericas;

public class ExcepcionPilaLlena extends RuntimeException {
    public ExcepcionPilaLlena() {
        this ("La Pila está llena");
    }

    public ExcepcionPilaLlena(String excepcion) {
        super(excepcion);
    }
}
