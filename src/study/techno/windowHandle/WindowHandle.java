package study.techno.windowHandle;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BaseClass;

import java.util.List;
import java.util.Set;

public class WindowHandle extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        //navigate to https://www.etsy.com/
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@data-id='search-query']")).sendKeys("Teddy Bear");
        driver.findElement(By.cssSelector("span[class=\"etsy-icon wt-nudge-b-1\"]>svg")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//h3[contains(text(),'Graduation Personalized')])[1]")).click();

        String mainyWindow=driver.getWindowHandle();

        Set<String> handles=driver.getWindowHandles();

        for (String handle:handles){
            if(!handle.equalsIgnoreCase(mainyWindow)){
                driver.switchTo().window(handle);
            }
        }
        Thread.sleep(3000);


        WebElement color=driver.findElement(By.cssSelector("div[data-component='listing-page-title-component']"));
        System.out.println(color.getText());



    }
    }
