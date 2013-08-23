package Common;

/**
 *
 * @author dimitar
 */
public class Simulate {
    public static void main(String[] args) {
        printFibonacci(17);
    }
    
    private static void printFibonacci(int n) {
        Common c = new Common();
        
        System.out.println(
                String.format("(Iterative) - The %d fibonacci number is: %d", 
                n, c.fibI(n)));
        
        System.out.println(
                String.format("(Recursive) - The %d fibonacci number is: %d", 
                n, c.fibR(n)));
        
        System.out.println(
                String.format("(Memorization) - The %d fibonacci number is: %d", 
                n, c.fibM(n)));
    }
}
