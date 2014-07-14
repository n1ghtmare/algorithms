package Graphs;

public class Queue<T> {
    private Node<T> first, last;
    
    public void enqueue(T data){
        if(first == null){
            first = new Node<T>(data);
            last = first;
        }
        else {
            last.next = new Node<T>(data);
            last = last.next;
        }
    }
    
    public T dequeue(){
        if(first != null){
            Node<T> temp = first;            
            first = first.next;
            return temp.data;
        }
        return null;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
}
