package com.example.listas.exercises.pilasColas;

public class Cola {

    private Nodo primero;
    private Nodo ultimo;


    private int length;
    /**
     * Constructor con la Cola vacia
     */
    public Cola() {
        primero=null;
        ultimo=null;
        length =0;
    }
    /**
     * Método que comprueba si la Cola está vacía o no.
     * @return: True si está vacía, false si no.
     */
    public boolean isVacia() {

        if(primero==null) {
            return true;
        }else {
            return false;
        }
    }
    /**
     * Método que devuelve el numero de elementos que hay en la pila.
     * @return: int.
     */
    public int longitud() {
        int cont=0;
        Nodo aux=primero;
        while(aux!=null) {
            aux=aux.getNext();
            cont++;
        }
        return cont;
    }

    /**
     * Método que vacia la cola.
     */
    public void vaciar() {
        primero=null;
    }
    /**
     * Método que inserta un elemento de tipo genérico en la Cola.
     * @param element: Elemento de tipo genérico.
     */
    public void insertar(int element) {

        Nodo aux= new Nodo(element, null);

        if(isVacia()) {
            primero=aux;
            ultimo=aux;
        }else {
            if(longitud()==1) {
                primero.setNext(aux);
                ultimo=aux;

            }else {
                ultimo.setNext(aux);
                ultimo=aux;
            }

        }
        length++;



    }
    /**
     * Método que extrae un elemento de la Cola.
     */
    public void extraer() {

        if(isVacia()) {
            System.out.println("la cola está vacía");
        }else {
            Nodo aux= primero.getNext();
            primero=null;
            primero=aux;
            length--;

        }

    }

    public void visualizar() {

        Nodo aux= primero;
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
