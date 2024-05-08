package org.Jhonatan.App.Ejercicio01OrdenarEnteros;

public class VectorEnteros {

    private int arregloEnteros[];

    public VectorEnteros(int[] arregloEnteros) {
        this.arregloEnteros = arregloEnteros;
    }

    public int[] mergetNumeros(int arreglo[], int izq, int dere) {
        int mitad;
        if (izq < dere) {
            mitad = (izq + dere) / 2;
            mergetNumeros(arregloEnteros, izq, mitad);
            mergetNumeros(arreglo, mitad + 1, dere);
            mergetShort(arreglo, izq, mitad, dere);
        }
        return arreglo;
    }

    private void mergetShort(int arreglo[], int izquierda, int mitad, int derecha) {
        int auxiliar[] = new int[arreglo.length];
        int i, j, k;
        for (i = izquierda; i <= derecha; i++) {
            auxiliar[i] = arreglo[i];
        }

        i = izquierda;
        j = mitad + 1;
        k = izquierda;

        while (i <= mitad && j <= derecha) {
            if (auxiliar[i] <= auxiliar[j]) {
                arreglo[k++] = auxiliar[i++];
            } else {
                arreglo[k++] = auxiliar[j++];
            }
        }

        while (i <= mitad) {
            arreglo[k++] = auxiliar[i++];
        }
    }

    public String mostrarArreglo() {
        String m = "";
        for (int i = 0; i < arregloEnteros.length; i++) {
            m += "[" + arregloEnteros[i] + "]";
        }
        return m;
    }

}
