/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticeStacks;

/**
 *
 * @author dimitar
 */
public class PracticeStacks {
    public static void main(String[] args){
        simulateStackLinkedList();
    }
    
    private static void simulateStackLinkedList(){
        StackWithLinkedList stack = new StackWithLinkedList();
        stack.push("test");
        stack.push("test2");
        
        System.out.println(stack.peek());
        stack.pop();
        
        System.out.println(stack.peek());
        stack.pop();
        
        // will return true at this point
        System.out.println(stack.isEmpty());
        
        // should throw an exception
        stack.pop();
    }
    
    private static void simulateStackArray(){
        StackWithArray stack = new StackWithArray();
        stack.push("test");
        stack.push("test2");
        
        System.out.println(stack.peek());
        stack.pop();
        
        System.out.println(stack.peek());
        stack.pop();
        
        // will return true at this point
        System.out.println(stack.isEmpty());
        
        // should throw an exception
        stack.pop();
    }
}
