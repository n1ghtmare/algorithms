package Strings;

import java.util.HashSet;

/**
 *
 * @author dimitar
 */
public class Validator {    
    public boolean hasNoRepeatingChars(String word) {
        HashSet<Character> uniqueChars = new HashSet<Character>();        
        final String temp = word.toLowerCase();
        
        for(int i = 0; i < temp.length(); i++) {
            Character c = temp.charAt(i);
            if(uniqueChars.contains(c)) {
                return true;
            }
            uniqueChars.add(c);
        }
        return false;
    }
}
