package Graphs;

import java.util.Iterator;

/**
 *
 * @author dimitar
 */
public class LinkedListIterator<T> implements Iterator<T> {
    private Node<T> current;
    
    public LinkedListIterator(Node<T> root){
        this.current = root;
    }
    
    @Override
    public boolean hasNext() {
        return current != null;
    }
    
    @Override
    public T next(){
        Node<T> temp = current;
        current = current.next;
        return temp.data;
    }
    
    @Override
    public void remove(){
        // todo ...
    }
}
