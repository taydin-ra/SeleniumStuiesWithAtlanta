package study.techno;

import org.openqa.selenium.By;
import utility.BaseClass;
import org.junit.Assert;

public class Alert extends BaseClass {
    public static void main(String[] args) {
        driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        driver.findElement(By.cssSelector("button[onclick='myConfirmFunction()']")).click();
        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);
        driver.switchTo().alert().accept();
        String actualText = driver.findElement(By.id("confirm-demo")).getText();
        Assert.assertEquals("You pressed OK!", actualText);
    }
}
