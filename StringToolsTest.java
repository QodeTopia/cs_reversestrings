import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToolsTest {
    @Test
    public void testCase1() {
        assertEquals("Nope!", "ollaH", StringTools.reverse("Hallo"));
        assertEquals("Nope!", "", StringTools.reverse(""));
        assertEquals("Nope!", "!limE", StringTools.reverse("Emil!"));
    }
}