/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 * LinkedList - Singly (non generic implementation)
 * @author dimitar
 */
public class LinkedListSingly {
    private Node head;
    
    public LinkedListSingly() {
        head = null;
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void append(int data1, double data2){
        Node node = new Node(data1, data2);
        // the previous head is now pushed down
        node.next = head;
        // the new node is now the head
        head = node;
    }
    
    public Node delete(){
        Node temp = head;
        head = head.next;
        // return the deleted node
        return temp;
    }
    
    public void printAllListData(){
        Node node = head;
        while(node != null){
            node.printContentData();
            node = node.next;
        }
        System.out.println("All done!");
    }
}
