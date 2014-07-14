package HashTables;

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
    
    public boolean contains(Key key) {
        return get(key)!= null;
    }
    
    public void delete(Key key) {
        if(contains(key)) {
            int i = hash(key);
            while(!key.equals(keys[i])) {
                i = (i + 1) % capacity;
            }
            keys[i] = null;
            values[i] = null;
            i = (i + 1) % capacity;
            
            // move the keys/values if they have been previously probed
            while(keys[i] != null) {
                Key keyToRedo = keys[i];
                Value valueToRedo = values[i];
                keys[i] = null;
                values[i] = null;
                count--;
                put(keyToRedo, valueToRedo);
                
                i = (i + 1) % capacity;
            }
            count--;
            
            if(count > 0 && count == capacity / 8){
                resize(capacity/2);
            }
        }
    }
    
    public int size() {
        return count;
    }
    
}
