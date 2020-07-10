package study.techno.implicitAndExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoaderDemo extends BaseClass {

    public static void main(String[] args) {

        WebDriverWait wait=new WebDriverWait(driver,60);

        driver.get("http://demo.automationtesting.in/Loader.html");

        driver.findElement(By.id("loader")).click();

        WebElement pleaseWaitBox=driver.findElement(By.xpath("//div[@class='blockUI blockMsg blockPage']"));

        //wait.until(ExpectedConditions.attributeToBe(By.id("myModal"),"style","display: block;"));

        wait.until(ExpectedConditions.invisibilityOf(pleaseWaitBox));

        WebElement paragraf=driver.findElement(By.xpath("//div[@id='myModal']//p"));

        System.out.println(paragraf.getText());


    }
}
