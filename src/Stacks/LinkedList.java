package Stacks;

public class LinkedList {
    public Node head;
    
    // Running time: O(1)
    public void append(Node n){
        Node temp = head;
        head = n;
        head.next = temp;
    }
    
    // Running time: O(n)
    public void appendToTail(Node n){
        Node runner = head;
        while(runner.next != null){            
            runner = runner.next;
        }
        runner.next = n;
    }
}
