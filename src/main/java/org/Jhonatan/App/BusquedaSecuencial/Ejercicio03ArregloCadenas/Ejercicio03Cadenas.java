package org.Jhonatan.App.BusquedaSecuencial.Ejercicio03ArregloCadenas;

public class Ejercicio03Cadenas {

    public static void main(String[] args) {
        String arregloPalabras[] = {
            "Q", "W", "E", "R", "T", "Y", "U", "I", "I", "O", "P",
            "A", "S", "D", "F", "G", "H", "H", "J", "K", "L", "Ñ", "Z",
            "X", "C", "V", "B", "N", "M"
        };

        ArregloCadenasB arregloCadenasB = new ArregloCadenasB(arregloPalabras);
        System.out.println("\nDatos del arreglo: ");
        System.out.print(arregloCadenasB.mostrarDatos());
    
        
        String elemento = "R";
        System.out.println(arregloCadenasB.busqueda(elemento));
    }

}
