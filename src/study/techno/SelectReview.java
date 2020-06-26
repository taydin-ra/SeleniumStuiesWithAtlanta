package study.techno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BaseClass;

public class SelectReview extends BaseClass {
    public static void main(String[] args) {
        driver.get("http://newtours.demoaut.com/mercuryreservation.php");

        driver.manage().window().maximize();


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
        WebElement passCount = driver.findElement(By.cssSelector("select[name='passCount']"));
        passCount.click();

        Select select = new Select(passCount);
        select.selectByVisibleText("3");


    }
}
