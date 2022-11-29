package com.example.arbol;

import java.util.*;

public class ArbolLinkedList {

    private NodeTree raiz;

    public ArbolLinkedList() {
        raiz = null;
    }

    /**
     * Este metodo se encarga de crear un nuevo modo mediante el parametro que
     * se recibe.
     *
     * @param valor es el valor que tomar el nuevo nodo
     */
    public void insertar(int valor) {
        // Aqui creamos un nodo con el valor re recibimos del parametro valor
        NodeTree nuevoNodo = new NodeTree(valor);
        // Una vez se guarda el valor en el nodo se hace una comprobacion sí
        // la raiz esta vacia en caso de que este vacia se le va a asignar el valor del nuevoNodo.
        if (raiz == null) {
            raiz = nuevoNodo;
            return;
        }
        // Este valor que tenemos de la raiz se va a guardar una cola.
        Queue<NodeTree> cola = new LinkedList<NodeTree>();
        cola.add(raiz);
        while (!cola.isEmpty()) {
            NodeTree nodoActual = cola.remove();
            if (nodoActual.getIzquierda() == null) {
                nodoActual.setIzquierda(nuevoNodo);
                break;
            } else if (nodoActual.getDerecha() == null) {
                nodoActual.setDerecha(nuevoNodo);
                break;
            } else {
                cola.add(nodoActual.getIzquierda());
                cola.add(nodoActual.getDerecha());
            }
        }

    }

    /**
     * Este metodo recorre el árbol en el orden de raíz, izquierda, derecha y crea un list
     * donde se va a guardar los numeros que conseguimos a traves del metodo dfs
     *
     * @return regresa una lista con los nodos usando el recorrido profundo
     */
    public List<Integer> preOrderRecursive() {
        List<Integer> list = new ArrayList<Integer>();
        dfs(raiz, list);
        return list;
    }

    /**
     * Este el metodo que se encarga buscar a y guardar en una lista todos los valores de los nodos
     *
     * @param nodo es dato de tipo NodeTree que usamos para crear uns lista con todos los datos
     * @param list es donde vamos a los valores de los nodos
     */
    public void dfs(NodeTree nodo, List<Integer> list) {
        if (nodo == null)
            return;
        list.add(nodo.getValor());
        dfs(nodo.getIzquierda(), list);
        dfs(nodo.getDerecha(), list);
    }

    /**
     * Recorre el árbol en el orden de raíz, izquierda, derecha
     *
     * @return regresa una lista con los valores ordenados
     */
    public List<Integer> inOrderIterative() {
        List<Integer> list = new ArrayList<>();
        Stack<NodeTree> pila = new Stack<>();
        NodeTree nodoActual = raiz;
        while (nodoActual != null || !pila.isEmpty()) {
            while (nodoActual != null) {
                pila.push(nodoActual);
                nodoActual = nodoActual.getIzquierda();
            }
            nodoActual = pila.pop();
            list.add(nodoActual.getValor());
            nodoActual = nodoActual.getDerecha();
        }
        return list;
    }

    /**
     * Los nodos son recorridos en el orden de izquierda, derecha, raíz
     *
     * @return regresa una lista con los valores ordenados
     */
    public List<Integer> postOrderIterative() {
        LinkedList<Integer> list = new LinkedList<>();
        Stack<NodeTree> stack = new Stack<>();
        if (raiz == null)
            return list;
        stack.push(raiz);
        while (!stack.isEmpty()) {
            NodeTree cur = stack.pop();
            list.addFirst(cur.getValor());
            if (cur.getIzquierda() != null) {
                stack.push(cur.getIzquierda());
            }
            if (cur.getDerecha() != null) {
                stack.push(cur.getDerecha());
            }
        }
        return list;
    }
}
