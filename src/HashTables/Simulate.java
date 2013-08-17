package HashTables;

/**
 *
 * @author dimitar
 */
public class Simulate {
    public static void main(String[] args){
        HashTableWithSeparateChaining<String, String> ht = new HashTableWithSeparateChaining<String, String>(5);
        ht.put("A", "Entry - A");
        ht.put("A","This will be overridden");
        ht.put("F", "Entry - F");
        ht.put("B", "Entry - B");
        ht.put("C", "Entry - C");
        ht.put("D", "Entry - D");
        ht.put("E", "Entry - E");
        ht.put("F", "Entry - F (will be overridden");
        ht.put("G", "Entry - G");
        ht.put("H", "Entry - H");
        ht.put("M", "Entry - M");        
        
        System.out.println(ht.get("A"));
    }
}
