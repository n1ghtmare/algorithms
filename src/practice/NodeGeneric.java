/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author dimitar
 */
public class NodeGeneric<T> {
    public T data;
    public NodeGeneric<T> next;
    
    public NodeGeneric(T data){
        this.data = data;
    }
}
