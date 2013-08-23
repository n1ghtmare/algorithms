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
        
        HashTableWithLinearProbing<String, String> htl = new HashTableWithLinearProbing<String, String>(5);
        htl.put("A", "Entry - A");
        htl.put("A", "This will be overridden");
        htl.put("B", "Entry - B");
        htl.put("C", "Entry - C");
        htl.put("D", "Entry - D");
        htl.put("E", "Entry - E");
        htl.put("F", "Entry - F");
        htl.put("G", "Entry - G");
        System.out.println(htl.get("A"));
        System.out.println(htl.get("B"));
        System.out.println(htl.get("C"));
        System.out.println(htl.get("D"));
        System.out.println(htl.get("E"));
        System.out.println(htl.get("F"));        
        System.out.println(htl.get("G"));
    }
}
