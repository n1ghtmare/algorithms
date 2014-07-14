package Permutations;

import java.util.List;

public class Simulate {
    public static void main(String[] args){
        Permutator p = new Permutator();
        List<String> permutations = p.generatePermutations("dimitar");
        
        for(String s : permutations){
            System.out.println(s);
        }                
    }
}
