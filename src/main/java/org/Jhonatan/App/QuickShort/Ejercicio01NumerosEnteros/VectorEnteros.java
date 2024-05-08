package org.Jhonatan.App.QuickShort.Ejercicio01NumerosEnteros;

public class VectorEnteros {

    private int arregloEnteros[];

    public VectorEnteros(int[] arregloEnteros) {
        this.arregloEnteros = arregloEnteros;
    }

    private void quicShort(int arreglo[], int primero, int ultimo) {
        int i, j, pivote, auxiliar, central;
        i = primero;
        j = ultimo;

        central = (primero + ultimo) / 2;
        pivote = arreglo[central];

        do {
            while (arreglo[i] < pivote) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }

            if (i <= j) {
                auxiliar = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = auxiliar;
                i++;
                j--;
            }
        } while (i <= j);

        if (primero < j) {
            quicShort(arreglo, primero, j);
        }

        if (i < ultimo) {
            quicShort(arreglo, i, ultimo);
        }
    }

    public void quickShortNumeros(int arreglo[]) {
        quicShort(arreglo, 0, arreglo.length - 1);
    }

    public String mostrarDatos() {
        String m = "";
        for (int i = 0; i < arregloEnteros.length; i++) {
            m += "[" + arregloEnteros[i] + "]";
        }
        return m;
    }
}
