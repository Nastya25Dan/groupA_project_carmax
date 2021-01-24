package Elena;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.CarsChoicesPage;
import pages.LoginPage;
import tests.TestBase;
import utilities.BrowserUtils;

public class Sprint2ShopByYearTest extends TestBase{
	@Test
	public void shopByYear() {
		
		LoginPage lp = new LoginPage();
		CarsChoicesPage cc = new CarsChoicesPage();
		lp.shopButton.click();
		
		lp.shopByYear.click();
		
		try{BrowserUtils.waitForClickablility(cc.popUpHandle, 10);
		jsExecutor.executeScript("arguments[0].click();", cc.popUpHandle);}
		catch(Exception e) {}
		
		
		String actualYear = cc.year.getText().toString();

		String expectedYear = "2019";
		assertEquals(actualYear,expectedYear);
		
	}
	
}
