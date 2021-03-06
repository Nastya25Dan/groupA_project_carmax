package burcu;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import org.testng.annotations.Test;

import pages.Burcu2Page;

import utilities.BrowserUtils;


public class Sprint2CheckFilters2Test extends TestBase {
	
	
		
		@Test(groups= {"smoke"})
		
		public void checkFilterSize() {
			
		Burcu2Page b = new Burcu2Page();
		
		BrowserUtils.scroll(0,500);
	    
	    b.shopAllCars.click();
	    
	    BrowserUtils.waitForPageToLoad(3000);
	    
	    List<String> filterList = BrowserUtils.getElementsText(b.filtersList);
	    
	    AssertJUnit.assertEquals(filterList.size(), 16);
	
	

}
		
		@Test(groups= {"smoke"})
		
		public void checkFilterContent() {
			
		Burcu2Page b = new Burcu2Page();
			
	    BrowserUtils.scroll(0,500);
	    
	    b.shopAllCars.click();
	    
	    BrowserUtils.waitForPageToLoad(3000);
	    
	    List<String> filterList = BrowserUtils.getElementsText(b.filtersList);
	    
	    System.out.println(filterList);
	    
	    List<String> expectedElements=new ArrayList<>(Arrays.asList("Make", "Type", "Year"));

	    System.out.println(expectedElements);
	    
	    AssertJUnit.assertTrue(filterList.containsAll(expectedElements));
		
}
}