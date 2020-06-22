package study.techno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BaseClass;

public class Main  extends BaseClass {

    public static void main(String[] args) {

        driver.get("https://www.etsy.com/");

        WebElement element = driver.findElement(By.cssSelector("input[data-id='search-query']")); // xpathden daha hizli calisir
        element.sendKeys("Garden");

        WebElement searchButton=driver.findElement(By.cssSelector("button[aria-label='Search']"));
        searchButton.click();

        // cocuk icin >              div[id='section_1'] legend[id='u_SCX_4586_lbl']+label>span
        // torun icin bosluk         div[id='section_1'] legend[id='u_SCX_4586_lbl']
        // ardisik kardes icin +     div[id='section_1'] legend[id='u_SCX_4586_lbl']+label



    }
}
