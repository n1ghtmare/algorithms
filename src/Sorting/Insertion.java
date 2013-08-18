package Sorting;

/**
 *
 * @author dimitar
 */
public class Insertion implements ISortingAlgorithm {
    // Space O(1) - constant
    // Swaps O(n^2) - linear
    // Running time - O(n^2) - quadratic
    @Override
    public void sort(Comparable[] a){
        int N = a.length;
        for(int i = 1; i < N;i++){
            for(int j = i; j > 0; j--){
                if(a[j].compareTo(a[j-1]) < 0){
                    swapWithPrevious(a, j);
                }
            }
        }
    }
    
    private void swapWithPrevious(Comparable[] a, int j){
        Comparable temp = a[j - 1];
        a[j - 1] = a[j];
        a[j] = temp;
    }
}
