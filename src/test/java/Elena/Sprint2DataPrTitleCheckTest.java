package Elena;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.CarsChoicesPage;
import pages.LoginPage;
import tests.TestBase;
import utilities.BrowserUtils;

public class Sprint2DataPrTitleCheckTest extends TestBase{
	@DataProvider (name="brand")
	public Object [][] getData(){
		Object [][] data = new Object[][] {
			{"GMC"},
			{"Toyota"},
			{"Dodge"},
			{"Ford"},
			{"Lexus"},
			{"Chevrolet"}
		};
		return data;
	}
	    @Parameters ( "carmodel" )
		@Test (dataProvider = "brand")
		public void titleCheck(String carmodel) {
			
			LoginPage lp = new LoginPage();
			CarsChoicesPage cc = new CarsChoicesPage();
			lp.shopButton.click();
			
			lp.commuterType.click();
			
									
			cc.inputSearch.sendKeys(carmodel + Keys.ENTER);

			try{BrowserUtils.waitForClickablility(cc.popUpHandle, 10);
			jsExecutor.executeScript("arguments[0].click();", cc.popUpHandle);}
			catch(Exception e) {}
			
			BrowserUtils.waitForPageToLoad(5000);
			BrowserUtils.waitForTitleContains(carmodel, 5);
			Assert.assertTrue(driver.getTitle().contains(carmodel));

	}
}
