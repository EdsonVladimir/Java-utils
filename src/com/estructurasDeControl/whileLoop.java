package com.estructurasDeControl;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        //numeroNegativo();
        //nAsteriscos();
        celsiusFahr();
    }

    static void numeroNegativo(){
        Scanner sc = new Scanner(System.in);
        int num;       //variable que contiene el número introducido
        int suma = 0;  //variable donde acumularemos la suma de los números

        System.out.print("Introduzca un número ( < 0 para finalizar): ");
        num = sc.nextInt(); //lectura del primer número

        while (num >= 0){ //inicio del bucle while
            suma = suma + num; //se suma el número introducido
            System.out.print("Introduzca un número ( < 0 para finalizar): ");
            num = sc.nextInt(); //lectura del siguiente número
        } //fin del bucle while
        System.out.println("La suma es: " + suma ); //se muestra la suma
    }

    static void nAsteriscos() {
        Scanner sc = new Scanner(System.in);
        int n; //variable que contiene el número de asteriscos a mostrar
        int contador = 0; //variable para contar los asteriscos que se han mostrado
        System.out.print("Introduce número de asteriscos a mostrar: ");
        n = sc.nextInt(); //leemos el número total de asteriscos a mostrar

        while (contador < n){ //inicio del bucle while
            System.out.print("*");
            contador++;
        }  //fin del bucle while
        System.out.println("Fin programa");
    }

    static void celsiusFahr() {
        int fahrenheit = 10; //contiene las temperaturas fahrenheit
        double celsius;      //contiene las temperaturas celsius
        System.out.printf(" ºF \t  ºC \n");
        System.out.println("---------------");
        while (fahrenheit <= 100 ){ //inicio del bucle while
            celsius = (fahrenheit - 32)*5/9.0;
            System.out.printf("%3d\t%6.2f \n", fahrenheit, celsius);
            fahrenheit += 10;
        }  //fin del bucle while
    }
}
