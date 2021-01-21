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


public class Sprint2ScheduleTest extends TestBase{

    @Test(dataProvider = "schedule")
    public void getSchedule(String name,String lastName,String phoneNumber,String email){

        Nihal2Page n= new Nihal2Page();
        n.scheduleApp.click();
        n.firstName.sendKeys(name);
        n.lastName.sendKeys(lastName);
        n.phone.sendKeys(phoneNumber);
        n.email.sendKeys(email);
        n.nextButton.click();
        assertTrue(driver.getTitle().contains("Schedule an App"));

    }
    @DataProvider(name="schedule")
    public Object[][] getdata(){
        return CSVReader.readData("/Users/nihal/IdeaProjects/groupA_project_carmax/nihaldataset.csv");
    }
}
