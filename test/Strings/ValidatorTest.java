package Strings;

import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {
    @Test
    public void hasNoRepeatingChars_WordWithRepeatingChars_ReturnsFalse() {
        Validator v = new Validator();
        Boolean result = v.hasRepeatingChars("Test");
        Assert.assertTrue(result);
    }

    @Test
    public void hasNoRepeatingChars_WordWithoutRepeatingChars_ReturnsTrue() {
        Validator v = new Validator();
        Boolean result = v.hasRepeatingChars("Nope");
        Assert.assertFalse(result);
    }
}