package burcu;

import static org.testng.Assert.assertEquals;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.List;

import org.testng.annotations.Test;

import pages.Burcu2Page;

import utilities.BrowserUtils;


public class Sprint2CheckFiltersTest2 extends TestBase {
	
	
		
		@Test
		
		public void checkFilterSize() {
			
		Burcu2Page b = new Burcu2Page();
		
		BrowserUtils.scroll(0,500);
	    
	    b.shopAllCars.click();
	    
	    BrowserUtils.waitForPageToLoad(3000);
	    
	    List<String> filterList = BrowserUtils.getElementsText(b.filtersList);
	    
	    assertEquals(filterList.size(), 16);
	
	

}
		
		@Test
		
		public void checkFilterContent() {
			
		Burcu2Page b = new Burcu2Page();
			
	    BrowserUtils.scroll(0,500);
	    
	    b.shopAllCars.click();
	    
	    BrowserUtils.waitForPageToLoad(3000);
	    
	    List<String> filterList = BrowserUtils.getElementsText(b.filtersList);
	    
	    System.out.println(filterList);
	    
	    List<String> expectedElements=new ArrayList<>(Arrays.asList("Make", "Type", "Year"));

	    System.out.println(expectedElements);
	    
	    assertTrue(filterList.containsAll(expectedElements));
		
}
}