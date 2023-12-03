import org.junit.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerDecodeTest {

    @Test(expected = NumberFormatException.class)
    public void testEmptyString() {
        Integer.decode("");
    }

    @Test(expected = NumberFormatException.class)
    public void testEmptyStringWithSpaces() {
        Integer.decode("  ");
    }

    @Test
    public void testPositiveNumber() {
        assertEquals(Integer.valueOf(42), Integer.decode("42"));
    }

    @Test
    public void testNegativeNumber() {
        assertEquals(Integer.valueOf(-42), Integer.decode("-42"));
    }

    @Test
    public void testHexadecimalNumberLowerCase() {
        assertEquals(Integer.valueOf(255), Integer.decode("0xff"));
    }

    @Test
    public void testHexadecimalNumberUpperCase() {
        assertEquals(Integer.valueOf(255), Integer.decode("0XFF"));
    }

    @Test
    public void testOtherHexNumber() {
        assertEquals(Integer.valueOf(255), Integer.decode("#FF"));
    }

    @Test
    public void testOctalNumber() {
        assertEquals(Integer.valueOf(64), Integer.decode("0100"));
    }
}
