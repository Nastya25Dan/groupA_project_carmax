package burcu;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

import pages.Burcu2Page;

import utilities.BrowserUtils;

public class Sprint2CompareLinksTest extends TestBase {

	@Parameters("browser")
	@Test(groups= {"smoke"})
	
	public void compareLinks() {
		
		
		Burcu2Page b = new Burcu2Page();
       
        b.seeMoreCars.click();
        
        BrowserUtils.waitForPageToLoad(3000);
        
        String firstLink = driver.getCurrentUrl();
        
        driver.navigate().back();
        
        BrowserUtils.waitForPageToLoad(3000);
        
        b.shopAllCars.click();
        
        String secondLink = driver.getCurrentUrl();
        
        assertTrue(firstLink.equals(secondLink));
		
	}
	
	
	
	
}
