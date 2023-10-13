package com.estructurasDeControl;

import java.util.Scanner;

public class CondicionalSwich {
    public static void main(String[] args) {
        //mesesAnio();
        diasMes();
    }

    static void mesesAnio() {
        int mes;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero de mes: ");
        mes = sc.nextInt();
        switch (mes) {  //inicio del switch
            case 1: System.out.println("ENERO");
                break;
            case 2: System.out.println("FEBRERO");
                break;
            case 3: System.out.println("MARZO");
                break;
            case 4: System.out.println("ABRIL");
                break;
            case 5: System.out.println("MAYO");
                break;
            case 6: System.out.println("JUNIO");
                break;
            case 7: System.out.println("JULIO");
                break;
            case 8: System.out.println("AGOSTO");
                break;
            case 9: System.out.println("SEPTIEMBRE");
                break;
            case 10: System.out.println("OCTUBRE");
                break;
            case 11: System.out.println("NOVIEMBRE");
                break;
            case 12: System.out.println("DICIEMBRE");
                break;
            default : System.out.println("Mes no válido");
        }  //fin del switch
    }

    static void diasMes() {
        String mes;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un nombre de mes: ");
        mes = sc.nextLine();
        switch (mes.toUpperCase()) {
            case "ENERO":
                System.out.println("31 DÍAS");
                break;
            case "FEBRERO":
                System.out.println("28 ó 29 DÍAS");
                break;
            case "MARZO":
                System.out.println("31 DÍAS");
                break;
            case "ABRIL":
                System.out.println("30 DÍAS");
                break;
            case "MAYO":
                System.out.println("31 DÍAS");
                break;
            case "JUNIO":
                System.out.println("30 DÍAS");
                break;
            case "JULIO":
                System.out.println("31 DÍAS");
                break;
            case "AGOSTO":
                System.out.println("31 DÍAS");
                break;
            case "SEPTIEMBRE":
                System.out.println("30 DÍAS");
                break;
            case "OCTUBRE":
                System.out.println("31 DÍAS");
                break;
            case "NOVIEMBRE":
                System.out.println("30 DÍAS");
                break;
            case "DICIEMBRE":
                System.out.println("31 DÍAS");
                break;
            default:
                System.out.println("Mes no válido");
        }
    }
}
