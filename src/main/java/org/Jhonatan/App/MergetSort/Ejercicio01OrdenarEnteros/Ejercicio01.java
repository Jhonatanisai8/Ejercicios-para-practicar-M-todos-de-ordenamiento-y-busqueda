package org.Jhonatan.App.MergetSort.Ejercicio01OrdenarEnteros;

public class Ejercicio01 {

    public static void main(String[] args) {

        int vectorEnteros[] = {6, 7, 2, 3, 4, 7, 6, 12, -12, 46, 87, 66, 55, 33, 90};
        VectorEnteros arregloEnteros = new VectorEnteros(vectorEnteros);
        System.out.println("\nArreglo tal cual: ");
        System.out.print(arregloEnteros.mostrarArreglo());
        System.out.println("\nArreglo Ordenado Metodo MergetSort;");
        arregloEnteros.mergetNumeros(vectorEnteros, 0, vectorEnteros.length - 1);
        System.out.print(arregloEnteros.mostrarArreglo());

    }

}
