package study.techno;

import com.sun.xml.internal.rngom.parse.host.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseClass;

import java.util.List;

public class Sauce extends BaseClass {
    /*
    find element            ile         findelements arasindki fark
    -sadece bi tane element             -list
    -nosuchelement exception veriyor    -bos list veriyor

     */
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://www.saucedemo.com/inventory.html");
//        driver.findElement(By.xpath("//div[contains(text(),'29.99')]")).click();
        // urunlerin listi
        List<WebElement> items=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
       // System.out.println(items.size());
        // add to cartlarin listi
        List<WebElement> addToCart=driver.findElements(By.xpath("//button[@class='btn_primary btn_inventory']"));

        String itemName="Test.allTheThings() T-Shirt (Red)";
        for (int i = 0; i <items.size() ; i++) {
            System.out.println(items.get(i).getText());

            if(items.get(i).getText().equalsIgnoreCase(itemName)){

                addToCart.get(i).click();

            }

        }
        addToCart.get(3).click();
        addToCart.get(0).click();

    }
}
