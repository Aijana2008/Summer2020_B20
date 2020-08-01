package day12_Switch_Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 19;

        String ageGroup = "";
        if(age > 0 && age<= 150){
            if(age < 21){
                ageGroup = "Teenager";
            }else if(age >= 21 && age <= 55){

            }
        }else{
            ageGroup = "Invalid";
        }

        System.out.println(ageGroup);













    }
}
