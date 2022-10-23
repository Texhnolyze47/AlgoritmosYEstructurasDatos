package com.example.listas.exercises.cine;

public class ListaCine {
    private NodoCine cabeza;
    private NodoCine cola;
    private int length;

    public ListaCine() {
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
        NodoCine nuevoNodo = new NodoCine();
        nuevoNodo.setEdad(entrada);
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

    public void visualizarArriba() {
        if (!isEmpty()) {
            NodoCine aux = cabeza;
            int i = 0;
            double total = 0;
            do {
                System.out.print("Edad de la persona " + aux.getEdad() + " Precio a pagar " + aux.getPrecio());
                aux = aux.getNext();
                System.out.println("\n");
                total += aux.getPrecio(); 

                i++;
            } while (aux != cabeza);

            System.out.println("Total a recaudar " + total );

        }
    }
}
