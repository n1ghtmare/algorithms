package Stacks;

import java.util.NoSuchElementException;

/**
 *
 * @author dimitar
 */
public class StackWithArray {
    private Object[] items;
    private int count;
    
    public StackWithArray(){
        items = new Object[1];
    }
    
    public void push(Object item){
        if(count == items.length){
            resize(items.length * 2);
        }
        items[count] = item;
        count++;        
    }
    
    public Object pop(){
        if(isEmpty()){
            throw new NoSuchElementException("Stack underflow");
        }        
        Object temp = items[--count];
        items[count] = null;
        if(items.length / 4 == count){
            resize(items.length / 2);
        }        
        return temp;
    }
    
    public boolean isEmpty(){
        return count == 0;
    }
    
    public void resize(int capacity){        
        Object[] tempArray = new Object[capacity];
        for(int i = 0;i < count; i++){
            tempArray[i] = items[i];
        }
        items = tempArray;
    }
        
    public Object peek(){
        return items[count-1];
    }
}
