package com.example.grafos.recorridoanchura;

import java.util.Arrays;

/**
 * Esta clase usa para crear los nodos que vamos a usar en la Clase BFS
 */
public class NodoBFS {
    private int[] dato;
    private NodoBFS padre;

    private NodoBFS() { }

    private NodoBFS(int[] dato) {
        this.dato = dato;
    }

    static NodoBFS of(int[] dato) {
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
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        NodoBFS nodeBFS = (NodoBFS) object;
        return Arrays.equals(this.dato, nodeBFS.dato);

    }

    @Override
    public String toString() {
        return "NodoBFS{" +
                "estado=" + Arrays.toString(this.getDato()) +
                '}';
    }
}
