package com.example.recursividad;

public class MainArray {

    public static void main(String[] args) {
        // declaracion de los arrays
        int[] array = new int[]{1, 2, 3, 4, 5};
        int[][] matrix = { { 3, 2, 1, 7 },
                { 9, 11, 5, 4 }};
        // numero que se busca en el array
        int numero = 4;

        System.out.println("Array");
        printArray(array, 0, array.length);
        // variable donde se guarda el index
        int index = search(array,0,array.length - 1, numero);
        // evita el index sea negativo
        if (index != -1 ){
            System.out.println("Numero " + numero
                    + " esta en el index "
                    + index);
        }

        System.out.println("Matrix");
        printMatrix(matrix, 0, 0);

    }

    /**
     * Esta funcion se encarga de recorrer un array de forma recursiva
     * @param arr Es un array de enteros que necesita para saber que array debe recorrer
     * @param inicio El iterador que rompe el ciclo de repetición
     * @param fin Es el punto que sirve para marca cuando debe parar la recursion
     */
    public static void printArray(int[] arr, int inicio, int fin) {
        if (inicio >= fin) {
            return;
        }
        System.out.println(arr[inicio] + " ");
        printArray(arr, inicio + 1, fin);
    }

    /**
     * Este funcion se encarga recorrer el array y encontrar un numero en especifico
     * @param arr Es un arreglo de enteros
     * @param inicio El iterador que rompe el ciclo de repetición
     * @param fin Es el punto que sirve para marca cuando debe parar la recursion
     * @param numero que busca en el array
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

    /**
     * Esta funcion sirve para imprimir una matrix
     * @param mat matrix de tipo int
     * @param inicio El iterador que rompe el ciclo de repetición
     * @param fin Es el punto que sirve para marca cuando debe parar la recursion
     */
    public static void printMatrix(int[][] mat, int inicio, int fin) {
        if(mat==null){
            return;
        }
        if(inicio==mat.length || fin==mat[0].length){
            return;
        }
        System.out.print(mat[inicio][fin]+" ");
        if(fin==mat[0].length-1){
            System.out.println();
            printMatrix(mat,inicio+1,0);
        }
        printMatrix(mat,inicio,fin+1);
    }



}
