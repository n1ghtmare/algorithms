package Sorting;

/**
 *
 * @author dimitar
 */
public class Quick implements ISortingAlgorithm {
    @Override
    public void sort(Comparable[] a) {
        // shuffle the array ... guarantees performance
        sort(a, 0, a.length - 1);
    }
    
    private void sort(Comparable[] a, int min, int max) {
        if(max > 1) {
            int i = min, j = max;
            int mid = min + (max - min) / 2;
            
            Comparable pivot = a[mid];
            
            while(i <= j) {
                while(a[i].compareTo(pivot) < 0) {
                    i++;
                }
                
                while(a[j].compareTo(pivot) > 0) {
                    j--;
                }
                
                if(i <= j) {
                    swap(a, i, j);
                    i++;
                    j--;
                }
            }
            
            if(max > i){
                sort(a, i, max);
            }
            
            if(min < j) {
                sort(a, min, j);
            }
        }
    }
    
    // TODO ...
    private int partition(Comparable[] a, int min, int max) {
        int i = min, j = max;
        int mid = min + (max - min) / 2;
        
        Comparable pivot = a[mid];
        
        while(i <= j) { 
            while(a[i].compareTo(pivot) < 0) {
                i++;
            }
            
            while(a[j].compareTo(pivot) > 0) {
                j--;
            }
            
            if(i <= j){
                swap(a, i, j);
                i++;
                j--;
            }
        }
        return j;
    }
    
    private void swap(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
