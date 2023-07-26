package Stringrelatedprograms;

import javax.swing.*;

public class Eachwordreverseinthestringwithsameformat {
    public static void main(String args[]) {

        String str = "Hi how are you chandra mathu";
        String[] strarray = str.split(" ");
        String reversestring = "";

        for (String words : strarray) {
            String reverseword = "";
            for (int i = words.length() - 1; i >= 0; i--) {

                reverseword += words.charAt(i);

            }
            reversestring += reverseword + " ";

        }
        System.out.println(reversestring);

    }

}
