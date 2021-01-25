package nihal;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Nihal2Page;
import tests.TestBase;
import utilities.BrowserUtils;

import static org.testng.Assert.assertTrue;

public class Sprint2CheckLink extends TestBase{

    @Test
    public void clickLink(){
        Nihal2Page n = new Nihal2Page();
        BrowserUtils.scroll(0,100);
        n.viewInventory.click();
        AssertJUnit.assertTrue(driver.getCurrentUrl().contains("cars/all"));
    }

    @Test
    public void clickLink1(){
        Nihal2Page n = new Nihal2Page();
        BrowserUtils.scroll(0,100);
        n.investorRelations.click();
        AssertJUnit.assertTrue(driver.getPageSource().contains("Investor Relations"));
    }
}
