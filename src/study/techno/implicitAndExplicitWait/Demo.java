package study.techno.implicitAndExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseClass;

import java.util.List;

public class Demo extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(" http://demo.automationtesting.in/WebTable.html");
    }
}
