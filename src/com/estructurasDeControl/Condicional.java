package com.estructurasDeControl;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        //condicionaSimple();
        //condicionaDoble();
        //condicionaDoblePar();
        //condicionalMultiple();
        /*int numero = 0; Error comun en un if
        if(numero) {

        } elseif*/

        //mesesDelAnio();

        System.out.println(10 % 2 == 0 ? "PAR" : "IMPAR");
    }

    static void condicionaSimple() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese nota: ");
        int nota = sc.nextInt();
        if(nota > 5) {
            System.out.println("As aprobado");
        }
        //if(nota > 5)
            //System.out.println("As aprobado");
        System.out.println("Hasta pronto");
    }

    static void condicionaDoble() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese nota: ");
        int nota = sc.nextInt();
        if(nota > 5) {
            System.out.println("As aprobado");
        } else {
            System.out.println("As reprobado");
        }
        System.out.println("Hasta pronto");
    }

    // quiero saber si un numero es par o inpar
    static void condicionaDoblePar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingese Numero: ");
        int numero = sc.nextInt();
        if(numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("INPAR");
        }
    }

  static void condicionalMultiple() {
      Scanner sc = new Scanner(System.in);
      int hora;
      System.out.print("Introduzca una hora (>= 0 y <= 23): ");
      hora = sc.nextInt();
      if (hora >= 0 && hora < 12) {
          System.out.println("Buenos días");
      } else if (hora >= 12 && hora < 21) {
          System.out.println("Buenas tardes");
      } else if (hora >= 21 && hora < 24) {
          System.out.println("Buenas noches");
      } else {
          System.out.println("Hora no válida");
      }
      System.out.println("Hasta pronto!!!");
  }

  static void mesesDelAnio() {
      Scanner sc = new Scanner(System.in);
      int mes;
      System.out.print("Introdusca un numero del 1 al 12 asumiendo que el numero sera el mes");
      mes = sc.nextInt();
      if(mes == 1) {
          System.out.println("Enero");
      } else if (mes == 2) {
          System.out.println("febrero");
      } else if (mes == 3) {
          System.out.println("Marzo");
      } else if (mes == 4) {
          System.out.println("Abril");
      } else {
          System.out.println("numero no valido");
      }
  }
}
