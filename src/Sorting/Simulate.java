package Sorting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Simulate {
    public static void main(String[] args) throws IOException {
        selectionSort("tiny.txt");
        selectionSort("words3.txt");
        
        insertionSort("tiny.txt");
        insertionSort("words3.txt");
        
        mergeSort("tiny.txt");
        mergeSort("words3.txt");
        
        quickSort("tiny.txt");
        quickSort("words3.txt");
    }
    
    private static void insertionSort(String fileName) throws IOException {
        Insertion insertion = new Insertion();
        simulateSort(insertion, fileName);
    }
    
    private static void selectionSort(String fileName) throws IOException{
        Selection selection = new Selection();
        simulateSort(selection, fileName);
    }
    
    private static void mergeSort(String fileName) throws IOException {
        Merge merge = new Merge();
        simulateSort(merge, fileName);
    }
    
    private static void quickSort(String fileName) throws IOException {
        Quick quick = new Quick();
        simulateSort(quick, fileName);
    }
    
    private static void simulateSort(ISortingAlgorithm sortingAlgorithm, String fileName) throws IOException {
        String[] words = getFromFile(fileName);
        sortingAlgorithm.sort(words);
        
        for(String s : words){
            System.out.print(s + " ");
        }
        System.out.println();
    }
        
    private static String[] getFromFile(String fileName) throws IOException {
        String filePath = String.format("src/Sorting/%s", fileName);
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        
        ArrayList<String> words = new ArrayList<String>();        
        while(br.ready()){
            String line = br.readLine();
            String[] segments = line.split(" ");
            words.addAll(Arrays.asList(segments));
        }        
        return words.toArray(new String[words.size()]);
    }
}
