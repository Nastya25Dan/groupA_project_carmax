package burcu;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import pages.BurcuPage;

import static org.testng.Assert.assertTrue;

@Test
public class Sprint1SignInTest extends TestBase {

    @Test//verify the title has Sign In | MyCarMax
    public void getFilter(){
        BurcuPage b = new BurcuPage();
        b.icon.click();
        actions.moveToElement(b.signin).click().build().perform();
        //assertTrue(driver.getTitle().contains("Sign In "));

    }
}
