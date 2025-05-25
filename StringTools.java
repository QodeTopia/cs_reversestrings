public class StringTools {

    public static String reverse(String input) {
        return ""; // TODO: Implementiere mich :)
    }

    public static boolean isPalindrom(String input) {
        return false; // TODO: Implementiere mich :)
    }

    // Optional: Du kannst die main-Methode nutzen, um deinen Code zu überprüfen oder verwende StringToolsTest
    public static void main(String[] args) {
        var result = reverse("Hallo");
        System.out.println("Ergebnis: " + result + ": " + (result.equals("ollaH")));
        System.out.println("isPalindrom: 'Hallo' = " + isPalindrom("Hallo"));
        System.out.println("isPalindrom: 'Emil' = " + isPalindrom("Emil"));
        System.out.println("isPalindrom: 'Lagerregal' = " + isPalindrom("Lagerregal"));
    }
}
