/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTables;

/**
 *
 * @author dimitar
 */
public class HashTableNaive<Key, Value> {
    private int capacity;
    private Value[] data;

    public HashTableNaive(int capacity){
        this.capacity = capacity;
        this.data = (Value[]) new Object[capacity];
        
    }
    
    // No collision handling strategy ... if the hash function produces the same hash
    // the data would be overriden
    public void put(Key key, Value value){
        int hashIndex = hash(key);
        data[hashIndex] = value;
    }
    
    public Value get(Key key){
        int hashIndex = hash(key);
        return data[hashIndex];
    }
    
    private int hash(Key key){
        // make sure you don't get negative numbers (Java's default implementation)
        return (key.hashCode() & 0x7FFFFFFF) % capacity;
    }
}
