package day11_Nestedif_Ternary;

public class NestedIf_Practice2 {
    public static void main(String[] args) {
        int day = 8;
        boolean validNumber = day >= 1 && day <= 1 && day <= 7;
        String result = "";
        if(validNumber){
            if(day==7){
                result = "Sunday";
            }else if(day == 6){
                result = "Saturday";
            }else if(day == 5){
                result = "Friday";
            }else if(day == 4){
                result = "Thursday";
            }else if(day == 3){
                result = "Wednesday";
            }else if(day == 2){
                result = "Tuesday";
            }else { //day == 1
                result = "Monday";


            }
            }else {  // invalid number
                    result = "Invalid";
                }
                System.out.println(result);


    /*
                result = (day == 7) ? "Sunday" : (day == 6) ? "Saturday" : (day == 5) ? "Friday" : (day == 4) ? "Wednesday" : (day == 3) ? "Tuesday" : (day == 2) ? "Monday";
     */














    }
}
