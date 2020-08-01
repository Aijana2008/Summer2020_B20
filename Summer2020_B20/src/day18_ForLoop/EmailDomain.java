package day18_ForLoop;

public class EmailDomain {

    public static void main(String[] args) {
        String email ="erickanat90@gmail.com";
        //             012345678
        int index1 = email.indexOf("@");

        int index2 = email.lastIndexOf(".");

        String domain = email.substring(index1+1, index2 );
        System.out.println(domain);






    }
}
