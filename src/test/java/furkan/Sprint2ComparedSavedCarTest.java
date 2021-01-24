package furkan;

import static org.testng.Assert.*;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.AfterSign;
import pages.MainPage;
import pages.SavedCarsPage;
import pages.SearchCar;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;


	public class Sprint2ComparedSavedCarTest extends TestBase {
		
		
		@Test(dataProvider = "dataProvider")
		public void compareSavedCars(String car) {
			
			SoftAssert soft = new SoftAssert();
			MainPage mp = new MainPage();
			AfterSign as = new AfterSign();
			SearchCar sc = new SearchCar();
			SavedCarsPage scp = new SavedCarsPage();
			
			Driver.getDriver().get(ConfigReader.getProperty("url"));
			mp.mainSearchBox.sendKeys(car,Keys.ENTER);
	
			try{BrowserUtils.waitForClickablility(sc.keepStoreButton, 5);
			jsExecutor.executeScript("arguments[0].click();", sc.keepStoreButton);}
			catch(Exception e) {}
			
			BrowserUtils.waitForClickablility(sc.savedCar, 5);
			actions.click(sc.savedCar).build().perform();
			String car1=sc.savedCarName.getText();
			
			try{BrowserUtils.waitForClickablility(sc.acceptMessage, 5);
			jsExecutor.executeScript("arguments[0].click();", sc.acceptMessage);}
			catch(Exception e) {}
			
			BrowserUtils.waitForClickablility(sc.savedCar2, 5);
			actions.click(sc.savedCar2).build().perform();
			String car2=sc.savedCarName2.getText();
			
			BrowserUtils.waitFor(5);
			mp.saveButton.click();
			scp.compareButton.click();
			BrowserUtils.waitFor(4);
			String expectedMessage="Compare 2 Vehicles";
			soft.assertTrue(expectedMessage.contains(scp.compareTitle.getText()));
			
			List<String>presentCarList=new ArrayList<>();
			
			List<WebElement>cars = scp.comparedCars;
			
			for(WebElement w:cars) {
				presentCarList.add(w.getText());
			}
			
			List<String>expectedCarList=new ArrayList<>();
			expectedCarList.add(car1);
			expectedCarList.add(car2);
			
			soft.assertTrue(expectedCarList.containsAll(presentCarList));
		}
		
@DataProvider
public Object[][] dataProvider(){
	
	return new Object[][] {
		{"Nissan"},{"Ford"}
	};
}

}
