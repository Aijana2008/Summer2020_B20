package day11_Nestedif_Ternary;

public class DaysInMonth2 {
    public static void main(String[] args) {
        int month = 2;
        boolean validNumber = (month >= 1 && month <= 12) == true;
        String days = "";
        if (validNumber) {
            if (month ==2) {
                days = "28 days";
            }else if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = "31 days";
            } else { days="31 days";}
        } else {days = "Invalid entry";}
        System.out.println(days);








    }
}
