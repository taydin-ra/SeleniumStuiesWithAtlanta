package study.techno.replit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseClass;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;

public class Frame1 extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
    /*
    Navigate to https://www.seleniumeasy.com/test/basic-first-form-demo.html

Click on List box

Click Box Strap List Box

Click on bootstrap-duallist and click on right arrow

Click on  Dapibus ac facilisis in  and click on right arrow

Click on Cras husto odio and click on left arrow

Click on Morbi leo risus and click on left arrow

Left box list should be

Morbi leo risus
Porta ac consectetur ac
Vestibulum at eros
Cras justo odio
Morbi leo risus

Right box table should be

Dapibus ac facilisis in
Porta ac consectetur ac
Vestibulum at eros
bootstrap-duallist
Dapibus ac facilisis in
     */
        WebDriverWait wait = new WebDriverWait(driver, 4);
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html ");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='List Box']")).click();

        driver.findElement(By.xpath("(//a[text()='Bootstrap List Box'])[2]")).click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("(//a[text()='Bootstrap List Box'])[2]")));

        driver.findElement(By.xpath("(//li[contains(text(),'Dapibus ac facilisis in')])[1]")).click();

        driver.findElement(By.cssSelector("button.move-right")).click();

        driver.findElement(By.xpath("//li[@class='list-group-item active']")).click();

        driver.findElement(By.xpath("//li[contains(text(),'Cras justo odio')]")).click();

        driver.findElement(By.cssSelector("button.move-left")).click();
    }
}
