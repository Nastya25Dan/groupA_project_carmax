package elena;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.CarsChoicesPage;
import pages.LoginPage;

import utilities.BrowserUtils;

public class Sprint2EngineCheckTest extends TestBase{
	@Test
	public void engineCheck() {
		
		LoginPage lp = new LoginPage();
		CarsChoicesPage cc = new CarsChoicesPage();
		
		lp.shopButton.click();
		
		
		BrowserUtils.waitForPageToLoad(5000);
		
		lp.nextButton.click();
		
		lp.dieselField.click();
		
		try{BrowserUtils.waitForClickablility(cc.popUpHandle, 10);
		jsExecutor.executeScript("arguments[0].click();", cc.popUpHandle);}
		catch(Exception e) {}
		
		
		cc.dieselCarOption.click();
		
		cc.ecoCarFeatures.click();
		String d = cc.dieselEngine.getText().toString();

		
		String expectedEngine = "Turbo Diesel Engine";
		AssertJUnit.assertEquals(d, expectedEngine, "Engine didn't match");
		
		
		
		
	}
}
