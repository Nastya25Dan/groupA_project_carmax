package elena;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.CarsChoicesPage;
import pages.LoginPage;
public class Sprint1ByBrandFiltersCheckTest extends TestBase{
	@Test(groups = {"smoke"})
	public void byBrandFiltersCheck() {
		LoginPage lp = new LoginPage();
		
		lp.shopButton.click();
		lp.hondaField.click();
		CarsChoicesPage cc = new CarsChoicesPage();
				
		int lengthFilters = cc.filters.size();
		int expectedLengthFilters = 14;
		assertEquals(lengthFilters, expectedLengthFilters, "Length didn't match");
		
		int length = cc.recommendedFilters.size();
		int expectedLength = 23;
		assertEquals(length, expectedLength, "Length didn't match");
		
}
}
