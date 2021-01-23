package Elena;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.CarsChoicesPage;
import pages.LoginPage;

public class Sprint1ByPriceCheckTest extends TestBase{
	@Test
	public void byPriceCheck() {
		LoginPage lp = new LoginPage();
		lp.shopButton.click();
		lp.lowPriceField.click();
		CarsChoicesPage cc = new CarsChoicesPage();
		
		String actualPriceRang = cc.actualPriceRange.getText().toString();
		String expectedPriceRange = "Used cars Under $10,000 for Sale";
		assertEquals(actualPriceRang, expectedPriceRange, "Price didn't match");
		
		int k = Integer.parseInt(cc.numberOfFilters.getText().toString().substring(1, 2));
		int expectedNumberOfFilters = 1;
		assertEquals(k, expectedNumberOfFilters, "Number of filters didn't match");
		
		
				
}
}
