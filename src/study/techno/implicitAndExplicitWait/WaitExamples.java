package study.techno.implicitAndExplicitWait;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseClass;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class WaitExamples extends BaseClass {
    public static void main(String[] args) {
        /*
        Thread.sleep(5000); , bulsa da bulmasa da verdigimiz sure boyunca bekliyor

        implicitly wait , butun elementler icin bekleme suresi

        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS); butun linedaki kodlar icin bekliyor

        explicitly wait, belirli bi condition icin bekleme suresi, bulduktan sonra hala suresi olsa bile beklemiyor


         */

//        driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.get("https://www.google.com/");

        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Execute automation");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));

        driver.findElement(By.name("btnK")).click();

        driver.findElement(By.xpath("//h3[text()='Execute Automation - YouTube']")).click();


    }

}



