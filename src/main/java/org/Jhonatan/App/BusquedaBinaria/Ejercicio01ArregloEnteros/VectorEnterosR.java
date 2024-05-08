package org.Jhonatan.App.BusquedaBinaria.Ejercicio01ArregloEnteros;

public class VectorEnterosR {

    private final int arregloNumeros[];

    public VectorEnterosR(int[] arreglo) {
        this.arregloNumeros = arreglo;
    }

    //metodo recursivo para buscar un arreglo
    public int busquedaBinariaRecursiva(int numeros[], int izq, int der, int valor) {
        if (izq <= der) {
            int central = (izq + der) / 2;
            if (valor == numeros[central]) {
                return central;
            } else if (valor > numeros[central]) {
                return busquedaBinariaRecursiva(numeros, central + 1, der, valor);
            } else {
                return busquedaBinariaRecursiva(numeros, izq, central - 1, valor);
            }
        } else {
            return -1;
        }
    }

    public int busquedaBinariaRecursiva(int valor) {
        //aqui va un contador
        return busquedaBinariaRecursiva(arregloNumeros, 0, arregloNumeros.length - 1, valor);
    }

    public String mostrarArreglo() {
        String m = "";
        for (int i = 0; i < arregloNumeros.length; i++) {
            m += "[" + arregloNumeros[i] + "]";
        }
        return m;
    }

}
