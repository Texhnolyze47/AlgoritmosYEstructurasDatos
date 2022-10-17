package com.example.listas;

public class Lista {
    private Nodo cabeza;
    private Nodo cola;
    private int length;



    public Lista() {
        cabeza = null;
        cola = null;
        length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }
    /**
     * Este metodo llama al objeto Nodo para insertar un valor de tipo
     * int que recibira mediante un parametro
     * @param entrada
     */
    public void insertarCabezaLista(int entrada) {
        Nodo nuevoNodo = new Nodo(entrada);
        if (isEmpty()){
            cola = nuevoNodo;
        } else {
            cabeza.setPrevious(nuevoNodo);
        }
        nuevoNodo.setNext(cabeza);
        cabeza = nuevoNodo;
        length++;

    }

    /**
     * Este metodo llama al objeto Nodo para insertar un valor de tipo
     * int que recibira mediante un parametro
     * @param entrada
     */
    public void insertarFinalLista(int entrada) {
        Nodo nuevoNodo = new Nodo(entrada);
        if (isEmpty()){
            cabeza = nuevoNodo;
        } else {
            cola.setNext(nuevoNodo);
            nuevoNodo.setPrevious(cola);
        }
        cola = nuevoNodo;
        length++;
    }

    public void visualizarArriba() {
        if (cabeza == null){
            return;
        }
        Nodo aux = cabeza;
        while (aux != null){
            System.out.print(aux.getDato()+" -->");
            aux = aux.getNext();
        }
        System.out.println("null");
    }


    public void visualizarAbajo() {
        if (cabeza == null){
            return;
        }
        Nodo aux = cola;
        while ( aux != null){
            System.out.print(aux.getDato() + "-->");
            aux = aux.getPrevious();
        }
        System.out.println("null");
    }

}


