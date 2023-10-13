package com.estructurasDeControl;

import java.util.Scanner;

public class BucleFor {
    public static void main(String[] args) {
        //bucleNumerico();
        ejemploRectanguloAsteriscos();
    }

    static void bucleNumerico() {
        Scanner num = new Scanner(System.in);
        System.out.println("Introdusca un numero X: ");
        int numero = num.nextInt();

        for(int i = 10; i > numero; i--) {
            System.out.println(i + " ");
        }
    }

    static void ejemploRectanguloAsteriscos() {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        //leer número de filas hasta que sea un número > 1
        do{
            System.out.print("Introduce número de filas: ");
            filas = sc.nextInt();
        }while(filas < 2);
        //leer número de columnas hasta que sea un número > 1
        do{
            System.out.print("Introduce número de columnas: ");
            columnas = sc.nextInt();
        }while(columnas < 2);
        for(int i = 1; i <= filas; i++){    //for para las filas
            for(int j = 1; j <= columnas; j++){   //for para las columnas
                System.out.print(" * ");
            }  //fin del for para las columnas
            System.out.println();
        }  //fin del for para las filas
    }

    static int numerEjemplo(){
        return 10;
    }

    // http://puntocomnoesunlenguaje.blogspot.com/2012/04/estructuras-de-control.html
}

