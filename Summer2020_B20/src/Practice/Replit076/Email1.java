package Practice.Replit076;

import java.util.Scanner;

public class Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String result ="";
        String FirstName = "";
        String LastName = "";
        String Name = "";
        int At = email.indexOf("@");
        int UnderScore = email.indexOf("_");

        if(email.contains("_")){
            for(int i =UnderScore+1; i <= At -1; i++ ){
                result =""+email.charAt(i);
                LastName +=result;
            }
            for(int i = 0; i <=UnderScore -1;i++){
                result =""+email.charAt(i);
                FirstName +=result;
            }
            Name = email.substring(At+1 , email.length());
            System.out.println(LastName +"_"+ FirstName+"@" +Name);
        }else if(!email.contains("_")){
            System.out.println(email);
        }

    }
}


