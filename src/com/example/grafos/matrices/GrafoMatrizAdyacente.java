package com.example.grafos.matrices;

public class GrafoMatrizAdyacente {
    private int size;
    private int [][] matriz;

    /**
     * Este es el constructor de la clase aqui se crea la matriz
     * y se llena de ceros la matriz
     * @param sizeMatriz es el tamaño de la matriz
     */
    public GrafoMatrizAdyacente(int sizeMatriz){
        size = sizeMatriz;
        matriz = new int[size][size];
        for (int i = 0; i < sizeMatriz; i++) {
            for (int j = 0; j < sizeMatriz; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    /**
     * Este es un método que se encarga de colocar un dato en una posición especifica
     * @param i esta es la posicion en el eje x de la matriz
     * @param j esta es la posicion en el eje y de la matriz
     * @param valor el dato que va tomar
     */
    public void agregar(int i,int j,int valor){
        matriz[i][j] = valor;
    }

    /**
     * Este metodo se encarga de "eliminar" un valor segun la posicion que se le indique
     * @param i esta es la posicion en el eje x de la matriz
     * @param j esta es la posicion en el eje y de la matriz
     */
    public void remover(int i, int j){
        if (matriz[i][j] > 0) {
            matriz[i][j] = 0;
        }
    }

    /**
     * Este metoodo se encarga que recorrer la matriz e imprimir los valores dentro de la matriz
     */
    public void imprimir(){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
