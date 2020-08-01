package day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {
        String firstName = "Aizhan";
        String lastName = "Seiitbekova";
        int age = 30;
        String citizen1 = "USA";
        String citizen2 ="Russia";
        boolean eligibleAge = age >= 18;
                             //30 >= 18 ==> true
        boolean usCitizen = citizen1 == "USA"  || citizen2 == "Russia";
                             // "USA" =="USA"  || "Russia"== "USA"
                            // true            || false
                              //true
        boolean eligibleToVote = eligibleAge && usCitizen;
        //                       true    &&   true ==> true
        System.out.println(firstName +" "+ lastName + " eligible to Vote for Trump: "+eligibleToVote);










    }









}
