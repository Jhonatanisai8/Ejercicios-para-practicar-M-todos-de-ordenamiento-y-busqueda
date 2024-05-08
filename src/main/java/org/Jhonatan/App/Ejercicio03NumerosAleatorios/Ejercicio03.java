package org.Jhonatan.App.Ejercicio03NumerosAleatorios;

public class Ejercicio03 {

    public static void main(String[] args) {
        int arreglo[] = new int[20];
        VectorNumerosAleatorios aleatorios = new VectorNumerosAleatorios(arreglo);
        //asignando datos al arreglo
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = aleatorios.numeroAleatorio();
        }

        System.out.println("\nDatos del arreglo Aleatorio: ");
        System.out.print(aleatorios.mostrarDatos());
        System.out.println("\nArreglo Ordenado por MergetShort: ");
        aleatorios.mergetNumeros(arreglo, 0, arreglo.length - 1);
        System.out.print(aleatorios.mostrarDatos());
    }

}
