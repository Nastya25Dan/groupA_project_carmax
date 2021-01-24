package nastya;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.util.Strings;

import io.github.bonigarcia.wdm.config.Config;
import pages.TradeInPage;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;

public class Sprint2TradeInTest extends TestBase{
	
	@Test 
	public void tradeYourCar() {
		
		SoftAssert soft = new SoftAssert();
		TradeInPage tradeIn = new TradeInPage();
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		BrowserUtils.waitFor(4);
		BrowserUtils.scroll(0, 2000);
		BrowserUtils.waitFor(5);
	
		tradeIn.yearBox.sendKeys(ConfigReader.getProperty("appraisel_year"));
		BrowserUtils.waitForClickablility(tradeIn.makeBox, 2);
		tradeIn.makeBox.sendKeys(ConfigReader.getProperty("appraisel_make"));
		BrowserUtils.waitForClickablility(tradeIn.modelBox, 2);
		tradeIn.modelBox.sendKeys(ConfigReader.getProperty("appraisel_model"));
		BrowserUtils.waitForClickablility(tradeIn.mileageBox, 2);
		tradeIn.mileageBox.sendKeys(ConfigReader.getProperty("appraisel_mileage"));
		BrowserUtils.waitForClickablility(tradeIn.seeYours, 2);
		tradeIn.seeYours.click();
		
		
		BrowserUtils.waitFor(3);
		soft.assertTrue(tradeIn.result.getText().contains(ConfigReader.getProperty("appraisel_year")));
		soft.assertTrue(tradeIn.result.getText().contains(ConfigReader.getProperty("appraisel_make")));
		soft.assertTrue(tradeIn.result.getText().contains(ConfigReader.getProperty("appraisel_model")));
		
		
//		assertTrue(result.contains(year));
//		assertTrue(result.contains(make));
//		assertTrue(result.contains(model));
	}
	
//	@DataProvider 
//	public Object [][] dataProvider(){
//		
//		return new Object[][] {
//		{"2013", "Volkswagen", "Jetta", "10000"},
//		{"2015", "Honda", "Civic", "9000"},
//		{"2009", "Mercedes-Benz", "ML550", "7000"}
//		};
//	}
	

}
