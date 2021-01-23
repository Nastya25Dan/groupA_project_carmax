package nastya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.NastyaPage;
import utilities.BrowserUtils;

public class Sprint1Tests extends TestBase{
	
	@Test
	public void getCarType() {
		
		NastyaPage n = new NastyaPage();
		
		BrowserUtils.scroll(0, 500);
		n.suvButton.click();
		n.crossover.click();

	}
	
	@Test
	public void dropdownTest() {

		NastyaPage n = new NastyaPage();

		BrowserUtils.scroll(0, 800);
		BrowserUtils.waitForPageToLoad(2000);

		Select select = new Select(n.dropdownMenu);

		System.out.println(select.getFirstSelectedOption().getText());
		List<WebElement> options = select.getOptions();
		List<String> expectedlist = Arrays.asList("Excellent (800+ FICO® Score)" + "Very Good (740-799 FICO® Score)"
				+ "Good (670-739 FICO® Score)" + "Fair (580-669 FICO® Score)" + "Challenged (< 580 FICO® Score)");

		List<String> actualList = new ArrayList<>();

		for (WebElement w : options) {
			actualList.addAll(Collections.singleton(w.getText()));
		}

		System.out.println(actualList);

		Assert.assertTrue(actualList.contains("Good (670-739 FICO® Score)"));
		Assert.assertTrue(actualList.contains("Excellent (800+ FICO® Score)"));

	}
	
	@Test(dataProvider = "year")
	public void getPrice(String year) {
		
		NastyaPage n = new NastyaPage();
		
		BrowserUtils.scroll(0, 2000);
		BrowserUtils.waitForVisibility(n.yearInput, 3000);
		n.yearInput.click();
		n.yearInput.sendKeys(year);
	}

	@DataProvider(name = "year")
	
	public Object[][] getYear() {
		return new Object[][] { { "2015" }, { "2016" }, { "2020" } };
	}
	
	@Test
	public void test1() {
		
		NastyaPage n = new NastyaPage();
		
		BrowserUtils.scroll(0, 2300);
		BrowserUtils.waitForPageToLoad(2000);
		Assert.assertTrue(driver.getPageSource().contains("Research Best-Selling Cars"));
	}

	@Test
	public void test2() {
		
		NastyaPage n = new NastyaPage();
		
		n.researchMore.click();
		String actual = driver.getCurrentUrl();
		Assert.assertTrue(actual.contains("/articles"));
		
	}
	
	@Test
	public void clickInfoButton() {

		NastyaPage n = new NastyaPage();

		n.infoButton.click();
		Assert.assertTrue(n.infoMessage.isEnabled());
	}




}
