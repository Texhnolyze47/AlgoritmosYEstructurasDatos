package com.example.arbol;

public class NodeTree {
    private int valor;
    private NodeTree izquierda, derecha;

    public NodeTree(int valor) {
        this.valor = valor;
    }

    public NodeTree(int valor, NodeTree izquierda, NodeTree derecha) {
        this.valor = valor;
        this.izquierda = izquierda;
        this.derecha = derecha;
    }

    public int getValor() {
        return valor;
    }

    public NodeTree getIzquierda() {
        return izquierda;
    }

    public NodeTree getDerecha() {
        return derecha;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setIzquierda(NodeTree izquierda) {
        this.izquierda = izquierda;
    }

    public void setDerecha(NodeTree derecha) {
        this.derecha = derecha;
    }


}
