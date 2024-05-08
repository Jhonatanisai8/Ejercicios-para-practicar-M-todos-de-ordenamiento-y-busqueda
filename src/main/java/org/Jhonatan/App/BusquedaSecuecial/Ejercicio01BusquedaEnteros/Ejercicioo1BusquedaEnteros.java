package org.Jhonatan.App.BusquedaSecuecial.Ejercicio01BusquedaEnteros;

public class Ejercicioo1BusquedaEnteros {

    public static void main(String[] args) {
        int arreglo[] = {5, 7, 8, 9, 3, 34, 532, 12, 422, 654, -3, -5, 86, 56};
        ArregloEntero arregloEntero = new ArregloEntero(arreglo);
        System.out.println("\nArreglo tal cual: ");
        System.out.print(arregloEntero.mostrarDatos());

        //elemento a buscar
        int elementoBuscar = -3;
        System.out.println("\n" + elementoBuscar + " " + arregloEntero.busqueda(elementoBuscar));

    }

}
