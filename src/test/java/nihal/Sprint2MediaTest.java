package nihal;
import  org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Nihal2Page;
import tests.TestBase;
import utilities.BrowserUtils;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import utilities.CSVReader;

public class Sprint2MediaTest extends TestBase {

    @Test(dataProvider = "media")
    public void searchMedia(String email) {
        Nihal2Page n = new Nihal2Page();
        BrowserUtils.scroll(0, 100);
        n.mediaCenter.click();
        n.emailadress.sendKeys(email);
        n.mediaSubmit.click();
        n.forStudentslink.click();
        assertTrue(driver.getTitle().contains("For Students"));

    }




        @DataProvider(name="media")
        public Object[][] getdata(){
            return CSVReader.readData("/Users/nihal/IdeaProjects/groupA_project_carmax/nihaldataset1.csv");
        }
}
