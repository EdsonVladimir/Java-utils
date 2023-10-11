public class Varibles {

    public static void main(String args[]) {
        byte edad = 25; // Asigna el valor 25 a la variable edad de tipo byte.
        short numeroHabitaciones = 100; // Asigna el valor 100 a la variable numeroHabitaciones de tipo short.
        int numeroEmpleados = 1000; // Asigna el valor 1000 a la variable numeroEmpleados de tipo int.
        long numeroTelefono = 1234567890; // Asigna el valor 1234567890 a la variable numeroTelefono de tipo long.
        float precio = 19.99F; // Asigna el valor 19.99 a la variable precio de tipo float.
        double distancia = 1234.5678; // Asigna el valor 1234.5678 a la variable distancia de tipo double.
        char letra = 'A'; // Asigna el carácter 'A' a la variable letra de tipo char.
        boolean estaLloviendo = true; // Asigna el valor true a la variable estaLloviendo de tipo boolean.
        boolean esFinDeSemana = false; // Asigna el valor false a la variable esFinDeSemana de tipo boolean.

        operacionesBasicas();
        obtenerPromedioNotas();
        respuestaPregunta();
    }

    //Declare e inicie variables que permita realizar las operaciones básicas.
    public static void operacionesBasicas () {
        int a = 5, b = 3, c;
        System.out.println("La suma es ;");
        c= a+b;
        System.out.println(c);
        System.out.println("La resta es ;");
        c= a-b;
        System.out.println(c);
        System.out.println("La multiplicacion es ;");
        c= a*b;
        System.out.println(c);
        System.out.println("La division es ;");
        double d= a/b;
        System.out.println(d);
    }

    //Mostrar el promedio de notas de un alumno.
    public static void obtenerPromedioNotas(){
        System.out.println("Promedio de notas");
        System.out.println("nota 01");
        int n1= 13;
        System.out.println(n1);
        System.out.println("nota 02");
        int n2= 17;
        System.out.println(n2);
        System.out.println("nota 03");
        int n3= 11;
        System.out.println(n3);
        System.out.println("nota 04");
        int n4= 14;
        System.out.println(n4);
        float promedio =(n1+n2+n3+n4)/4;
        System.out.println("Su promedio es ; " + promedio);
    }

    //Calcular el porcentaje que debe pagar un cliente, en la compra de una
    // motocicleta a plazos en un periodo de 6 meses
    // , si el interés mensual progresivo es de 3.5 % .

    public static void respuestaPregunta () {
        int preciomoto = 2500;
        System.out.println("Primer mes");
        double mes1 = (preciomoto * 3.5)/100;
        System.out.println(mes1 + " soles");
        System.out.println("Segundo mes");
        double mes2 = (preciomoto * 7)/100;
        System.out.println(mes2 + " soles");
        System.out.println("Tercer mes");
        double mes3 = (preciomoto * 10.5)/100;
        System.out.println(mes3 + " soles");
        System.out.println("Cuarto mes");
        double mes4 = (preciomoto * 14)/100;
        System.out.println(mes4 + " soles");
        System.out.println("Quinto mes");
        double mes5 = (preciomoto * 17.5)/100;
        System.out.println(mes5 + " soles");
        System.out.println("Sexto mes");
        double mes6 = (preciomoto * 21)/100;
        System.out.println(mes6 + " soles");
        double pago=(mes1+mes2+mes3+mes4+mes5+mes6);
        double porcentaje = (pago*100)/2500;
        System.out.println("El pago incremental es de ;");
        System.out.println(pago);
        System.out.println("En porcentaje a pagar seria ; "+porcentaje+"%");
    }
}
