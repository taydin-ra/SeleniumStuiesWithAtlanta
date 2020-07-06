package study.techno;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseClass;

import javax.swing.text.Highlighter;
import java.util.List;

public class ActionsClass extends BaseClass {
    public static void main(String[] args) throws InterruptedException {


        driver.manage().window().maximize();
//        driver.get("http://etsy.com");
//        WebDriverWait wait=new WebDriverWait(driver,4);
//
//        WebElement home=driver.findElement(By.xpath("//span[contains(text(),' Home & Living')]"));
//
//        wait.until(ExpectedConditions.visibilityOf(home));
//////
//        Actions actions=new Actions(driver);
//
//        actions.moveToElement(home).click().perform();

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        WebElement rightClickButton=driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions=new Actions(driver);
        actions.contextClick(rightClickButton).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                perform();
        Action act=actions.build();
        act.perform();

//        driver.get("https://www.hotels.com/");
//
//        WebElement destination = driver.findElement(By.xpath("//input[@name='q-destination']"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(destination).click()
//                .sendKeys("New York")
//                .perform();
//        Thread.sleep(2000);
//        actions.sendKeys(Keys.ARROW_DOWN)
//                .sendKeys(Keys.ENTER)
//                .perform();
//
//        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
//        searchButton.click();
//
//        WebDriverWait wait=new WebDriverWait(driver,4);
//        wait.until(ExpectedConditions.invisibilityOf(searchButton));
//
//        WebElement slider=driver.findElement(By.xpath("//div[@aria-labelledby='f-price-min-label']"));
//
//        actions.dragAndDropBy(slider,77,0).click().perform();
//
//        Thread.sleep(500);
//
//        WebElement sliderRight=driver.findElement(By.xpath("//div[@aria-controls='f-price-max']"));
//
//        actions.dragAndDropBy(sliderRight,-46, 0).click().perform();
//
//        WebElement filterPrice=driver.findElement(By.xpath("//a[@data-menu='sort-submenu-price']"));
//        actions.moveToElement(filterPrice).click().perform();
//
//        WebElement lowToHigh=driver.findElement(By.xpath("//a[contains(text(),'Price (low to high)')]"));
//        lowToHigh.click();

//        Actions actions = new Actions(driver);
//        driver.get("https://jqueryui.com/droppable/");
//        driver.switchTo().frame(0);
//        WebElement source=driver.findElement(By.xpath("//div[@id='draggable']"));
//        WebElement target=driver.findElement(By.xpath("//div[@id='droppable']"));
////        actions.dragAndDrop(source,target).perform();
//        actions.clickAndHold(source).moveToElement(target).release().perform();


    }
}
