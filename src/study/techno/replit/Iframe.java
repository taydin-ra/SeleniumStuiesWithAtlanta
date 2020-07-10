package study.techno.replit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BaseClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Iframe extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        driver.get(" https://chercher.tech/practice/frames ");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        /*
        NoSuchElementException ne zaman cikar

        - locator yanlis
        - time issue
        -ya da element frame in icinde olabilir
         */

        WebElement frame1Element = driver.findElement(By.xpath("//iframe[@src='frames1.html']"));
        driver.switchTo().frame(frame1Element);
        WebElement topicBox = driver.findElement(By.cssSelector("input[type='text']"));
        topicBox.sendKeys("topic");
        driver.switchTo().frame("frame3");
        driver.findElement(By.id("a")).click();

        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");

        WebElement animals = driver.findElement(By.cssSelector("select#animals"));
        Select select = new Select(animals);
        select.selectByVisibleText("Avatar");

        List<WebElement> frames = driver.findElements(By.tagName("iframe"));

        for (int i = 0; i < frames.size(); i++) {
            driver.switchTo().frame(i);
            int myFrame = driver.findElements(By.cssSelector("select#animals")).size();
            System.out.println(myFrame);
            driver.switchTo().defaultContent();

        }


    }
}
