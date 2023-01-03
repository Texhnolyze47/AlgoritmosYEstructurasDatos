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
        List<Integer> lista = new ArrayList<Integer>();
        dfs(raiz, lista);
        return lista;
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
        List<Integer> lista = new ArrayList<>();
        Stack<NodeTree> pila = new Stack<>();
        NodeTree nodoActual = raiz;
        while (nodoActual != null || !pila.isEmpty()) {
            while (nodoActual != null) {
                pila.push(nodoActual);
                nodoActual = nodoActual.getIzquierda();
            }
            nodoActual = pila.pop();
            lista.add(nodoActual.getValor());
            nodoActual = nodoActual.getDerecha();
        }
        return lista;
    }

    /**
     * Los nodos son recorridos en el orden de izquierda, derecha, raíz
     *
     * @return regresa una lista con los valores ordenados
     */
    public List<Integer> postOrderIterative() {
        LinkedList<Integer> lista = new LinkedList<>();
        Stack<NodeTree> pila = new Stack<>();
        if (raiz == null)
            return lista;
        pila.push(raiz);
        while (!pila.isEmpty()) {
            NodeTree cur = pila.pop();
            lista.addFirst(cur.getValor());
            if (cur.getIzquierda() != null) {
                pila.push(cur.getIzquierda());
            }
            if (cur.getDerecha() != null) {
                pila.push(cur.getDerecha());
            }
        }
        return lista;
    }

    /**
     * Este metodo busca el nodo mas profundo del arbol
     * @return regresa un objeto NodeTree
     */
    private NodeTree getDeepestNode() {
        if (raiz == null) {
            System.out.println("El arbol esta vacio");
            return null;
        }
        NodeTree nodeActual = null;
        Queue<NodeTree> cola = new LinkedList<NodeTree>();
        cola.add(raiz);
        while (!cola.isEmpty()) {
            nodeActual = cola.remove();
            if (nodeActual.getIzquierda() != null) {
                cola.add(nodeActual.getIzquierda());
            }
            if (nodeActual.getDerecha() != null) {
                cola.add(nodeActual.getDerecha());
            }
        }
        return nodeActual;
    }


    /**
     * borra el nodo más profundo del arbol binario
     */
    private void deleteDeepestNode() {
        Queue<NodeTree> cola = new LinkedList<NodeTree>();
        cola.add(raiz);
        NodeTree nodeAnterior, nodoActual = null;
        while (!cola.isEmpty()) {
            nodeAnterior = nodoActual;
            nodoActual = cola.remove();
            if (nodoActual.getIzquierda() == null) {
                nodeAnterior.setDerecha(null);
                return;
            } else if (nodoActual.getDerecha() == null) {
                nodoActual.setIzquierda(null);
                return;
            }
            cola.add(nodoActual.getIzquierda());
            cola.add(nodoActual.getDerecha());
        }
    }

    /**
     * El método comienza verificando si el árbol está vacío, y si es así,
     * imprime un mensaje y devuelve control. De lo contrario, crea una cola de nodos y
     * agrega la raíz del árbol a la cola.
     * Luego entra en un ciclo while que continuará mientras la cola no esté vacía.
     * @param value
     */
    public void deleteNode(int value) {
        if (raiz == null) {
            System.out.println("El arbol esta vacio ");
            return;
        }
        Queue<NodeTree> cola = new LinkedList<NodeTree>();
        cola.add(raiz);
        while (!cola.isEmpty()) {
            NodeTree nodeActual = cola.remove();
            // if node is found then copy deepest node here and delete deepest node.
            if (nodeActual.getValor() == value) {
                nodeActual.setValor(getDeepestNode().getValor());
                deleteDeepestNode();
                return;
            }else {
                if (nodeActual.getIzquierda() != null)
                    cola.add(nodeActual.getIzquierda());
                if (nodeActual.getDerecha() != null)
                    cola.add(nodeActual.getDerecha());
            }
        }
        System.out.println("Se no ha encontrado el nodo");
    }
}
