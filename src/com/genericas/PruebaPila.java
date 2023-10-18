package com.genericas;

public class PruebaPila {
    private double[] elementsDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
    private int[] elementsInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    private Pila<Double> pilaDouble;
    private Pila <Integer> pilaInteger;

    public void probarPilas() {
        pilaDouble = new Pila<Double>(5);
        pilaInteger = new Pila<Integer>(10);
        pruebaApilarDouble();
        pruebaDesapilarDouble();
        pruebaApilarInteger();
        pruebaDesapilarInteger();
    }

    public void pruebaApilarDouble() {
        try {
            System.out.println( "\nApilando elementos a pilaDouble");
            for (double elemento : elementsDouble) {
                System.out.printf("%.1f", elemento);
                pilaDouble.apilar(elemento);
            }
        } catch (ExcepcionPilaLlena excepcioPilaLlena) {
            System.err.println();
            excepcioPilaLlena.printStackTrace();
        }
    }

    public void pruebaDesapilarDouble() {
        try {
            System.out.println( "\n Desapilando elementos de pilaDouble");
            double valorAQuitar;
            while(true) {
                valorAQuitar = pilaDouble.desapilar();
                System.out.printf("%.1f", valorAQuitar);
            }
        } catch (ExcepcionPilaVacia excepcioPilaVacia) {
            System.err.println();
            excepcioPilaVacia.printStackTrace();
        }
    }

    public void pruebaApilarInteger() {
        try {
            System.out.println("\n Apilando elementos a pilaInteger");
            for (int elemento : elementsInteger) {
                System.out.printf("%d", elemento);
                pilaInteger.apilar(elemento);
            }
        } catch (ExcepcionPilaLlena excepcioPilaLlena) {
            System.err.println();
            excepcioPilaLlena.printStackTrace();
        }
    }

    public void pruebaDesapilarInteger() {
        try {
            System.out.println("\n Desapilando elementos de pilaInteger");
            int valorAQuitar;
            while(true) {
                valorAQuitar = pilaInteger.desapilar();
                System.out.printf("%d", valorAQuitar);
            }
        } catch (ExcepcionPilaVacia excepcioPilaVacia) {
            System.err.println();
            excepcioPilaVacia.printStackTrace();
        }
    }

    public static void main(String args[]) {
        PruebaPila aplicacion = new PruebaPila();
        aplicacion.probarPilas();
    }
}
