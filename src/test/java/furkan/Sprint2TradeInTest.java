package furkan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.MainPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class Sprint2TradeInTest extends TestBase{
	
	@Test
	public void tradeIn() {
		
		SoftAssert soft = new SoftAssert();
		MainPage mp = new MainPage();
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		BrowserUtils.waitFor(4);
		BrowserUtils.scroll(0, 2000);
		BrowserUtils.waitFor(5);
		mp.tradeInYear.sendKeys(ConfigReader.getProperty("trade_in_year"));
		BrowserUtils.waitForClickablility(mp.tradeInMake, 3);
		mp.tradeInMake.sendKeys(ConfigReader.getProperty("trade_in_make"));
		BrowserUtils.waitForClickablility(mp.tradeInModel, 3);
		mp.tradeInModel.sendKeys(ConfigReader.getProperty("trade_in_model"));
		BrowserUtils.waitForClickablility(mp.tradeInMileage, 3);
		mp.tradeInMileage.sendKeys(ConfigReader.getProperty("trade_in_mileage"));
		BrowserUtils.waitForClickablility(mp.tradeInSubmitButton, 3);
		mp.tradeInSubmitButton.click();
		BrowserUtils.waitFor(3);
		soft.assertTrue(mp.tradeInResult.getText().contains(ConfigReader.getProperty("trade_in_make")));
		soft.assertTrue(mp.tradeInResult.getText().contains(ConfigReader.getProperty("trade_in_year")));
		soft.assertTrue(mp.tradeInResult.getText().contains(ConfigReader.getProperty("trade_in_model")));
		
	}

}
