package study.techno;

import com.sun.xml.internal.rngom.parse.host.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseClass;

import java.util.List;

public class Sauce extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.saucedemo.com/inventory.html");
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        List<WebElement> addTo = driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
            if (list.get(i).getText().contains("Sauce Labs Bike Light")) {
                addTo.get(i).click();
            }

        }
        addTo.get(3).click();
        addTo.get(5).click();
        Thread.sleep(2000);
        ////button[@class='btn_secondary cart_button']/../..//div[text()='Sauce Labs Bike Light']
        WebElement cart = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        cart.click();
//        WebElement removeButton=driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']/../..//div//button"));
//        removeButton.click();
        //(//button[@class='btn_secondary cart_button'])[2] alternatif yol
        WebElement remove=driver.findElement(By.xpath("//div[text()='15.99']/following-sibling::button"));
        remove.click();
    }
}
