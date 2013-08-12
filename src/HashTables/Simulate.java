/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HashTables;

/**
 *
 * @author dimitar
 */
public class Simulate {
    public static void main(String[] args){
        HashTableWithSeparateChaining<String, String> ht = new HashTableWithSeparateChaining<String, String>(5);
        ht.put("A", "Denica Conkova");
        ht.put("A","This will be overriden");
        ht.put("F", "Some test yo");
        ht.put("B", "Dimitar Dimitrov");
        ht.put("C", "London");
        ht.put("D", "Google");
        ht.put("E", "Google2");
        ht.put("F", "Google3");
        ht.put("G", "Google4");
        ht.put("H", "Google5");
        ht.put("M", "Google6");
        ht.put("S", "Super");
        ht.put("J", "Jaguar");
        
        
        System.out.println(ht.get("A"));
    }
}
