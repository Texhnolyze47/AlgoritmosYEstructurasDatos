package com.example.grafos.recorridoanchura;

import java.util.Arrays;

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
        return Arrays.toString(this.getDato());
    }
}
