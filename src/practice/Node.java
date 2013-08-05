
package practice;

/**
 * A linked list (singly) practice implementation
 * @author dimitar
 */
public class Node {
    public int data1;
    public double data2;
    public Node next;
    
    public Node(int data1, double data2){
        this.data1 = data1;
        this.data2 = data2;
    }
    
    public void printContentData(){
        String contentData = String.format("Data1: %d - Data2: %s", data1, data2);
        System.out.println(contentData);
    }
}
