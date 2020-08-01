package day08_LogicalOperators;

public class Practice3 {
    public static void main(String[] args) {

        String firstName = "Jennifer";
        String lastName = "Lopez";
        int age = 50;
        String citizen1 = "USA";
        String citizen2 = "Puerto Rico";
        boolean eligibleAge = age >= 18;
        //        50 >= 18; true
        boolean usCitizen = citizen1 == "USA" || citizen2 == "Puerto Rico";
        //          true = "USA"                   false = "Puerto Rico
        boolean eligibleToVote = eligibleAge && usCitizen;
        //                        true    &&    true
        System.out.println(firstName+" "+lastName+" is eligible to vote for Trump: "+eligibleToVote);

        System.out.println("===============================================================================");

        int b = 2;
        boolean res = ++b== 2  || --b==2 && --b ==2;
        //            3 == 2 || 2 ==2   && 1 == 2
        //              false     true   && false
        //                   false   &&  false
        //                         false
        System.out.println(res);
        System.out.println(b);

        int c = 5;
        boolean r2 = c++ == 6  || c-- == 5  || c == 5;
        //      r2 = 5 == 6    || 6 == 5   || 5 == 5
        //      r2 false       || false    || true
        System.out.println(r2);



        boolean A = true ;
        boolean B = !A;
        boolean C = A != B && A == !B   &&  !A==B      && !A == B;
          //          true != false    && true ==true   && false ==false
        //                true               true            false

        System.out.println(C);

    }













}
