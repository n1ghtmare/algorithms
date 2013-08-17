package Sorting;

/**
 *
 * @author dimitar
 */
public class Merge implements ISorter {
    private Comparable[] aux;
    
    // Space - O(n) - for arrays and O(n lg(n)) additional for linked lists
    // Running time - O(n lg(n))
    @Override
    public void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }
    
    private void sort(Comparable[] a, int min, int max){
        if(max > min){
            int mid = min + (max - min) / 2;
            sort(a, min, mid);
            sort(a, mid + 1, max);
            merge(a, min, mid, max);
        }
    }
    
    private void merge(Comparable[] a, int min, int mid, int max){
        // prepare the aux array
        for(int t = min; t <= max;t++){
            aux[t] = a[t];
        }
        
        int i = min; // start index for left side
        int j = mid + 1; // start index for right side
        
        for(int k = min; k <= max; k++){
            if(i > mid){
                a[k] = aux[j++];
            }
            else if(j > max){
                a[k] = aux[i++];
            }
            else if(aux[i].compareTo(aux[j]) < 0 ){
                a[k] = aux[i++];
            }
            else {
                a[k] = aux[j++];
            }
        }
    }
}
