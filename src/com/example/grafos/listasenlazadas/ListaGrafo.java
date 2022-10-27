package com.example.grafos.listasenlazadas;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListaGrafo {
    private ArrayList<LinkedList<NodoGrafo>> lista;
    public ListaGrafo() {
        lista = new ArrayList<>();
    }

    /**
     * Este es el metodo que se encarga de agregar un nodo
     * a una lista en enlazada y meter esta lista a un Arraylist
     * @param nodo este tiene un valor de tipo int
     */

    public void addNodo(NodoGrafo nodo) {
        // Se crea un a lista enlazada con un objeto
        LinkedList <NodoGrafo> listaActual = new LinkedList<>();
        // la lista enlazada agrega el nodo dentro de ella
        listaActual.add(nodo);
        // la lista con el nodo se agrega en el arrayList
        lista.add(listaActual);
    }

    /**
     * Este metodo se encarga de hacer la conexiones entre los nodos
     * @param src la posicion del valor con el que va a iniciar la conexion
     * @param dst la posicion del valor con el que va a conectar el primer nodo
     */
    public  void addVertice(int src, int dst){
        // Se busca nodo en la posicion que se nos indica en el src
        LinkedList <NodoGrafo> listaActual = lista.get(src);
        // se busca el nodo de destino
        NodoGrafo dstNodo = lista.get(dst).get(0);
        // se agrega el nodo dentro de la lista enlazada
        listaActual.add(dstNodo);
    }

    /**
     * Se encarga de verificar si hay un conexion entre dos nodos
     * @param src la posicion del primer nodo
     * @param dst la posicion del segundo nodo
     * @return sí existe la conexion
     */
    public boolean verificarVertice(int src, int dst) {
        LinkedList<NodoGrafo> listaActual = lista.get(src);
        NodoGrafo dstNodo = lista.get(dst).get(0);

        for (NodoGrafo nodo : listaActual) {
            if (nodo == dstNodo) {
                return true;
            }
        }
        return false;
    }

    /**
     * Este metodo simplemente se encarga de imprimir la lista enlazada
     */
    public void print(){
        for (LinkedList<NodoGrafo> listaActual: lista) {
            for ( NodoGrafo nodo: listaActual) {
                System.out.print(nodo.getDato() + " -> ");
            }
            System.out.println("null");
        }
    }
}


