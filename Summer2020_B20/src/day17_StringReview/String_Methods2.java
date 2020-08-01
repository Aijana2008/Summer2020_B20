package day17_StringReview;
     /*
    String methods:  equals, equalsIgnorecase, isEmpty, ends, starts, contains
    String methods:  contains,  ends, starts
     */

public class String_Methods2 {
    public static void main(String[] args) {

        String str2 = ""; // length ==0
        System.out.println( str2.isEmpty() );

        // contains: included or not

        String str3 = "Java, C#, Python, Ruby, C++";

        System.out.println(  str3.contains("Java") ); // true
        System.out.println(str3.contains("java")); // false

        //  System.out.println( str3.toLowerCase().contains("java")); // true

        String str4 = "DABC";

        System.out.println(str4.contains("D"));

        // startsWith & endsWith:

        String str5 = "Cybertek School";

        System.out.println(str5.startsWith("E")  || str5.startsWith("C"));
        //                  false     ||  true ==> true

        System.out.println(str5.startsWith("CybABC")); // false

        String str6 = "Today is a great day";

        System.out.println( str6.endsWith("day"));  // true

        System.out.println(str6.endsWith("great")); // false
















    }
}
