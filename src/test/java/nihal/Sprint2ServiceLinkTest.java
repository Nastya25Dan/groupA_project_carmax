package nihal;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Nihal2Page;
import utilities.BrowserUtils;
import utilities.CSVReader;

import static org.testng.Assert.assertTrue;

public class Sprint2ServiceLinkTest extends TestBase {

    @Test(groups = {"smoke"})
    public void serviceRepair(){
        Nihal2Page n=new Nihal2Page();
        n.serviceRepair.click();
        n.serviceOptionButton.click();
        n.findShop.click();
        assertTrue(driver.getTitle().contains("RepairPal"));
    }


    }

