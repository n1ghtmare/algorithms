/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Permutations;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dimitar
 */
public class Permutator {
    public List<String> generatePermutations(String word){
        List<String> permutations = new ArrayList<String>();
        permute("", word, permutations);
        return permutations;
    }
    
    private void permute(String prefix, String word, List<String> permutations){
        int l = word.length();
        if(l == 0){
            permutations.add(prefix);
        }
        else {
            for(int i = 0; i < l; i++){
                permute(prefix + word.charAt(i), word.substring(0, i) + word.substring(i+1, l), permutations);
            }
        }
    }
}
