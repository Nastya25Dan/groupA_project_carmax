package nihal;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import pages.NihalPage;
import tests.TestBase;
import utilities.BrowserUtils;

import java.io.IOException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class Sprint1HowItWorksTest extends TestBase {

    @Test(priority = 4,groups = "A")
    public void HowItWorks(){
        NihalPage m = new NihalPage();
        BrowserUtils.scroll(0,100);
        m.howItWorks.click();
        String actualurl=driver.getCurrentUrl();
        String expectedurl="https://www.carmax.com/car-financing";
        AssertJUnit.assertEquals(actualurl,expectedurl);

    }
    @Test(priority  =5,groups = "A")
    public void verifyText() throws IOException {
        NihalPage m = new NihalPage();
        BrowserUtils.scroll(0,100);
        m.howItWorks.click();
        m.approveButton.click();
        AssertJUnit.assertTrue(driver.getPageSource().contains("Let's calculate a budget that works for you.*"));

    }

}
