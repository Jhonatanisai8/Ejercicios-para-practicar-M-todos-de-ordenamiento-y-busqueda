package org.Jhonatan.App.BusquedaSecuencial.Ejercicio02Concurencias;

public class Ejercicio02Concurencias {

    public static void main(String[] args) {
        int arregloEnteros[] = {5, 123, 123, 6, 5, 4, 3, 4, 7, 8, 9, 12, 3, 4, 5, 7, 8, 4, 123, 123, 123};
        VectorEnterosC enterosC = new VectorEnterosC(arregloEnteros);
        System.out.println("\nArreglo de enteros: ");
        System.out.print(enterosC.mostrar());

        int datoBuscar = 123;
        int ocurrecias = enterosC.buscarConcurencias(arregloEnteros, datoBuscar);
        System.out.println("\nEl dato se encuentra el arreglo: " + ocurrecias + " veces");
    }
}
