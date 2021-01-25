package nihal;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import pages.NihalPage;
import tests.TestBase;
import utilities.BrowserUtils;

import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class Sprint1Policy2Test extends TestBase {
    @Test(priority = 3,groups = "A")
    public void ContactUs() throws IOException {
        NihalPage m= new NihalPage();
        BrowserUtils.scroll(0,100);
        m.privacyPolicy.click();
        BrowserUtils.waitForPageToLoad(1000);
        m.contactUs.click();
        String name="zhot";
        BrowserUtils.takeScreenshot(name);
        AssertJUnit.assertTrue(driver.getPageSource().contains("take control of your data"));

    }
}
