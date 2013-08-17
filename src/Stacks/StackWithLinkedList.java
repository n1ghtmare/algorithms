package Stacks;

import java.util.NoSuchElementException;

/**
 *
 * @author dimitar
 */
public class StackWithLinkedList {
    private Node top;
    
    public void push(Object item){
        Node n = new Node(item);
        n.next = top;
        top = n;
    }
    
    public Object pop(){
        if(top == null){
            throw new NoSuchElementException("Stack underflow");
        }
        Object item = top.data;
        top = top.next;        
        return item;                
    }
    
    public Object peek(){
        return top.data;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
}
