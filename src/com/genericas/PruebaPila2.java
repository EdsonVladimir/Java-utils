package com.genericas;

public class PruebaPila2 {
    private Double[] elementsDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
    private Integer[] elementsInteger = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    private Pila<Double> pilaDouble;
    private Pila<Integer> pilaInteger;

    public void probarPilas () {
        pilaDouble = new Pila<Double>(5);
        pilaInteger = new Pila<Integer>(10);
        probarApilar("pilaDouble", pilaDouble, elementsDouble);
        probarDesapilar("pilaDouble", pilaDouble);
        probarApilar("pilaInteger", pilaInteger, elementsInteger);
        probarDesapilar("pilaInteger", pilaInteger);
    }

    public <T> void probarApilar(String nombre, Pila<T> pila, T[] elementos) {
        try {
            System.out.printf ("\nApilando elementos en %s\n", nombre);
            for (T elemento: elementos) {
                System.out.printf ("%s", elemento);
                pila.apilar(elemento);
            }
        } catch (ExcepcionPilaLlena excepcioPilaLlena) {
            System.out.println();
            excepcioPilaLlena.printStackTrace ();
        }
    }

    public <T> void probarDesapilar(String nombre, Pila<T> pila) {
        try {
            System.out.printf ("\nDesapilando elementos de %s\n", nombre);
            T valorAQuitar;
            while (true) {
                valorAQuitar = pila.desapilar();
                System.out.printf("%s", valorAQuitar);
            }
        } catch (ExcepcionPilaVacia excepcioPilaVacia) {
            System.out.println();
            excepcioPilaVacia.printStackTrace();
        }
    }

    public static void main(String args[]) {
        PruebaPila2 aplicacion = new PruebaPila2();
        aplicacion.probarPilas();
    }
}
