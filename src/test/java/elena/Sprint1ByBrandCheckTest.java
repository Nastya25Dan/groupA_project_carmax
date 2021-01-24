package elena;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.LoginPage;


public class Sprint1ByBrandCheckTest extends TestBase{
	@Test
	public void byBrandCheck() {
	LoginPage lp = new LoginPage();
	lp.shopButton.click();
	lp.hondaField.click();
	
	
	String expectedURL = "https://www.carmax.com/cars/honda";
	String actualURL = driver.getCurrentUrl();
	
	assertEquals(actualURL, expectedURL, "Urls didn't match");
	
    
	
}
}
