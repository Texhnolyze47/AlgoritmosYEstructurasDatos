package com.example.grafos.recorridoanchura;

public class MainBFS {
    public static void main(String[] args) {
        // Creamos nuestros arreglos
        int[] estadoInicial = new int[]{4,2,3,1};
        int[] estadoFinal = new int[]{1,2,3,4};

        // Instanciamos nuestra clase que tiene el metodo del algoritmo
        BFS bfs = new BFS();
        // guardamos el resultado en nuestro objeto Nodo
        NodoBFS nodeDFSSolucion = bfs.search(estadoInicial, estadoFinal).orElseThrow(NullPointerException::new);
        // imprimimos el resultado
        bfs.printPasoAPaso(nodeDFSSolucion);
    }
}
