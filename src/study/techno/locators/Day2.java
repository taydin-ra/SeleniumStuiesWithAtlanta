package study.techno.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseClass;

import java.util.List;
import java.util.WeakHashMap;

public class Day2 extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://newtours.demoaut.com/mercuryreservation.php");

        driver.manage().window().maximize();

        /*
         css  input[name='username']

         xpath //input[@name='username']

               // input[text()='Georgia']
               input[contains('@class',thjkl)]

               css daha hizli xpathe gore
               css de parent tan child a gidiliyor ama childdan parent a gidilmiyor
               xpathde ikisi de oluyor parent tan child a ve childdan parent a da gidiliyor

               absolute xpath
               relative xpath

               //input[@type='radio' and @value='roundtrip'] ( ayni tag in  icinde olmasi gerekir)

             //option[@value='3']//parent::select[@name='passCount'] (childdan parent a giderken)
         */
         /*
         sign-on tab
         username
         password
         submit
          */

        // Click on sign-on tab
        WebElement signOnTab = driver.findElement(By.cssSelector("td.mouseOut a[href='mercurysignon.php']"));
        signOnTab.click();

        // fill out the username box

        WebElement userNameBox = driver.findElement(By.xpath("//input[@name='userName']"));
        userNameBox.sendKeys("ttorun");

        // password fill out

        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='password']"));
        passwordBox.sendKeys("12345678");

        // click on submit
        WebElement submtButton = driver.findElement(By.cssSelector("input[name='login']"));
        submtButton.click();

        // click on roundTrip

        WebElement roundTrip = driver.findElement(By.xpath("//input[@value='roundtrip']"));
        roundTrip.click();

        // passengers 3

//        WebElement passCount=driver.findElement(By.cssSelector("select[name='passCount'] >option[value='3']"));
//        passCount.click();
        WebElement passCount = driver.findElement(By.xpath("//option[contains(text(),'3')]"));
        passCount.click();
////
//        List<WebElement> passengers = driver.findElements(By.cssSelector("select[name='passCount'] >option"));
//        System.out.println(passengers.size());
//        Thread.sleep(2000);
//        for (WebElement element : passengers) {
//            if (element.getText().equalsIgnoreCase("3 ")) {
//                element.click();
//            }
//
//        }


    }
}
