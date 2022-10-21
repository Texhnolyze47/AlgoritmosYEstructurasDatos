package com.example.listas.exercises.pilasColas;

public class Pila {

    private Nodo ultimo;
    private int length;

    public Pila() {
        this.ultimo = null;
        this.length = 0;
    }

    public boolean Vacia() {

        if (ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public int longitud() {
        return length;
    }

    public Nodo ultimo() {
        return ultimo.getNext();
    }

    /**
     * Método que inserta un elemento de tipo genérico en la Pila.
     *
     * @param element: Elemento de tipo genérico.
     */
    public void insertar(int element) {
        Nodo aux = new Nodo(element, ultimo);
        ultimo = aux;
        length++;
    }

    /**
     * Método que vacía la Pila.
     */
    public void vaciar() {
        length = 0;

    }

    /**
     * Método que extrae el último elemento de la Pila.
     * @return: Último elemento de la Pila de tipo genérico.
     * @throws Exception :La pila está vacía.
     */
    public Nodo extraer() {
        if(Vacia()) {
            System.out.println("La pila está vacía");
        }

            Nodo element=ultimo.getNext();
            ultimo=ultimo.getNext();
            length--;
            return element;

    }

    /**
     * Método para imprimir los elementos de la Pila.
     *
     * @return: String(los elementos).
     */
    public void visualizar() {

        Nodo aux= ultimo;
        int i = 0;
        System.out.print("->");
        while(aux!=null) {
            System.out.print("[" + aux.getValue() + "]" + "->");
            aux = aux.getNext();
            i++;
        }
        System.out.println("null");

    }
}
