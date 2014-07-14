package Graphs;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(root);
    }
    
    private Node<T> root;
    
    public void append(T data){
        Node<T> temp = root;
        root = new Node<T>(data);
        root.next = temp;
    }
    
    public void appendToTail(T data){
        root = put(root, data);
    }
    
    private Node put(Node n, T data){
        if(n == null){
            return new Node<T>(data);
        }
        else {
            n.next = put(n.next, data);
            return n;
        }
    }
}
