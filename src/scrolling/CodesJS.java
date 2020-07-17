package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.BaseClass;

import java.util.List;

public class CodesJS extends BaseClass {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    /*
       js.executeScript("window.scrollBy(0, 2000)");
       js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

       js.executeScript("window.scrollTo(0, -document.body.scrollHeight)");

       js.executeScript("arguments[0].scrollIntoView();", element);
     */
    @BeforeMethod
    public void goToTheWebsite() {
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("baby books");
        WebElement searchButton = driver.findElement(By.cssSelector(" input[value='Go']"));
        searchButton.click();

    }

    @Test

    public void searchFirst100Words() {
        WebElement element = driver.findElement(By.xpath("//span[text()='First 100 Words']"));

        List<WebElement> lists = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
        js.executeScript("arguments[0].scrollIntoView();", lists.get(lists.size()-1));
        System.out.println(element.getText());

        WebElement reviewCount = driver.findElement(By.xpath("//span[text()='12,051']"));
        System.out.println(reviewCount.getText());

        Assert.assertEquals("12,051", reviewCount.getText());

    }

    @Test
    void aSecondBook() {

        List<WebElement> books = driver.findElements(By.xpath("//span[contains(text(),'Best Seller')]/ancestor::div[@class='a-section a-spacing-medium']/div/div/div/div/div/div/div/h2/a/span"));

        System.out.println(books.size());
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getText());

        }




    }

}



