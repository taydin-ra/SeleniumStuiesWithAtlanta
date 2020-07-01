package study.techno;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BaseClass;

import java.util.List;
import java.util.Random;

public class ProjectDestroy extends BaseClass {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://a.testaddressbook.com/sign_in");
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("ttorun16@gmail.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345678");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        driver.findElement(By.cssSelector("a[data-test='addresses']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'New Address')]")).click();
        Thread.sleep(2000);
        String name = "Ayse";
        String lastName = "Turkmen";
        driver.findElement(By.cssSelector("input#address_first_name")).sendKeys(name);
        driver.findElement(By.cssSelector("input#address_last_name")).sendKeys(lastName);
        driver.findElement(By.xpath("//input[@name='address[address1]']")).sendKeys("Anfield Rd");
        driver.findElement(By.xpath("//input[@name='address[address2]']")).sendKeys("Anfield");
        driver.findElement(By.xpath("//input[@name='address[city]']")).sendKeys("Liverpool");
        driver.findElement(By.xpath("//input[@name='address[zip_code]']")).sendKeys("L4 0TH");
        WebElement states = driver.findElement(By.xpath("//select[@name='address[state]']"));
        Select select = new Select(states);
        select.selectByValue("GA");
        driver.findElement(By.xpath("//input[@value='us']")).click();
        driver.findElement(By.xpath("//input[@id='address_birthday']")).sendKeys("03/20/1984");
        driver.findElement(By.cssSelector("input#address_age")).sendKeys("36");
        driver.findElement(By.cssSelector("input#address_website")).sendKeys("https://www.google.com/");
        driver.findElement(By.cssSelector("input#address_phone")).sendKeys("8625747878");
        driver.findElement(By.cssSelector("input#address_interest_dance")).click();
        driver.findElement(By.cssSelector("input#address_interest_climb")).click();
        driver.findElement(By.cssSelector("textarea#address_note")).sendKeys("Never Back Down");
        driver.findElement(By.cssSelector("input[name='commit']")).click();

        WebElement firstName = driver.findElement(By.xpath("//span[contains(text(),'Fernando')]"));

        Assert.assertEquals(name, firstName.getText());
        WebElement lastNamee = driver.findElement(By.xpath("//span[contains(text(),'Torres')]"));

        Assert.assertEquals(lastName, lastNamee.getText());
        driver.findElement(By.cssSelector("a[data-test='addresses']")).click();
        Thread.sleep(2000);
        WebElement edit = driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[1]"));
        edit.click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#address_first_name")).clear();
        driver.findElement(By.cssSelector("input#address_first_name")).sendKeys("Peter");
        driver.findElement(By.cssSelector("input#address_last_name")).clear();
        driver.findElement(By.cssSelector("input#address_last_name")).sendKeys("Chouros");
        driver.findElement(By.cssSelector("input[value='Update Address']")).click();
        WebElement firstName1 = driver.findElement(By.xpath("//span[contains(text(),'Peter')]"));

        Assert.assertEquals("Peter", firstName1.getText());
        WebElement lastNamee1 = driver.findElement(By.xpath("//span[contains(text(),'Chouros')]"));


        Assert.assertEquals("Chouros", lastNamee1.getText());
//
        driver.findElement(By.cssSelector("a[data-test='addresses']")).click();
        Thread.sleep(2000);
         WebElement destroy = driver.findElement(By.xpath("//td[contains(text(),'Ayse')]/..//a[text()='Destroy']"));
         destroy.click();
    }
}
