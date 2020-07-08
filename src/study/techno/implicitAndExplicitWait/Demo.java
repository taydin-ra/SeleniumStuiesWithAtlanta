package study.techno.implicitAndExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseClass;

import java.util.List;

public class Demo extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(" http://demo.automationtesting.in/WebTable.html"); //
        WebDriverWait wait = new WebDriverWait(driver, 6);
        WebElement table = driver.findElement(By.xpath("//div[@class='ui-grid-canvas']"));

        List<WebElement> emails = driver.findElements(By.xpath("//div[@class='ui-grid-canvas']/div/div"));
        // wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//div[@class='ui-grid-canvas']/div/div"),5));
        wait.until(ExpectedConditions.visibilityOf(table));
        for (int i = 0; i < emails.size(); i++) {
            System.out.println(emails.get(i).getText());

        }
    }
}
