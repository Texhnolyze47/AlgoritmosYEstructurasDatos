package com.example.recursividad;


public class MainArray {


    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[][] matrix = { { 3, 2, 1, 7 },
                { 9, 11, 5, 4 }};

        int numero = 4;

        printArray(array, 0, array.length);

        int index = search(array,0,array.length - 1, numero);

        if (index != -1 ){
            System.out.println("Element " + numero
                    + " is present at index "
                    + index);
        }

        printMatrix(matrix, 0, 0);

    }

    /**
     * Esta funcion se encarga de recorrer un array de forma recursiva
     * @param arr Es un array de enteros que necesita para saber que array debe recorrer
     * @param inicio Evita el desobordamiento de overflow
     * @param fin Es un iterardor que sirve para marca cuando debe parar la recursion
     */
    public static void printArray(int[] arr, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        System.out.println(arr[inicio] + " ");
        printArray(arr, inicio + 1, fin);
    }

    /**
     * Este funcion se encarga recorrer el array y encontrar
     * @param arr
     * @param inicio
     * @param fin
     * @param numero
     * @return
     */
    public static int search(int[] arr, int inicio, int fin, int numero){
        if (fin <  inicio){
            return -1;
        }
        if (arr[inicio] == numero){
            return inicio;
        }
        if (arr[fin] == numero){
            return fin;
        }
        return search(arr, inicio+1, fin-1, numero);
    }

    public static void printMatrix(int[][] mat, int i, int j) {
        if(mat==null){
            return;
        }
        if(i==mat.length || j==mat[0].length){
            return;
        }
        System.out.print(mat[i][j]+" ");
        if(j==mat[0].length-1){
            System.out.println();
            printMatrix(mat,i+1,0);
        }
        printMatrix(mat,i,j+1);
    }



}
