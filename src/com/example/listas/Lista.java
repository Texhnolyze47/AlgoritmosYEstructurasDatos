package com.example.listas;

public class Lista {
    private NodoPilasColas cabeza;
    private NodoPilasColas cola;
    private int length;

    public Lista() {
        cabeza = null;
        cola = null;
        length = 0;
    }

    public boolean isEmpty() {
        return cabeza == null;
    }


    /**
     * Este metodo llama al objeto Nodo para insertar un valor de tipo
     * int al inicio de la lista que recibira mediante un parametro
     *
     * @param entrada
     */
    public void insertarCabezaLista(int entrada) {
        NodoPilasColas nuevoNodo = new NodoPilasColas();
        nuevoNodo.setDato(entrada);
        if (isEmpty()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cola.setNext(cabeza);
        } else {
            cola.setNext(nuevoNodo);
            nuevoNodo.setNext(cabeza);
            cola = nuevoNodo;
        }
        length++;

    }

    /**
     * Este metodo llama al objeto Nodo para insertar un valor de tipo
     * int al final de la lista que recibira mediante un parametro
     *
     * @param entrada
     */
    public void insertarFinalLista(int entrada) {
        NodoPilasColas nuevoNodo = new NodoPilasColas(entrada);
        if (isEmpty()) {
            cola.setNext(nuevoNodo);
            nuevoNodo.setNext(cabeza);
            nuevoNodo.setPrevious(cola);
            cola = nuevoNodo;
            cabeza.setPrevious(cola);
        } else {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cabeza.setPrevious(nuevoNodo);
            cabeza.setNext(nuevoNodo);
        }
        length++;
    }

    /**
     * Metodo que se encarga de eliminar el ultimo nodo de la lista
     */
    public void borrarPrimero() {
        if (!isEmpty()){
            cabeza = cabeza.getNext();
            cabeza.setPrevious(cola);
            cola.setNext(cabeza);
            length--;
        }else {
            System.out.println("La lista esta vacia");
        }
    }

    /**
     * Este metodo se encarga de eliminar el ultimo nodo
     */

    public void borrarUltimo() {
        if (!isEmpty()){
            cola = cola.getPrevious();
            cola.setNext(cabeza);
            cabeza.setPrevious(cola);
            length--;
        }else {
            System.out.println("La lista esta vacia");
        }
    }

    public void visualizarArriba() {
        if (!isEmpty()) {
            NodoPilasColas aux = cabeza;
            int i = 0;
            System.out.print("->");
            do {
                System.out.print("[" + aux.getDato() + "]" + "->");
                aux = aux.getNext();
                i++;
            } while (aux != cabeza);
            System.out.println("null");
        }
    }


}


