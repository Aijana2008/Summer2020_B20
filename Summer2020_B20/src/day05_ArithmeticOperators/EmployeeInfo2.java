package day05_ArithmeticOperators;
/*Warmup tasks:
        1. create a class named EmployeeInfo
        declare the following variables:
        firstName
        lastName
        gender
        age
        companyName
        jobTitle
        isFullTime
        isMarried
        salary
        write a program that can display the full info of the employee
        ex:
        firstName = John
        lastName = Daniel
        gender = Male
        age = 35
        companyName = CapitalOne
        jobTitle = SDET
        isFullTime = true
        isMarried = false
        salary = 120000.50
        output:
        Employee' full name is: John Daniel
        John Daniel' gender is: Male
        John Daniel' age is: 35 years old
        John Daniel works at: CapitalOne
        John Daniel' Job title is: SDET
        John Daniel' salary is 120000.5 $
        John Daniel is full time employee: true
        John Daniel is married: false */
public class EmployeeInfo2 {

    public static void main(String[] args) {
//firstName, LastName, gender, age, companyName, jobtitle, isFullTime, isMarried, salary
        String firstName = "Aaron";
        String LastName = "John";
        int age = 128;
        String companyName = "CapitalOne";
        char gender = 'N';
        String jobTitle = "SDET";
        boolean isFullTime = true;
        boolean isMarried = true;
        double salary = 120_000.50;
        String fullName = firstName + " " + LastName; //"Aaron Jones"

        System.out.println("Employee' full name is: " + firstName + " " + LastName);
        System.out.println(firstName + "' gender is: " + gender);
        System.out.println(firstName + "'age is :" + age + " years old");
        System.out.println(firstName + " works at: " + companyName);
        System.out.println(firstName + "' jobTitle is: " + jobTitle);
        System.out.println(firstName + "' salary is: $" + salary);
        System.out.println(firstName + " is full time employee: " + isFullTime);
        System.out.println(firstName + " is married: " + isMarried);


    }




    }
