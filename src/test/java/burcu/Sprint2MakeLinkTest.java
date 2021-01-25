package burcu;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import pages.Burcu2Page;

import utilities.BrowserUtils;

public class Sprint2MakeLinkTest extends TestBase{
	
	
	@Test
	
	public void makeLink1() {
	
	Burcu2Page b = new Burcu2Page();
	
	BrowserUtils.scroll(0,500);
	       
	b.shopAllCars.click();

	BrowserUtils.waitForPageToLoad(5000);
	
	actions.moveToElement(b.keepinStore).click().build().perform();
	
	BrowserUtils.waitForPageToLoad(5000);
	
	b.filtersMake.click();
	
	BrowserUtils.waitForPageToLoad(5000);
	
	BrowserUtils.waitFor(2);
	
	List<String> listOfMake = BrowserUtils.getElementsText(b.makeList);
	
	System.out.println(listOfMake);
    
    assertEquals(listOfMake.size(), 35);
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
