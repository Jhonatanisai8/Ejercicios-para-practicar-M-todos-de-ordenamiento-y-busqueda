package org.Jhonatan.App.BusquedaBinaria.Ejercicio01ArregloEnteros;

public class Ejercicio01 {

    public static void main(String[] args) {
        int arregloEnteros[] = {3, 5, 6, 7, 2, 12, -1, 5, 4, 90};
        VectorEnterosR enterosR = new VectorEnterosR(arregloEnteros);
        System.out.println("\nDatos del arreglo: ");
        System.out.print(enterosR.mostrarArreglo());
        int dato = 3;

        int indice = enterosR.busquedaBinariaRecursiva(dato);
        if (indice != -1) {
            System.out.println("\nEncontrado :)");
        } else {
            System.out.println("\nNo encontrado :(");
        }

    }
}
