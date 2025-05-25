package loesung;

import java.util.List;

/**
 * Diese Lösung ist mehr oder weniger identisch mit {@link Loesung1}, verwendet aber StringBuilder anstatt String-Concatenation, was etwas effizienter ist.
 */
public class Loesung2 {

    public static String reverse(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append(input.charAt(input.length() - i - 1));
        }
        return output.toString();
    }
}
