package com.genericas;

public class Pila<E> {
    private final int tamaño;
    private int superior;
    private E[] elementos;

    public Pila() {
        this (10); // tamaño predeterminado de la pila
    }

    public Pila(int s) {
        tamaño = s > 0 ? s : 10;
        superior = -1;
        elementos = (E[]) new Object[tamaño];
    }

    public void apilar(E valor) {
        if (superior == tamaño - 1) {
            throw new ExcepcionPilaLlena(String.format ("La Pila está llena, no se puede apilar %s", valor));
        }
        elementos [++ superior] = valor;
    }

    public E desapilar() {
        if (superior == -1) {
            throw new ExcepcionPilaVacia("La Pila está vacía, no se puede desapilar");
        }
        return elementos[superior--];
    }
}
