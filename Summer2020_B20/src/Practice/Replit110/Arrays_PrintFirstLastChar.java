package Practice.Replit110;

import java.util.Scanner;

public class Arrays_PrintFirstLastChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words ={"hello", "why", "by", "apple", "note"};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print firt and last char of each items in one line

        //TODO: Write your code below
        for (int i= 0; i <= words.length-1; i++){
            String each = words[i];
            char first = each.charAt(0);
            int z = each.length()-1;
            char last = each.charAt(z);
            System.out.println(""+first+last);
        }







    }
}
