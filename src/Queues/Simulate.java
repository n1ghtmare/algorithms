package Queues;

public class Simulate {
    public static void main(String[] args){
        simulateQueueWithLinkedList();
        simulateQueueWithArray();
    }
    
    private static void simulateQueueWithLinkedList(){
        QueueWithLinkedList q = new QueueWithLinkedList();        
        q.enqueue("Entry 1");
        q.enqueue("Entry 2");
        q.enqueue("Entry 3");
        q.enqueue("Entry 4");
        
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
    }
    
    private static void simulateQueueWithArray(){
        QueueWithArray q = new QueueWithArray();
        q.enqueue("Entry 1");
        q.enqueue("Entry 2");
        q.enqueue("Entry 3");
        q.enqueue("Entry 4");
        
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.isEmpty());
    }
}
