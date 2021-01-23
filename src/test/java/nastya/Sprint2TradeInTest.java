package nastya;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.util.Strings;

import pages.TradeInPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class Sprint2TradeInTest extends TestBase{
	
	@Test (dataProvider = "dataProvider")
	public void tradeYourCar(String year, String make, String model, String mileage) {
		
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TradeInPage tradeIn = new TradeInPage();
		BrowserUtils.scroll(0, 1500);
		tradeIn.yearBox.sendKeys(year);
		(tradeIn.makeBox).click();
		tradeIn.makeBox.sendKeys(make);
//		Select s = new Select(tradeIn.makeBox);
//		s.selectByVisibleText(make);
		
		/*org.openqa.selenium.support.ui.UnexpectedTagNameException:
		Element should have been "select" but was "input"*/
		
//		Select s1 = new Select(tradeIn.modelBox);
//		s1.selectByVisibleText(model);

		tradeIn.modelBox.click();
		tradeIn.modelBox.sendKeys(model);
		
		tradeIn.mileageBox.sendKeys(mileage);
		tradeIn.seeYours.click();
		String result = tradeIn.result.getText();
		System.out.println(result);
//		assertTrue(result.contains(year));
//		assertTrue(result.contains(make));
//		assertTrue(result.contains(model));
	}
	
	@DataProvider 
	public Object [][] dataProvider(){
		
		return new Object[][] {
		{"2013", "Volkswagen", "Jetta", "190000"}
		,
		{"2015", "Honda", "Civic", "9000"},
		{"2009", "Mercedes-Benz", "ML550", "7000"}
		};
	}
	/**
	 * when entering information manually works, but when enters automatically,
	 * message popup saying the car is not on the list*/
	

}
