package Queues;

public class QueueWithArray {
    private Object[] items = new Object[1];
    private int count;
    private int first;
    private int last;
    
    public void enqueue(Object data){
        if(count == items.length){
            resize(items.length * 2);
        }
        items[last] = data;
        last++;
        count++;
    }
    
    public Object dequeue(){
        if(isEmpty()){
            return null;
        }
        Object data = items[first];
        items[first] = null;
        first++;
        count--;
        
        if(count == items.length / 4){
            resize(items.length / 2);
        }        
        return data;
    }
    
    private void resize(int capacity){
        // precondition (should never happen)
        assert capacity > count;
        
        Object[] temp = new Object[capacity];
        for(int i = 0; i < count; i++){
            temp[i] = items[first + i];
        }
        items = temp;
        first = 0;
        last = count;        
    }
    
    public boolean isEmpty(){
        return count == 0;
    }
}
