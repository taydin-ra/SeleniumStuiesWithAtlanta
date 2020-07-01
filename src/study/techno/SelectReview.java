package study.techno;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utility.BaseClass;

import java.util.List;

public class SelectReview extends BaseClass {
    /*
    if the price is greater than 300 click on that airline
     */
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://newtours.demoaut.com/mercuryreservation.php");

        driver.manage().window().maximize();


        // Click on sign-on tab
        WebElement signOnTab = driver.findElement(By.cssSelector("td.mouseOut a[href='mercurysignon.php']"));
        signOnTab.click();

        // fill out the username box

        WebElement userNameBox = driver.findElement(By.xpath("//input[@name='userName']"));
        userNameBox.sendKeys("ttorun");

        // password fill out

        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='password']"));
        passwordBox.sendKeys("12345678");

        // click on submit
        WebElement submtButton = driver.findElement(By.cssSelector("input[name='login']"));
        submtButton.click();

        // click on roundTrip

        WebElement roundTrip = driver.findElement(By.xpath("//input[@value='roundtrip']"));
        roundTrip.click();

        // passengers 3

//        WebElement passCount=driver.findElement(By.cssSelector("select[name='passCount'] >option[value='3']"));
//        passCount.click();
        WebElement passCount = driver.findElement(By.cssSelector("select[name='passCount']"));

        passCount.click();

        Select select = new Select(passCount);  // dropdown menu

        select.selectByVisibleText("3");

        WebElement departFrom = driver.findElement(By.xpath("//select[@name='fromPort']"));

        Select depart = new Select(departFrom);

        depart.selectByIndex(4);

        depart.selectByVisibleText("London");

        WebElement month = driver.findElement(By.cssSelector("select[name='fromMonth']"));

        Select select1 = new Select(month);

        select1.selectByVisibleText("February");

        WebElement fromDay = driver.findElement(By.xpath("//select[@name='fromDay']"));

        Select selectDay = new Select(fromDay);

        selectDay.selectByValue("17");

        WebElement toPort = driver.findElement(By.cssSelector("select[name='toPort']"));

        Select select2 = new Select(toPort);

        select2.selectByVisibleText("New York");

        WebElement firstClass = driver.findElement(By.cssSelector("input[value='First']"));

        firstClass.click();

        WebElement airline = driver.findElement(By.cssSelector("select[name='airline']"));

        Select select3 = new Select(airline);

        select3.selectByVisibleText("Unified Airlines");

        select3.selectByIndex(3);
//input[@name='outFlight']/../../following-sibling::tr//b[contains(text(),'Price')]
        //td//b[contains(text(),'Price')]
        WebElement continueButton = driver.findElement(By.xpath("//input[@type='image']"));
        continueButton.click();
        List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));
        System.out.println(radio.size());

        List<WebElement> pr = driver.findElements(By.xpath("//input[@name='outFlight']/../../following-sibling::tr//b[contains(text(),'Price')]"));
        System.out.println(pr.size());
        for (int i = 0; i < pr.size(); i++) {
           // System.out.println(pr.get(i).getText());
            String s = pr.get(i).getText();
            s = s.replace("Price: $", "");
            int a = Integer.parseInt(s);
           // System.out.println(a);
            if (a <274) {
              radio.get(i).click();
            }
        }
    }


}

