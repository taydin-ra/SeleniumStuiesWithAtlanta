package scrolling;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunExample {
    @Test
    void divide(){
        int a=6;
        int b=0;

        Assert.assertEquals(0,a/b);
    }

    @Test(dependsOnMethods = {"divide"},alwaysRun = true)
    void divide2(){
        int a=6;
        int b=0;

        Assert.assertEquals("ssnnnnn","ssnnnnn");
    }
}
