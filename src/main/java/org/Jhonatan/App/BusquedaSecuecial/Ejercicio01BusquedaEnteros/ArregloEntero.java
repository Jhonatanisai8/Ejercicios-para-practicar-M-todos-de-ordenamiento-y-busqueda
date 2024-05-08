package org.Jhonatan.App.BusquedaSecuecial.Ejercicio01BusquedaEnteros;

public class ArregloEntero {

    private final int arregloEnteros[];

    public ArregloEntero(int[] arregloEnteros) {
        this.arregloEnteros = arregloEnteros;
    }

    private int busquedaSecuelcial(int vector[], int longitud, int valor) {
        if (longitud == 0) {
            return -1;
        } else if (valor == vector[longitud - 1]) {
            return longitud - 1;
        } else {
            return busquedaSecuelcial(vector, longitud - 1, valor);
        }
    }

    private int busquedaSecuelcial(int valor) {
        return busquedaSecuelcial(arregloEnteros, arregloEnteros.length, valor);
    }

    public String mostrarDatos() {
        String m = "";
        for (int i = 0; i < arregloEnteros.length; i++) {
            m += "[" + arregloEnteros[i] + "]";
        }
        return m;
    }

    public String busqueda(int dato) {
        int indice = busquedaSecuelcial(dato);
        if (indice != -1) {
            return "Elemento Encontrado en el indice: " + indice;
        } else {
            return "Elemento no encontrado";
        }
    }

}
