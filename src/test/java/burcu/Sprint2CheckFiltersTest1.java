package burcu;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import pages.Burcu2Page;

import utilities.BrowserUtils;


public class Sprint2CheckFiltersTest1 extends TestBase {
	
	
	
		@Test
		
		public void check1() {
			
		Burcu2Page b = new Burcu2Page();
	       
	    b.seeMoreCars.click();
	    
	    BrowserUtils.waitForPageToLoad(3000);
	    
	    AssertJUnit.assertTrue(driver.getPageSource().contains("Filters"));
	


}
		@Test
		
		public void check2() {
			
		Burcu2Page b = new Burcu2Page();
				
		BrowserUtils.scroll(0,500);
		       
		b.shopAllCars.click();
		
		BrowserUtils.waitForPageToLoad(3000);
		    
		AssertJUnit.assertTrue(driver.getPageSource().contains("Filters"));
		
		
}
}