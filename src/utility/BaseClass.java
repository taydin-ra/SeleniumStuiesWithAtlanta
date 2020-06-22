package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver", "/Users/yavuzaydin/Desktop/selenium/chromedriver 2");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
