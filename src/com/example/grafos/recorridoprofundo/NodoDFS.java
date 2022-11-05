package com.example.grafos.recorridoprofundo;

import java.util.Arrays;
import java.util.Objects;

public class NodoDFS {

    private int[] estado;
    private NodoDFS padre;

    public NodoDFS() {
    }

    public NodoDFS(int[] estado) {
        this.estado = estado;
    }
    public static NodoDFS add (int[] dato){
        return new NodoDFS(dato);
    }

    public int[] getEstado() {
        return estado;
    }

    public void setEstado(int[] estado) {
        this.estado = estado;
    }

    public NodoDFS getPadre() {
        return padre;
    }

    public void setPadre(NodoDFS padre) {
        this.padre = padre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodoDFS nodeDFS = (NodoDFS) o;
        return Arrays.equals(this.estado, nodeDFS.estado);
    }


    @Override
    public String toString() {
        return "NodoDFS{" +
                "estado=" + Arrays.toString(this.getEstado()) +
                '}';
    }
}
