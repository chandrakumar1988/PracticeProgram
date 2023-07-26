package Stringrelatedprograms;

public class StringEveryfirst2charprintnext2charshouldbeempty
{
    public static void main(String[] args) {
        String str = "welcome chandra kumar";
        String result = "";

        for (int i = 0; i < str.length(); i += 4) {
            if (i < str.length()) {
                result += str.charAt(i);
            }
            if (i + 1 < str.length()) {
                result += str.charAt(i + 1);
            }
            result += "  ";
        }

        System.out.println(result);
    }

}



