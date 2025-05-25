package loesung;

/**
 * Dies wird sehr wahrscheinlich die Lösung sein, welche ihr selbst erarbeitet habt.
 * Alternativ könnt ihr natürlich von 0 bis input.length() zählen.
 *
 * Schaut euch auch die anderen Lösungen an.
 */
public class Loesung1 {
    public static String reverse(String input) {
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }
}
