package Queues;

public class LinkedList {
    public Node head;
    
    public void append(Node n){
        Node temp = head;
        head = n;
        head.next = temp;
    }
    
    public void appendToTail(Node n){
        Node runner = head;
        while(runner.next != null){
            runner = runner.next;
        }
        runner.next = n;
    }
}
