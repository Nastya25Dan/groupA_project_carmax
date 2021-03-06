package burcu;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.Burcu2Page;

import utilities.BrowserUtils;

public class Sprint2TitleForMakeTest extends TestBase {
	
	

	@Test
	
	public void makeLink2() {
		
		Burcu2Page b = new Burcu2Page();
		
		BrowserUtils.scroll(0,500);
		       
		b.shopAllCars.click();

		BrowserUtils.waitForPageToLoad(3000);
		
		actions.moveToElement(b.keepinStore).click().build().perform();
		
		BrowserUtils.waitForPageToLoad(3000);
		
		b.filtersMake.click();
		
		BrowserUtils.waitForPageToLoad(5000);
		
		BrowserUtils.waitFor(1);
		
		b.acuraCheckBox.click();
		
		BrowserUtils.waitForPageToLoad(5000);
		
		BrowserUtils.waitFor(2);
		
		b.audiCheckBox.click();
		
		BrowserUtils.waitForPageToLoad(5000);
		
		BrowserUtils.waitFor(2);
		
		System.out.println(driver.getCurrentUrl());
		
		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("acura/audi"));
		
	}	

}
