package org.Jhonatan.App.BusquedaSecuencial.Ejercicio03ArregloCadenas;

public class ArregloCadenasB {

    private final String arregloCadenas[];

    public ArregloCadenasB(String[] arregloCadenas) {
        this.arregloCadenas = arregloCadenas;
    }

    private int busquedaSecuencial(String arreglo[], int longitud, String valor) {
        if (longitud == 0) {
            return -1;
        } else if (valor.equalsIgnoreCase(arreglo[longitud - 1])) {
            return longitud - 1;
        } else {
            return busquedaSecuencial(arreglo, longitud - 1, valor);
        }
    }

    private int busquedaSecuencial(String valor) {
        return busquedaSecuencial(arregloCadenas, arregloCadenas.length, valor);
    }

    public String busqueda(String dato) {
        int indice;
        indice = busquedaSecuencial(dato);
        if (indice != -1) {
            return "\nElemento" + dato + " encontrado en el indice: " + indice;
        } else {
            return "\nElemento no encontrado";
        }
    }

    public String mostrarDatos() {
        String m = "";
        for (String arregloCadena : arregloCadenas) {
            m += "[" + arregloCadena + "]";
        }
        return m;
    }
}
