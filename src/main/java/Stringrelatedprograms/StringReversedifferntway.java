package Stringrelatedprograms;

public class StringReversedifferntway {

    public static void main (String args[])
    {
        String reversestrg =Reversestringbycharatindex();
        System.out.println(reversestrg);
    }
    public static String Reversestringbycharatindex()
    {
       String originalString ="Hello how are you";
       int length=originalString.length();
       char ch;
       String reversestring ="";
       for (int i=length-1;i>=0;i--)
       {
         ch  =originalString.charAt(i);
           reversestring =reversestring+ch;
       }
      return reversestring;


    }

}
