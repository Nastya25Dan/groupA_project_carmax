package nihal;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import pages.NihalPage;
import tests.TestBase;
import utilities.BrowserUtils;

import static org.testng.Assert.assertEquals;

public class Sprint1PolicyTest extends TestBase {

    @Test(priority = 2,groups = "A")
    public void checkPrivacyPolicy(){
        NihalPage m=new NihalPage();
        BrowserUtils.scroll(0,100);
        m.privacyPolicy.click();
        String actualResult=driver.getTitle();
        String expectedResult="Privacy Policy | CarMax";
        AssertJUnit.assertEquals(actualResult,expectedResult);


    }
}
