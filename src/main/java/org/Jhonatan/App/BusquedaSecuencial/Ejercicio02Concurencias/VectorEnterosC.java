package org.Jhonatan.App.BusquedaSecuencial.Ejercicio02Concurencias;

public class VectorEnterosC {

    private final int arregloNumeros[];

    public VectorEnterosC(int[] arregloNumeros) {
        this.arregloNumeros = arregloNumeros;
    }

    public int buscarConcurencias(int arreglo[], int dato) {
        int ocurrencias = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == dato) {
                ocurrencias++;
            }
        }
        return ocurrencias;
    }

    public String mostrar() {
        String m = "";
        for (int i = 0; i < arregloNumeros.length; i++) {
            m += "[" + arregloNumeros[i] + "]";
        }
        return m;
    }
}
