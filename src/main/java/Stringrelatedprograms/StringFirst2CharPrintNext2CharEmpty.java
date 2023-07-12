package Stringrelatedprograms;

public class StringFirst2CharPrintNext2CharEmpty {
    public static void main(String[] args) {
        String str = "welcome";
        String result = "";

        for (int i = 0; i < str.length(); i += 4) {
            if (i + 2 < str.length()) {
                result += str.substring(i, i + 2);
                result += "  ";
            } else {
                result += str.substring(i);
            }
        }

        System.out.println(result);
    }
}
