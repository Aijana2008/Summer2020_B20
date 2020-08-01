package day24_Arrays;
/*
 1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd

 */
public class Uniques {
    public static void main(String[] args) {

        String str = "aabcc";
        String uniques = ""; //"b"
        for(int i = 0;i <= str.length()-1;i++){
           char ch = str.charAt(i);
           int first= str.indexOf(ch);
           int last = str.lastIndexOf(ch);

           if(first == last){
               uniques +=ch;
           }
        }

        System.out.println(uniques);










    }

}
