package com.example.grafos.recorridoprofundo;

import java.util.Arrays;

/**
 * Esta clase usa para crear los nodos que vamos a usar en la Clase DFS
 */
public class NodoDFS {

    private int[] estado;
    private NodoDFS padre;

    public NodoDFS() {
    }

    /**
     * Constructor que se encarga de guadar los dos dentro del nodo
     * @param estado arreglos de int
     */
    public NodoDFS(int[] estado) {
        this.estado = estado;
    }

    /**
     * Metodo que crea los nodos
     * @param dato arreglos de int
     * @return regresa un objeto
     */
    public static NodoDFS add (int[] dato){
        return new NodoDFS(dato);
    }

    // Metodos getters y setters
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

    /**
     * Este metodo comprueba
     */
    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }
        if (objeto == null || getClass() != objeto.getClass()) {
            return false;
        }
        NodoDFS nodeDFS = (NodoDFS) objeto;
        return Arrays.equals(this.estado, nodeDFS.estado);
    }


    @Override
    public String toString() {
        return "NodoDFS{" +
                "estado=" + Arrays.toString(this.getEstado()) +
                '}';
    }
}
