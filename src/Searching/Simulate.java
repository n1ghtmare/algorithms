package Searching;

public class Simulate {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[] { 1, 3, 7, 12, 15, 35, 77, 101, 179, 351 };
        BinarySearch binarySearch = new BinarySearch(numbers);
        int i = binarySearch.getIndexOf(3);
        
        System.out.println(String.format("The index is: %s", i));
    }
}
