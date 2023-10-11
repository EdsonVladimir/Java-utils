public class CaracteresEspeciales {
    public static void main(String[] args) {
        var nombre = "Sara";

        System.out.println("nueva Line: \n" + nombre); // salto de linea
        System.out.println("Tabulador: \t" + nombre); // salto de tabulador
        System.out.println("Retroceso: \b\b" + nombre); // caracter de retroceso elimina el espacio en blanco
        System.out.println("Comilla simple: '" + nombre + "'"); //poner comillas al nombre
        System.out.println("Comillas Dobles: \"" + nombre + "\""); //poner comillas dobles al nombre
    }
}
