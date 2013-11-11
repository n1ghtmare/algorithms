package Common;

/**
 *
 * @author dimitar
 */
public class Common {
    // Recursive Fibonacci computation
    // Running time - O(2^n)
    // Space - O(n)
    public int fibR(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("Must be a non-negative number");
        }        
        if(n == 0) { return 0; }
        if(n == 1) { return 1; }
        return fibR(n - 1) + fibR(n - 2);
    }
    
    // Iterative Fibonacci computation
    // Running time - O(n)
    // Space - O(1)
    public int fibI(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("Must be a non-negative number");
        }
        
        if(n == 0) { return 0; }
        if(n == 1) { return 1; }
        
        int[] a = new int[n + 1];
        a[1] = 1;
        a[2] = 2;
        for(int i = 2; i <= n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }        
        return a[n];
    }
    
    // Iterative Fibonacci computation v2
    // Runnint time - O(n)
    // Space - O(1)
    public int fibI2(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("Must be a non-negative number");
        }
        
        if(n == 0) { return 0; }
        if(n == 1) { return 1; }
        
        int p1 = 1;
        int p2 = 2;
        int result = 0;
        
        for(int i = 2; i < n; i++) {
        	result = p1 + p2;
        	p1 = p2;
        	p2 = result;
        }
        return result;
    }
    
    // Cached (Memorization) Fibonacci computation
    // Running time = O(n)
    // Space - O(n)
    // Note - cache size should be configurable
    private int[] cache = new int[100000];
    public int fibM(int n) {
        if(n < 0) {
            throw new IllegalArgumentException("Must be a non-negative number");
        }
        
        if(n == 0) { return 0; }
        if(n == 1) { return 1; }
        
        if(cache[n] != 0) {
            // return cached result
            return cache[n];
        }
        // cache the result
        cache[n] = fibM(n - 1) + fibM(n - 2);
        return cache[n];
    }
}
