package elena;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.CarsChoicesPage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class Sprint1SuvsFiltersCheckTest extends TestBase{
	
	@Test(groups = {"smoke"})
	public void suvsFiltersCheck() {
		LoginPage lp = new LoginPage();
		lp.shopButton.click();
		lp.suvsField.click();
				
		CarsChoicesPage cc = new CarsChoicesPage();
				
		int lengthFilters = cc.filters.size();
		int expectedLengthFilters = 14;
		assertEquals(lengthFilters, expectedLengthFilters, "Length didn't match");
		
		
int length = cc.recommendedFilters.size();
		int expectedLength = 28;
		assertEquals(length, expectedLength, "Length didn't match");

	}
	
	
	
}