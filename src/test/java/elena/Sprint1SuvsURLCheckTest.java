package elena;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;


public class Sprint1SuvsURLCheckTest extends TestBase{
	@Test
	public void suvsURLCheck() {
		
		LoginPage lp = new LoginPage();
		lp.shopButton.click();
		lp.suvsField.click();
		
		WebElement b = driver.findElement(By.xpath("(//button[@class='kmx-button kmx-button--tertiary kmx-button--flat'])[1]"));
		b.click();
		String expectedURL = "https://www.carmax.com/cars/sport-utilities";
		String actualURL = driver.getCurrentUrl();
		
		AssertJUnit.assertEquals(actualURL, expectedURL, "Urls didn't match");
	}
}
