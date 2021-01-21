package nihal;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Nihal2Page;
import tests.TestBase;
import utilities.BrowserUtils;

import static org.testng.Assert.assertTrue;

public class Sprint2FindStoreTest extends TestBase {
    @Test(dataProvider = "zipcode")
    public void searchStore(String zip){
        Nihal2Page n = new Nihal2Page();
        BrowserUtils.scroll(0,100);
        n.findStore.click();
        n.searchZip.sendKeys(zip+ Keys.ENTER);
        assertTrue(driver.getPageSource().contains("CarMax stores near "+zip));

    }

    @DataProvider(name="zipcode")
    public Object[][] getZip(){

        return new Object[][]{

                {"27514"},{"27516"},{"27517"},{"27519"}};
    }

}
