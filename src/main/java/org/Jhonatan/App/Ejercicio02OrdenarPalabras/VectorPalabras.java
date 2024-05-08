package org.Jhonatan.App.Ejercicio02OrdenarPalabras;

public class VectorPalabras {

    private final String arregloPalabras[];

    public VectorPalabras(String[] arregloPalabras) {
        this.arregloPalabras = arregloPalabras;
    }

    public String[] mergetPalabras(String arreglo[], int izq, int dere) {
        int mitad;
        if (izq < dere) {
            mitad = (dere + izq) / 2;
            mergetPalabras(arreglo, izq, mitad);
            mergetPalabras(arreglo, mitad + 1, dere);
            mergetSort(arreglo, izq, mitad, dere);
        }
        return arreglo;
    }

    private void mergetSort(String arreglo[], int izq, int mitad, int dere) {
        String auxiliar[] = new String[arreglo.length];
        int i, j, k;
        for (i = izq; i <= dere; i++) {
            auxiliar[i] = arreglo[i];
        }

        i = izq;
        j = mitad + 1;
        k = izq;

        while (i <= mitad && j <= dere) {
            if (auxiliar[i].compareTo(auxiliar[j]) < 0) {
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
        for (String arregloPalabra : arregloPalabras) {
            m += "[" + arregloPalabra + "]";
        }
        return m;
    }

}
