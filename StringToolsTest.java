import org.junit.Test;

import static org.junit.Assert.*;

public class StringToolsTest {

    @Test
    public void verifyReverse() {
        assertEquals("ollaH", StringTools.reverse("Hallo"));
        assertEquals("!limE", StringTools.reverse("Emil!"));
        assertEquals("", StringTools.reverse(""));
    }

    @Test
    public void verifyIsPalindrome() {
        assertFalse(StringTools.isPalindrom("Hallo"));
        assertFalse(StringTools.isPalindrom("Emil!"));
        assertTrue(StringTools.isPalindrom(""));
        assertTrue(StringTools.isPalindrom("Lagerregal"));
    }
}