/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Queues;

/**
 *
 * @author dimitar
 */
public class Simulate {
    public static void main(String[] args){
        simulateQueueWithLinkedList();
        simulateQueueWithArray();
    }
    
    private static void simulateQueueWithLinkedList(){
        QueueWithLinkedList q = new QueueWithLinkedList();        
        q.enqueue("Dimitar Dimitrov");
        q.enqueue("Denica Conkova");
        q.enqueue("Someone else");
        q.enqueue("Test");
        
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
    }
    
    private static void simulateQueueWithArray(){
        QueueWithArray q = new QueueWithArray();
        q.enqueue("Dimitar Dimitrov");
        q.enqueue("Denica Conkova");
        q.enqueue("Someone else");
        
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
    }
}
