/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;


/**
 *
 * @author dimitar
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        simulateLinkedListRemoveDuplicates();
    }
    
    private static void simulateLinkedListRemoveDuplicates(){
        LinkedListSinglyGeneric<Person> list = new LinkedListSinglyGeneric<Person>();
        Person p1 = new Person();
        p1.setName("Dimitar Dimitrov");
        p1.setAge(25);
        
        Person p2 = new Person();
        p2.setName("Denica Conkova");
        p2.setAge(25);
        
        Person p3 = new Person();
        p3.setName("Dimitar Dimitrov");
        p3.setAge(25);
        
        Person p4 = new Person();
        p4.setName("Dimitar Dimitrov");
        p4.setAge(25);
        
        list.append(p3);
        list.append(p1);
        list.append(p2);
        list.append(p4);
                
        removeLinkedListDuplicatesWithBuffer(list);
        //removeLinkedListDuplicates(list);
        NodeGeneric<Person> n = list.head;
        while(n != null){
            String nodeMessage = String.format("Person:: Name %s - Age %d", n.data.getName(), n.data.getAge());
            System.out.println(nodeMessage);
            n = n.next;
        }
    }
    
    // runs in O(n2) - quadratic
    // space = O(1) - constant
    private static void removeLinkedListDuplicates(LinkedListSinglyGeneric<Person> list){
        if(list.head != null){            
            NodeGeneric<Person> n = list.head;
            while(n != null){
                NodeGeneric<Person> temp = n;            
                while(temp.next != null) {
                    // if the data of both nodes is the same -> we have a duplicate
                    if(n.data.getName().equals(temp.data.getName()) && 
                            n.data.getAge() == temp.data.getAge()){
                        // this is a duplicate node, skip it and move 1 ahead
                        temp.next = temp.next.next;
                    }
                    temp = temp.next;                                        
                }
                n = n.next;
            }
        }
    }
    
    // runs in O(n) linear
    // space -> O(1)
    private static void removeLinkedListDuplicatesWithBuffer(LinkedListSinglyGeneric<Person> list){
        Hashtable table = new Hashtable();
        NodeGeneric<Person> n = list.head;
        NodeGeneric<Person> previous = null;
        while(n != null){            
            if(table.containsKey(n.data.getName())){
                // we've got a dup -> skip 1 ahead
                // can't be duplicated on the first iteration
                previous.next = n.next;
                
                // temp points to the previous n -> here we're setting the reference of the previous
                // to skip one (instead of pointing to the current -> it will point to the next)
            } else {
                table.put(n.data.getName(), true);
                
                // keep track of the previous entry
                previous = n;
            }
            n = n.next;
        }
    }
    
    private static void simulateLinkedList(){
        LinkedListSingly list = new LinkedListSingly();
        list.append(123, 123.4);
        list.append(3456, 3456.7);
        list.append(78910, 78910.11);
        
        list.printAllListData();
    }
    
    private static void simulateLinkedListGeneric(){
        LinkedListSinglyGeneric<Person> list = new LinkedListSinglyGeneric<Person>();
        Person p1 = new Person();
        p1.setName("Dimitar Dimitrov");
        p1.setAge(25);
        
        Person p2 = new Person();
        p2.setName("Denica Conkova");
        p2.setAge(25);
        
        list.append(p1);
        list.append(p2);
        
        NodeGeneric<Person> n = list.head;
        while(n != null){
            String nodeMessage = String.format("Person:: Name %s - Age %d", n.data.getName(), n.data.getAge());
            System.out.println(nodeMessage);
            n = n.next;
        }
    }
}
