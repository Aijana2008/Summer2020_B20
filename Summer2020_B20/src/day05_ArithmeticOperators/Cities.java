package day05_ArithmeticOperators;
/*warmup tasks:
        task01:
        Create a class named Cities
        Declare 3 String variables
        city1
        city2
        city3
        Assign values:
        Tashkent
        Kyiv
        Moscow
        Print: use the city variables
        From Tashkent to Kyiv is $500
        From Moscow to Tashkent is $550
        I have been to Tashkent, Moscow, Kyiv.
        task02:
        Create a class CompanyInfo
                Declare variables:
        companyName
        address
        numberOfEmployees
        revenue
        isTechCompany
        Print statements and describe each value:
        Company name is Facebook
        address is ...
        Number of employees is 100
        Annual revenue is 4 000 000
        is it tech company? - true
        task03:
        create a class called Swap, and write a program that can swap two variables' values wihtout using temporary variable
        Ex:
        int a =10;
        int b= 15;
        output:
        System.out.println(a); ===> 15
        System.out.println(b); ===> 10
        task04:
        Create a class called SalaryCalculator, write a program that can calculate the taxt, and salary after tax based on the hourly rate & tax rates
        ex:
        if: rate = 55;
        stateTaxRate = 0.04;
        federalTaxRate =0.22;
        weeklyHours = 40;
        then output will be:
        your salary is: 105600 USD
        your total tax is: 27456 USD
        your income after tax is: 78144 USD
        Assume that a year has 48 weeks (excluding PTO)*/
public class Cities {

    public static void main(String[] args) {

             String city1 = "Tashkent";
             String city2 = "Kyiv";
             String city3 = "Moscow";

        System.out.println("From "+ city1+" to " + city2 + " is $" +500);
        System.out.println("From "+ city3+" to " + city1 + " is $" +500);
        System.out.println("I have been to "+ city1+", " + city3+", " +city2+".");







    }





}
