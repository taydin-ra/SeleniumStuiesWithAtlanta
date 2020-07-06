package study.techno;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseClass;

import java.util.concurrent.TimeUnit;

public class HotelsPrices extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
                driver.get("https://www.hotels.com/");
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement destination = driver.findElement(By.xpath("//input[@name='q-destination']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(destination).click()
                .sendKeys("New York")
                .perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .perform();
        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();

        WebDriverWait wait=new WebDriverWait(driver,4);
        wait.until(ExpectedConditions.invisibilityOf(searchButton)); //explicit wait
    }
}