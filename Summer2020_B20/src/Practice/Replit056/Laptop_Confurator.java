package Practice.Replit056;

import java.util.Scanner;

public class Laptop_Confurator {
    public static void main(String[] args) {

        double price = 0;
        String screenResolution, storageType, screenType, cpu;
        int ram = 0,memorySize =0; ;
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Select screen size:");
        screenType = scan.nextLine();
        switch (screenType){
            case "13.3":
                price+=200;
                break;
            case "15.0":
                price+=300;
                break;
            case "17.3":
                price+=400;
                break;
        }
        System.out.println("Select CPU type:");
        cpu = scan.nextLine();
        switch (cpu) {
            case "i3":
                price += 150;
                break;
            case "i5":
                price += 250;
                break;
            case "i7":
                price += 350;
                break;
        }
        System.out.println("Select RAM size:");

         ram = scan.nextInt();
        price += ram / 4 * 50;
        System.out.println("Select storage type:");
        storageType = scan.next();
        System.out.println("Enter memory size:");
        memorySize = scan.nextInt();
        switch (storageType){
            case "HDD":
                price += memorySize / 500 * 50;
                break;
            case "SSD":
                price += memorySize / 500 * 100;
                break;
        }

        System.out.println("Enter screen resolution:");
        screenResolution = scan.next();
        switch (screenResolution){
            case "FULLHD":
                price += 100;
                break;
            case "4K":
                price += 200;
                break;
        }

        System.out.println("Laptop price is: $" + price);


    }
}






