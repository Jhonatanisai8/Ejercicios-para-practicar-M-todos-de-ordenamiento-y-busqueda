package org.Jhonatan.App.MergetSort.Ejercicio02OrdenarPalabras;

public class Ejercicio02 {

    public static void main(String[] args) {
        String arregloPalabras[] = {
            "Q", "W", "E", "R", "T", "Y", "U", "I", "I", "O", "P",
            "A", "S", "D", "F", "G", "H", "H", "J", "K", "L", "Ñ", "Z",
            "X", "C", "V", "B", "N", "M"
        };
        VectorPalabras vectorPalabras = new VectorPalabras(arregloPalabras);
        System.out.println("\nArreglo tal cual");
        System.out.print(vectorPalabras.mostrarArreglo());
        System.out.println("\nArreglo Ordenado con MergetShort: ");
        vectorPalabras.mergetPalabras(arregloPalabras, 0, arregloPalabras.length - 1);
        System.out.print(vectorPalabras.mostrarArreglo());

    }
}
