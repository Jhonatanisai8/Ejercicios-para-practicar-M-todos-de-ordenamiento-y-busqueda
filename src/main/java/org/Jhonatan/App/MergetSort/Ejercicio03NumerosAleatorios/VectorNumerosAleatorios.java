package org.Jhonatan.App.MergetSort.Ejercicio03NumerosAleatorios;

public class VectorNumerosAleatorios {

    private final int vectorNumeros[];

    public VectorNumerosAleatorios(int[] vectorNumeros) {
        this.vectorNumeros = vectorNumeros;
    }

    public int numeroAleatorio() {
        return (int) (Math.floor(Math.random()*(100-1+1)+100));
    }

    public int[] mergetNumeros(int arreglo[], int izq, int dere) {
        int mitad;
        if (izq < dere) {
            mitad = (izq + dere) / 2;
            mergetNumeros(arreglo, izq, mitad);
            mergetNumeros(arreglo, mitad + 1, dere);
            merget(arreglo, izq, mitad, dere);
        }
        return arreglo;
    }

    private void merget(int arreglo[], int izq, int mitad, int dere) {
        int aux[] = new int[arreglo.length];
        int i, j, k;

        for (i = izq; i <= dere; i++) {
            aux[i] = arreglo[i];
        }
        i = izq;
        j = mitad + 1;
        k = izq;

        while (i <= mitad && j <= dere) {
            if (aux[i] <= aux[j]) {
                arreglo[k++] = aux[i++];
            } else {
                arreglo[k++] = aux[j++];
            }
        }

        while (i <= mitad) {
            arreglo[k++] = aux[i++];
        }
    }

    public String mostrarDatos() {
        String m = "";
        for (int i = 0; i < vectorNumeros.length; i++) {
            m += "[" + vectorNumeros[i] + "]";
        }
        return m;
    }
}
