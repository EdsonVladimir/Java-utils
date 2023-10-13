package com.estructurasDeControl;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        //numeroIgualCien();
        numeroValor();
    }

    static void numeroIgualCien() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {  //inicio del do .. while
            System.out.print("Escribe un número entero entre 1 y 10: ");
            n = sc.nextInt();
            if (n < 1 || n > 10) {
                System.out.println("Valor no válido");
            }
        } while (n < 1 || n > 10);   //fin del do .. while

        System.out.println("Ha introducido: " + n);
    }

    static void numeroValor() {
        int i = 0;
        do {   //inicio del do .. while
            System.out.print(i + " ");
            i++;
        } while (i<=10);   //fin del do .. while
        System.out.println("\nFin programa");
    }
}
