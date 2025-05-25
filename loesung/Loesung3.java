package loesung;

/**
 * Diese Lösung ist eigentlich gemogelt, da sie den Java {@link StringBuilder} verwendet, welcher eine eingebaute {@link StringBuilder#reverse()} methode hat.
 * Schau {@link Loesung1} für eine "echte" Implementierung.
 */
public class Loesung3 {

    public static String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
