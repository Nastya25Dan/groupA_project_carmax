package elena;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
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
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.CarsChoicesPage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class Sprint2EcoFriendlyTest extends TestBase{
		
	@Test(groups = {"smoke"})
	public void ecoFriendly() {
		
		LoginPage lp = new LoginPage();
		
		lp.shopButton.click();
		lp.ecoFriendly.click();
		CarsChoicesPage cc = new CarsChoicesPage();
		
		WebElement k = cc.ecoCar;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", k);
		

	cc.ecoCarFeatures.click();
	int actualMPG = Integer.parseInt(cc.actualMPG.getText().toString().substring(3,5));
	

	int expectedMPG = 35;
	
	AssertJUnit.assertTrue(actualMPG>=expectedMPG, "This is NOT eco car");
	
	
	}
	
}