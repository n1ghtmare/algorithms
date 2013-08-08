/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BSTs;

/**
 *
 * @author dimitar
 */
public class BST<Key extends Comparable<Key>, Value> {
    public class Node {
        public Key key;
        public Value value;
        public Node left, right;
        public int count;
        
        public Node(Key key, Value value, int count){
            this.key = key;
            this.value = value;
            this.count = count;
        }
    }
    
    private Node root;
    
    public void put(Key key, Value value) {
        root = put(root, key, value);
    }
    
    // Average - O(lg n)
    // Worst - O(n) - if the nodes come in in an ordered way (the tree will be one-sided)
    private Node put(Node n, Key key, Value value){
        if(n == null){
            return new Node(key, value, 1);
        } else if(key.compareTo(n.key) > 0){
            n.right = put(n.right, key, value);
        } else if(key.compareTo(n.key) < 0){
            n.left = put(n.left, key, value);
        } else {
            n.value = value;
        }        
        // the count of the sides as well as the newly added node
        n.count = size(n.left) + size(n.right) + 1;
        return n;
    }
    
    // get's the number of nodes before k
    public int rank(Key key){
        return rank(root, key);
    }
    
    private int rank(Node n, Key key){
        if(n == null){
            return 0;
        } else if(key.compareTo(n.key) > 0) {
            return 1 + size(n.left) + rank(n.right, key);
        } else if(key.compareTo(n.key) < 0) {
            return rank(n.left, key);
        }
        return size(n.left);
    }
    
    public int size(){
        return size(root);
    }
    
    private int size(Node n){
        if(n == null) {
            return 0;
        }
        return n.count;
    }
    
    // Average O(lg n)
    // Worst - O(n)
    public Value get(Key key){
        Node n = get(root, key);
        if(n == null){
            return null;
        }
        return n.value;
    }
    
    // Average - O(lg n)
    // Worst - O(n)
    private Node get(Node n, Key key){
        if(n != null) {
            if(key.compareTo(n.key) > 0){
                return get(n.right, key);
            } else if(key.compareTo(n.key) < 0){
                return get(n.left, key);
            }
        }        
        return n;
    }
    
    public void deleteMin(){
        root = deleteMin(root);
    }
    
    private Node deleteMin(Node n){
        if(n.left == null){
            return n.right;
        }
        n.left = deleteMin(n.left);
        n.count = size(n.left) + size(n.right) + 1;
        return n;
    }
    
    public void delete(Key key){
        root = delete(root, key);
    }
    
    private Node delete(Node n, Key key){
        if(n == null) { 
            return null;
        }
        else if(key.compareTo(n.key) > 0) {
            n.right = delete(n.right, key);
        } 
        else if(key.compareTo(n.key) < 0){
            n.left = delete(n.left, key);
        } 
        else {
            if(n.left == null) { 
                return n.right;
            }
            if(n.right == null){
                return n.left;
            }
            Node temp = n;
            n = min(temp.right);
            n.right = deleteMin(temp.right);
            n.left = temp.left;
            return n;
        }
        n.count = size(n.left) + size(n.right) + 1;
        return n;
    }
    
    // Average - O(lg n)
    // Worst - O(n)
    public Key min(){
        Node n = min(root);
        return n.key;
    }
    
    private Node min(Node n){
        if(n.left == null) {
            return n;
        }
        return min(n.left);
    }

    // Average - O(lg n)
    // Worst - O(n)
    public Key max(){
        Node n = max(root);
        return n.key;
    }
    
    private Node max(Node n){
        if(n.right == null){
            return n;
        }
        return max(n.right);
    }
}
