package study.techno.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseClass;
import org.junit.Assert;

import java.util.List;

public class Alert extends BaseClass {
    public static void main(String[] args) {
        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        List<WebElement> usernames = driver.findElements(By.xpath("//table[@class='table']//tbody//tr//td[2]"));
        for (WebElement name : usernames) {
            System.out.println(name.getText());
            if(name.getText().equals("jacobs")){
                System.out.println("pass");
            }else{
                System.out.println("fail");
            }

        }
    }
}
