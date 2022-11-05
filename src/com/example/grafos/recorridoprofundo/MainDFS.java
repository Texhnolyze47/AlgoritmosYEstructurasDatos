package com.example.grafos.recorridoprofundo;


public class MainDFS {
    public static void main(String[] args) {
        int[] estadoInicial = new int[]{4,2,3,1};
        int[] estadoFinal = new int[]{2,4,1,3};

        DFS dfs = new DFS();
        NodoDFS nodoSolucion = dfs.search(estadoInicial,estadoFinal).orElseThrow(NullPointerException::new);
        dfs.printPasoAPaso(nodoSolucion);

    }
}
