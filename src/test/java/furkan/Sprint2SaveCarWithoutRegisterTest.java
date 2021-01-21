package furkan;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import pages.AfterSign;
import pages.MainPage;
import pages.SearchCar;
import utilities.BrowserUtils;
import utilities.Driver;

public class Sprint2SaveCarWithoutRegisterTest extends TestBase {
	
	@Parameters("car")
	@Test
	public void saveCar(String car) {
		
		MainPage mp = new MainPage();
		mp.mainSearchBox.sendKeys(car,Keys.ENTER);
		AfterSign as = new AfterSign();
		SearchCar sc = new SearchCar();
		
		try{BrowserUtils.waitForClickablility(sc.keepStoreButton, 5);
		jsExecutor.executeScript("arguments[0].click();", sc.keepStoreButton);}
		catch(Exception e) {}
		
		sc.savedCar.click();
		
		try{BrowserUtils.waitForClickablility(sc.acceptMessage, 5);
		jsExecutor.executeScript("arguments[0].click();", sc.acceptMessage);}
		catch(Exception e) {}
		
		
		BrowserUtils.waitFor(5);
		mp.saveButton.click();
		String savedCar=Driver.getDriver().findElement(By.xpath("//h2[@class='kmx-vehicle-tile__ymmt']")).getText();
		assertTrue(savedCar.contains(car));
	}

}
