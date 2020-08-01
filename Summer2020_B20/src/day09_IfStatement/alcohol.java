package day09_IfStatement;
/*   4. write a java program that can identify if a person is eligible to buy alcohol
 */
public class alcohol {
    public static void main(String[] args) {
              boolean hasID = true;
              int age = 26;
              String result = "";

              boolean eligible = hasID && age >= 26;//true
        if(eligible== true){
          //    System.out.println("Eligible to buy alcohol");
            result = "Eligible to buy alcohol";


        }
        if(eligible == false){
          //  System.out.println("Go buy milk");
            result = "You are not old enough to buy alcohol";
        }







    }











}
