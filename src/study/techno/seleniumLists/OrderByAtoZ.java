package study.techno.seleniumLists;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BaseClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderByAtoZ extends BaseClass {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/inventory.html");
        WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Name (Z to A)");

        List<WebElement> items = driver.findElements(By.cssSelector("div[class='inventory_item_name']"));
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i <items.size() ; i--) {

            list1.add(items.get(i).getText());

            list2.add(items.get(i).getText());
        }
        Collections.sort(list1);
        System.out.println(list1.equals(list2));

//        list1.add("Ankara");
//        list1.add("Bursa");
//
//        list2.add("Bursa");
//        list2.add("Ankara");
//        System.out.println(list1.equals(list2));  // sirasi ayni olmali listlerde esit cikmasi icin


    }
}