package org.Jhonatan.App.QuickShort.Ejercicio02.ArregloCadenas;

public class VectorCadenas {

    private final String arregloCadenas[];

    public VectorCadenas(String arregloCadenas[]) {
        this.arregloCadenas = arregloCadenas;
    }

    private void quickShort(String arreglo[], int primero, int ultimo) {
        int i, j, central;
        String aux, pivote;
        i = primero;
        j = ultimo;

        central = (primero + ultimo) / 2;
        pivote = arreglo[central];

        do {
            while (arreglo[i].compareTo(pivote) < 0) {
                i++;
            }

            while (arreglo[j].compareTo(pivote) > 0) {
                j--;
            }

            //aqui hacemos el intercambio
            if (i <= j) {
                aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
                i++;
                j--;
            }

        } while (i <= j);
        //aqui hacemos el intercambio 
        if (primero < j) {
            quickShort(arreglo, primero, j);
        }
        if (i < ultimo) {
            quickShort(arreglo, i, ultimo);
        }
    }

    public void quickShortCadenas(String cadena[]) {
        quickShort(cadena, 0, cadena.length - 1);
    }

    public String mostrarDatos() {
        String m = "";
        for (String arregloCadena : arregloCadenas) {
            m += "[" + arregloCadena + "]";
        }
        return m;
    }

}
