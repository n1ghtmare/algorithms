package Sorting;

/**
 *
 * @author dimitar
 */
public class Selection implements ISorter {
    // Swaps - O(n) - linear
    // Space - O(1) - constant
    // Running time - O(n^2) - quadratic
    @Override
    public void sort(Comparable[] a){
        int N = a.length;
        for(int i = 0; i < N; i++){
            int min = i;
            for(int j = i + 1; j < N; j++){
                if(a[j].compareTo(a[min]) < 0){
                    min = j;
                }
            }
            swap(a, i, min); 
        }
    }
    
    private void swap(Comparable[] a, int i, int min){
        // swap
        Comparable temp = a[i];
        a[i] = a[min];
        a[min] = temp;           
    }
}
