package study.techno;

import org.openqa.selenium.By;
import utility.BaseClass;

public class Day2 extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        driver.get("http://newtours.demoaut.com/mercuryreservation.php");

        driver.manage().window().maximize();

        /*
         css  input[name='username']

         xpath //input[@name='username']

               // input[text()='Georgia']
               input[contains('@class',thjkl)]

               css daha hizli xpathe gore
               css de parent tan child a gidiliyor ama childdan parent a gidilmiyor
               xpathde ikisi de oluyor parent tan child a ve childdan parent a da gidiliyor
         */
         /*
         sign-on tab
         username
         password
         submit
          */

    }
}
