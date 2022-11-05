package com.example.grafos.recorridoanchura;

import com.example.grafos.recorridoprofundo.NodoDFS;
import com.example.listas.exercises.pilasColas.Nodo;

import java.util.*;

import static java.util.Objects.isNull;

public class BFS {
    private final Queue<NodoBFS> nodeBFS = new LinkedList<>();
    private final List<NodoBFS> visited = new LinkedList<>();

    Optional<NodoBFS> search(final int[] initialState, final int[] finalState) {
        if(isNull(initialState)) {
            throw new NullPointerException("initialState shouldn't be null");
        }
        if(isNull(finalState)) {
            throw new NullPointerException("finalState shouldn't be null");
        }
        boolean foundFinalState = false;
        Optional<NodoBFS> foundNode = Optional.empty();
        final NodoBFS root = NodoBFS.of(initialState);
        nodeBFS.add(root);

        while(!foundFinalState && nodeBFS.size() != 0) {
            final NodoBFS nodeDFS = this.nodeBFS.poll();
            visited.add(nodeDFS);
            if(Arrays.equals(nodeDFS.getDato(), finalState)) {
                foundFinalState = true;
                foundNode = Optional.of(nodeDFS);
            } else {
                int[] nodeState = nodeDFS.getDato();
                this.processChild(new int[]{nodeState[1],nodeState[0],nodeState[2],nodeState[3]}, nodeDFS);
                this.processChild(new int[]{nodeState[0],nodeState[2],nodeState[1],nodeState[3]}, nodeDFS);
                this.processChild(new int[]{nodeState[0],nodeState[1],nodeState[3],nodeState[2]}, nodeDFS);
            }
        }
        return foundNode;
    }

    private void processChild(final int[] state, final NodoBFS nodeDFS) {
        final NodoBFS nodeDFSChild = NodoBFS.of(state);
        nodeDFSChild.setPadre(nodeDFS);
        if(!this.nodeBFS.contains(nodeDFSChild) && !visited.contains(nodeDFSChild)) {
            this.nodeBFS.add(nodeDFSChild);
        }
    }


    public void printSolution(final NodoBFS solution) {
        boolean parentNull = false;
        NodoBFS actualNodeDFS = solution;
        final List<String> estados = new LinkedList<>();
        while(!parentNull) {
            estados.add(actualNodeDFS.toString());
            if(isNull(actualNodeDFS.getPadre())) {
                parentNull = true;
            }
            actualNodeDFS = actualNodeDFS.getPadre();
        }
        Collections.reverse(estados);
        System.out.println("Solution in: " + estados.size() + " levels [" + String.join(",", estados) + "] time: ");
    }
}
