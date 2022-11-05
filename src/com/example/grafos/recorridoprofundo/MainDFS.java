package com.example.grafos.recorridoprofundo;


public class MainDFS {
    public static void main(String[] args) {
        // Creamos nuestros arreglos
        int[] estadoInicial = new int[]{4,2,3,1};
        int[] estadoFinal = new int[]{2,4,1,3};
        // Instanciamos nuestra clase que tiene el metodo del algoritmo
        DFS dfs = new DFS();
        // guardamos el resultado en nuestro objeto Nodo
        NodoDFS nodoSolucion = dfs.search(estadoInicial,estadoFinal).orElseThrow(NullPointerException::new);
        // imprimimos el resultado
        dfs.printPasoAPaso(nodoSolucion);

    }
}
