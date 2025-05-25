package loesung;

/**
 * Diese Variante benutzt Java-Streams um einen String umzukehren.
 * Das ist jetzt nicht unbedingt die Beste und Leserlichste Variante, aber Ich wollte sie euch nicht vorenthalten (-:
 */
public class Loesung4 {

    public static String reverse(String input) {
        return input.chars()
                .mapToObj(i -> (char) i)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .reverse().toString();
    }
}
