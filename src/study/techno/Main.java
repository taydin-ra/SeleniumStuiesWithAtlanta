package study.techno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utility.BaseClass;

public class Main extends BaseClass {

    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html");

        WebElement element = driver.findElement(By.cssSelector("input[id='fakealert']"));
        element.click();

        WebElement OKButton = driver.findElement(By.cssSelector("button[id='dialog-ok']"));
        OKButton.click();

        // cocuk icin >              div[id='section_1'] legend[id='u_SCX_4586_lbl']+label>span
        // torun icin bosluk         div[id='section_1'] legend[id='u_SCX_4586_lbl']
        // ardisik kardes icin +     div[id='section_1'] legend[id='u_SCX_4586_lbl']+label



    }
}
