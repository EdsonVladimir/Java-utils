package com.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Fundamentos {
    public static void main(String[] args) {
        String[] departamentos = {"La Paz", "Oruro", "Potosi", "Cochabamaba", "Chuquisaca", "Tarija", "Santa Cruz", "Beni", "Pando"};

        List<String> listaDepartamentos = new ArrayList<String>();

        for (int i = 0; i < departamentos.length; i++) {
            listaDepartamentos.add(departamentos[i]);
        }

       // System.out.println("Departamentos");
       // imprimir(listaDepartamentos);


        String[] departamentosValle = {"Cochabamaba", "Chuquisaca", "Tarija"};

        List<String> listaDepartamentosValle = new ArrayList<String>();

        for (int i = 0; i < departamentosValle.length; i++) {
            listaDepartamentosValle.add(departamentos[i]);
        }

        for (String departamento : listaDepartamentosValle) {
            listaDepartamentos.remove(departamento);
        }

        System.out.println("sin valle");
        imprimir(listaDepartamentos);
    }

    public static void imprimir(List<String> collection) {
        Iterator<String> iterator = collection.iterator();

        /*while (iterator.hasNext()){
            System.out.printf("%s ", iterator.next());
        }*/

        for (int i = 0; i < collection.size(); i++){
            System.out.printf("%s ", collection.get(i));
        }

        System.out.println();
    }
}
