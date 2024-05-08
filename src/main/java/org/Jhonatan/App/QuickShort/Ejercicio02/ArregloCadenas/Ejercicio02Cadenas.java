package org.Jhonatan.App.QuickShort.Ejercicio02.ArregloCadenas;

public class Ejercicio02Cadenas {

    public static void main(String[] args) {
        String arregloPalabras[] = {
            "Q", "W", "E", "R", "T", "Y", "U", "I", "I", "O", "P",
            "A", "S", "D", "F", "G", "H", "H", "J", "K", "L", "Ñ", "Z",
            "X", "C", "V", "B", "N", "M"
        };
        VectorCadenas cadenas = new VectorCadenas(arregloPalabras);
        System.out.println("\nArreglo tal cual: ");
        System.out.print(cadenas.mostrarDatos());
        System.out.println("\nArreglo de cadenas ordenado por QuickShort: ");
        cadenas.quickShortCadenas(arregloPalabras);
        System.out.print(cadenas.mostrarDatos());

    }

}
