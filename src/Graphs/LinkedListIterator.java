/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
    public boolean hasNext() {
        return current != null;
    }
    
    public T next(){
        Node<T> temp = current;
        current = current.next;
        return temp.data;
    }
    
    public void remove(){
        // todo ...
    }
}
