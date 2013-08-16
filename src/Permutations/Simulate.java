/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Permutations;

import java.util.List;

/**
 *
 * @author dimitar
 */
public class Simulate {
    public static void main(String[] args){
        Permutator p = new Permutator();
        List<String> permutations = p.generatePermutations("dimitar");
        
        for(String s : permutations){
            System.out.println(s);
        }                
    }
}
