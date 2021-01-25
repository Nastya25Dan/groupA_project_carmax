package elena;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.CarsChoicesPage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class Sprint1SuvsFiltersCheckTest extends TestBase{
	
	@Test(groups = {"smoke"})
	public void suvsFiltersCheck() {
		LoginPage lp = new LoginPage();
		lp.shopButton.click();
		BrowserUtils.waitForPageToLoad(5000);
		try{BrowserUtils.waitForClickablility(lp.suvsField, 10);
		jsExecutor.executeScript("arguments[0].click();", lp.suvsField);}
		catch(Exception e) {}
		
		lp.suvsField.click();
		
		CarsChoicesPage cc = new CarsChoicesPage();
		try{BrowserUtils.waitForClickablility(cc.popUpHandle, 10);
		jsExecutor.executeScript("arguments[0].click();", cc.popUpHandle);}
		catch(Exception e) {}
		
		BrowserUtils.waitForPageToLoad(5000);
		BrowserUtils.waitForTitleContains("SUVs", 5);
		int lengthFilters = cc.filters.size();
		int expectedLengthFilters = 14;
		AssertJUnit.assertEquals(lengthFilters, expectedLengthFilters, "Length didn't match");
		
		
int length = cc.recommendedFilters.size();
		int expectedLength = 28;
		AssertJUnit.assertEquals(length, expectedLength, "Length didn't match");

	}
	
	
	
}