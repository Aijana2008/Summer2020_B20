package Practice.Replit084;
import java.util.Scanner;
public class OnlineBookMerchants {

    public static void main(String[] args) {

        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();

        if(isPremiumCustomer == true){
            if(nbooksPurchased % 8 >= 5){
                freeBooks +=1  ;
            }if(nbooksPurchased >= 8){
                freeBooks +=  nbooksPurchased / 8 * 2;
            }
        }if(!isPremiumCustomer){
            if(nbooksPurchased % 12 >= 7){
                freeBooks += 1;
            }if(nbooksPurchased >= 12){
                freeBooks += nbooksPurchased / 12 * 2;
            }
        }

        System.out.println(freeBooks);









    }
}
