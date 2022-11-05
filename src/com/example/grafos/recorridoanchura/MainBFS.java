package com.example.grafos.recorridoanchura;

public class MainBFS {
    public static void main(String[] args) {
        int[] estadoInicial = new int[]{4,2,3,1};
        int[] estadoFinal = new int[]{1,2,3,4};

        final BFS bfs = new BFS();
        final NodoBFS nodeDFSSolucion = bfs.search(estadoInicial, estadoFinal).orElseThrow(NullPointerException::new);

        bfs.printSolution(nodeDFSSolucion);

    }
}
