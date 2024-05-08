package org.Jhonatan.App.QuickShort.Ejercicio01NumerosEnteros;

public class Ejercicio01Quick {

    public static void main(String[] args) {
        int vectorEnteros[] = {5, 7, 8, 3, 2, 11, 33, 2, 1, 0, -4, -23, -76, -4, 23, 45, 55};
        VectorEnteros enteros = new VectorEnteros(vectorEnteros);
        System.out.println("\nMostrando el arreglo tal cual: ");
        System.out.print(enteros.mostrarDatos());
        System.out.println("\nMostrando arreglo ordenado por metodo quickShort: ");
        enteros.quickShortNumeros(vectorEnteros);
        System.out.print(enteros.mostrarDatos());

    }

}
