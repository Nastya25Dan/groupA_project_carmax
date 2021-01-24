package elena;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.CarsChoicesPage;
import pages.LoginPage;

import utilities.BrowserUtils;

public class Sprint2DataPrTitleCheckTest extends TestBase{
	
	
		@Test (dataProvider = "brand")
		public void titleCheck(String carmodel) {
			
			LoginPage lp = new LoginPage();
			CarsChoicesPage cc = new CarsChoicesPage();
			lp.shopButton.click();
			
			lp.ecoFriendly.click();
			try{BrowserUtils.waitForClickablility(lp.ecoFriendly, 10);
			jsExecutor.executeScript("arguments[0].click();", lp.ecoFriendly);}
			catch(Exception e) {}
			
//			lp.commuterType.click();
			BrowserUtils.waitForPageToLoad(5000);
			try{BrowserUtils.waitForClickablility(cc.popUpHandle, 10);
			jsExecutor.executeScript("arguments[0].click();", cc.popUpHandle);}
			catch(Exception e) {}
			
			cc.inputSearch.sendKeys(carmodel + Keys.ENTER);
			BrowserUtils.waitForTitleContains(carmodel, 5);
			
			BrowserUtils.waitForTitleContains(carmodel, 5);
			Assert.assertTrue(driver.getTitle().contains(carmodel));

	}
		
		
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
}
