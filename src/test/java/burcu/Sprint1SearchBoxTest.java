package burcu;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BurcuPage;

import static org.testng.Assert.assertTrue;

public class Sprint1SearchBoxTest extends TestBase {

    @Test(dataProvider = "CarModel")
    public void search(String carModel){
        BurcuPage b = new BurcuPage();
        b.searchBox.sendKeys(carModel+ Keys.ENTER);
        AssertJUnit.assertTrue(driver.getCurrentUrl().contains(carModel));
    }

    @DataProvider(name="CarModel")
    public Object[][] getCar(){
        return new Object[][]{
                {"Honda"},
                {"Toyota"},
                {"Nissan"},
                {"Nissan"},
                {"Hyundai"}



        };
    }
}
