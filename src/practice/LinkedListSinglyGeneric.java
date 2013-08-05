/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author dimitar
 */
public class LinkedListSinglyGeneric<T> {
    public NodeGeneric<T> head;
    
    public LinkedListSinglyGeneric(){
        head = null;
    }
    
    public void append(T data) {
        if(data == null){
            throw new IllegalArgumentException("Can't pass a null value for data to the LinkedList");
        }
        NodeGeneric<T> node = new NodeGeneric<T>(data);
        node.next = head;
        head = node;
    }
    
    public NodeGeneric<T> delete(){
        NodeGeneric<T> temp = head;
        head = head.next;
        return temp;
    }
}
