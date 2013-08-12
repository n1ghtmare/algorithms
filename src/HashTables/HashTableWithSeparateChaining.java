/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTables;

/**
 *
 * @author dimitar
 */
public class HashTableWithSeparateChaining<Key, Value> {
    private class Node<Key, Value> {
        private Key key;
        private Value value;
        private Node next;
    }
    
    private Node<Key, Value>[] data;
    private int capacity;
    
    public HashTableWithSeparateChaining(int capacity){
        this.capacity = capacity;
        data = (Node<Key, Value>[]) new Node[capacity];
    }
    
    public void put(Key key, Value value){        
        int hash = hash(key);        
        Node<Key, Value> runner = data[hash];
        Node<Key, Value> n = new Node<Key, Value>();
        n.key = key;
        n.value = value;
        
        if(runner != null){
            while(runner.next != null && runner.key != key) {
                runner = runner.next;          
            }
            if(runner.key == key) {
                runner.value = value;
            } else {
                runner.next = n;
            }            
        }
        else {
            data[hash] = n;
        }
        
    }
    
    public Value get(Key key){
        int hash = hash(key);
        
        Node<Key, Value> runner = data[hash];
        while(runner != null){
            if(runner.key == key) {
                return runner.value;
            }
            runner = runner.next;
        }
        return null;
    }
    
    private int hash(Key key){
        return (key.hashCode() & 0x7FFFFFFF) % capacity;
    }
}
