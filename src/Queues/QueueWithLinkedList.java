/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

/**
 *
 * @author dimitar
 */
public class QueueWithLinkedList {
    private Node first;
    private Node last;
    
    // O(1) - constant
    public void enqueue(Object data){
        Node n = new Node(data);
        if(first == null){
            first = n;
            last = first;
        } else {
            last.next = n;
            last = last.next;
        }
    }
    
    // O(1) - constant
    public Object dequeue(){
        if(!isEmpty()){
            Object data = first.data;
            first = first.next;
            return data;
        }        
        return null;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
}
