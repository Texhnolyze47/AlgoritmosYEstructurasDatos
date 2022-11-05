package com.example.grafos.recorridoanchura;

import java.util.Arrays;

/**
 * Esta clase usa para crear los nodos que vamos a usar en la Clase BFS
 */
public class NodoBFS {
    private int[] dato;
    private NodoBFS padre;

    @SuppressWarnings("unused")
    private NodoBFS() { }

    private NodoBFS(final int[] state) {
        this.dato = state;
    }

    static NodoBFS of(final int[] dato) {
        return new NodoBFS(dato);
    }

    int[] getDato() {
        return dato;
    }

    NodoBFS getPadre() {
        return padre;
    }

    void setPadre(final NodoBFS padre) {
        this.padre = padre;
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (objeto == null || getClass() != objeto.getClass()) {
            return false;
        }
        NodoBFS nodeBFS = (NodoBFS) objeto;
        return Arrays.equals(this.dato, nodeBFS.dato);

    }

    @Override
    public String toString() {
        return Arrays.toString(this.getDato());
    }
}
