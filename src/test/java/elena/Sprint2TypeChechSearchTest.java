package elena;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.CarsChoicesPage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class Sprint2TypeChechSearchTest extends TestBase{
	
	@Parameters("cartype")
	@Test
	public void typeCheckSearch(String cartype) {
		
		LoginPage lp = new LoginPage();
		
		lp.shopButton.click();
		lp.ecoFriendly.click();
		CarsChoicesPage cc = new CarsChoicesPage();
		BrowserUtils.waitForPageToLoad(5000);
		
		try{BrowserUtils.waitForClickablility(cc.popUpHandle, 10);
		jsExecutor.executeScript("arguments[0].click();", cc.popUpHandle);}
		catch(Exception e) {}
		BrowserUtils.waitForPageToLoad(5000);

		cc.inputSearch.sendKeys(cartype);
		cc.inputSearch.sendKeys(Keys.ENTER);
		
		
		BrowserUtils.waitForPageToLoad(5000);
		
		try{BrowserUtils.waitForClickablility(cc.cartype, 1000);
		jsExecutor.executeScript("arguments[0].click();", cc.cartype);}
		catch(Exception e) {}
		BrowserUtils.waitForClickablility(cc.cartype, 5);
		
		BrowserUtils.waitForTitleContains(cartype, 5);
		

	String actualType = cc.cartype.getText().toString();
//	System.out.println(actualType);

	String expectedType = cartype;
	

	assertTrue(actualType.contains(expectedType));
	
	}
	
}