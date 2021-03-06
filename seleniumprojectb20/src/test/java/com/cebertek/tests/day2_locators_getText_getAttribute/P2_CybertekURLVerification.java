package com.cebertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {

    public static void main(String[] args) {


        //TC #2: Cybertek verifications
        //1. Open Chrome browser
        // I need to setup my browser driver.
        WebDriverManager.chromedriver().setup();

        //To create instance of chrome browser from WebDriver.
        WebDriver driver = new ChromeDriver();

        // this line will maximize the newly opened browser page
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");
        //3. Verify URL contains
        //Expected: cybertekschool

        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedInUrl)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }
        //4. Verify title:
        //Expected: Practice

        if(driver.getTitle().equals("Practice")){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification failed!!!");
        }

        driver.close();



    }
}
