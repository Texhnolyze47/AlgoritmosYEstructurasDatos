package com.example.recursividad.ejercicios2;


public class ValorMenorRecursiva {
    public static void main(String[] args) {
        int[] arr = {2,23,4,5,1,3};

        System.out.println(encontrarElMenor(arr,0,arr[0]));
    }

    /**
     * Este método se encarga de encontrar el número de un arreglo de
     * forma recursiva
     * @param arr es un arreglo de tipo int
     * @param indice es el numero que marca nuestro limite siempre debera ser 0
     * @param menor es la posición del número más pequeño del arreglo
     * @return regresa el número más pequeño de un array
     */
    public static int encontrarElMenor(int[] arr, int indice,int menor) {
        if (indice != arr.length) {
            if (arr[indice] < menor) {
                menor = encontrarElMenor(arr, indice + 1, arr[indice]);
            } else {
                menor = encontrarElMenor(arr, indice + 1, menor);
            }
        }
        return menor;

    }
}
