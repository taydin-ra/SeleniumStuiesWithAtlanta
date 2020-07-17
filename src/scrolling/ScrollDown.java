package scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.BaseClass;

import java.util.List;

public class ScrollDown extends BaseClass {

    public WebDriverWait wait;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @BeforeMethod
    void GotoamazonWebsite() {
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("baby books");
        WebElement searchButton = driver.findElement(By.cssSelector(" input[value='Go']"));
        searchButton.click();
    }

    @Test 
    void searchBoooks() throws InterruptedException {


        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='First 100 Words']")));


        List<WebElement> lists = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));

        System.out.println(lists.size());
        WebElement first100words = driver.findElement(By.xpath("//span[text()='First 100 Words']"));
        js.executeScript("arguments[0].scrollIntoView();", first100words);
        System.out.println(first100words.getText());
//        wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='12,051']")));
        WebElement reviewCount = driver.findElement(By.xpath("//span[text()='12,051']"));
        System.out.println(reviewCount.getText());

        Assert.assertEquals("12,051", reviewCount.getText());


    }

    @Test
    void aSecondBook() {

        List<WebElement> books = driver.findElements(By.xpath("//span[contains(text(),'Best Seller')]/ancestor::div[@class='a-section a-spacing-medium']/div/div/div/div/div/div/div/h2/a/span"));

        System.out.println(books.size());
        for (int i = 0; i <books.size() ; i++) {
            System.out.println(books.get(i).getText());

        }
                

        }

    }



