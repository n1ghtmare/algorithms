package HashTables;

/**
 *
 * @author dimitar
 */
public class HashTableWithLinearProbing<Key, Value> {
    private int count = 0;
    private int capacity;
    private Key[] keys;
    private Value[] values;
    
    public HashTableWithLinearProbing(int capacity)
    {
        keys = (Key[]) new Object[capacity];
        values = (Value[]) new Object[capacity];
        this.capacity = capacity;
    }
    
    public void put(Key key, Value value) {
        if(count >= capacity / 2) {
            resize(capacity * 2);
        }
        
        int i;
        for(i = hash(key); keys[i] != null; i = (i + 1) % capacity) {
            // we already have this key, overwrite it with new value
            if(keys[i].equals(key)) {
                values[i] = value;
                return;
            }
        }
        keys[i] = key;
        values[i] = value;
        count++;        
    }
    
    public Value get(Key key) {
        for(int i = hash(key); keys[i] != null; i = (i + 1) % capacity) {
            if(keys[i].equals(key)) {
                return values[i];
            }
        }
        return null;
    }
    
    private int hash(Key key) {
        return (key.hashCode() & 0x7ffffff) % capacity;
    }
    
    private void resize(int n) {
        HashTableWithLinearProbing<Key, Value> temp = new HashTableWithLinearProbing<Key, Value>(n);
        
        for(int i = 0; i < capacity;i++) {
            if(keys[i] != null) {
                temp.put(keys[i], values[i]);
            }
        }
        
        keys = temp.keys;
        values = temp.values;
        capacity = temp.capacity;
    }
    
    public int size() {
        return count;
    }
    
}
