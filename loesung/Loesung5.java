package loesung;

import java.util.stream.Collectors;

/**
 * Diese Variante ist ähnlich {@link Loesung4}, allerdings verzichtet diese Variante vollständig auf die Benutzung von StringBuilder.
 */
public class Loesung5 {

    public static String reverse(String input) {
        return String.join("", input.chars()
                .mapToObj(i -> "" + (char) i)
                .toList().reversed());
    }
}
