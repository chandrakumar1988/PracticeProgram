package Stringrelatedprograms;

public class StringReversedifferntway {

    public static void main (String args[])
    {
        String reversestrg =Reversestringbycharatindex();
        System.out.println(reversestrg);
        String reversestrg1=Reversestingwithoutchangingtheforloop();
        System.out.println(reversestrg1);
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

    //Program 2 without changing for loop
    public static String Reversestingwithoutchangingtheforloop()
    {
        String Originaltext =" Welcome to Sagent company";
        int len =Originaltext.length();
        char ch;
        String reversestring="";
        for(int i=0;i<=len-1;i++)
        {
           ch =Originaltext.charAt(i);
            reversestring =ch+reversestring;

        }
        return reversestring;



    }

}
