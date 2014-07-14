package Strings;

public class Simulate {
    public static void main(String[] args) {
        printResult("Test");
        printResult("Nox");
    }
    
    private static void printResult(String word) {
        Validator v = new Validator();
        String message = String.format(
                "The value \"%s\" - %s repeating letters",
                word,
                v.hasRepeatingChars(word) ? "has" : "has no");
        System.out.println(message);
    }
}
