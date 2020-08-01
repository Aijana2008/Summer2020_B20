package Office_Hours.Practice_07_06_2020;

import java.util.Scanner;

public class SunOfFiveNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0; // 10 + 20 + 30 + 40 + 50 = 150

        for(int i = 1; i <= 100; i += 1){

            System.out.println("Enter a number: ");
            int num = scan.nextInt(); // 10 , 20, 30, 40, 50
            sum += num;

        }

        System.out.println(sum);









    }
}
