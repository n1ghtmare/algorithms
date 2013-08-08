/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BSTs;

/**
 *
 * @author dimitar
 */
public class Simulate {
    public static void main(String[] args){
        BST<String, String> bst = new BST<String, String>();
        System.out.println(bst.size());
        bst.put("C", "Dimitar Dimitrov");
        System.out.println(bst.size());
        bst.put("A", "Denica Conkova");
        
        System.out.println(bst.size());
        System.out.println(bst.max());

        bst.put("G", "London");
        System.out.println(bst.size());
        bst.put("H", "Zurich");
        System.out.println(bst.size());
        bst.put("F", "Google");        
        System.out.println(bst.size());
        bst.put("R", "New Life");
        System.out.println(bst.size());
        System.out.println(bst.max());
        System.out.println(bst.get("A"));
        System.out.println(bst.get("TTT"));
    }
}
