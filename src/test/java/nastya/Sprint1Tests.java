package nastya;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.BudgetPage;
import utilities.BrowserUtils;

public class Sprint1Tests extends TestBase{
	
	@Test
	public void getCarType() {
		
		BudgetPage budgetPage = new BudgetPage();
		
		BrowserUtils.scroll(0, 500);
		budgetPage.suvButton.click();
		budgetPage.crossover.click();

	}
	
	@Test
	public void dropdownTest() {

		BudgetPage budgetPage = new BudgetPage();

		BrowserUtils.scroll(0, 800);
		BrowserUtils.waitForPageToLoad(2000);

		Select select = new Select(budgetPage.dropdownMenu);

		System.out.println(select.getFirstSelectedOption().getText());
		List<WebElement> options = select.getOptions();
		List<String> expectedlist = Arrays.asList("Excellent (800+ FICO� Score)" + "Very Good (740-799 FICO� Score)"
				+ "Good (670-739 FICO� Score)" + "Fair (580-669 FICO� Score)" + "Challenged (< 580 FICO� Score)");

		List<String> actualList = new ArrayList<>();

		for (WebElement w : options) {
			actualList.addAll(Collections.singleton(w.getText()));
		}

		System.out.println(actualList);

		AssertJUnit.assertTrue(actualList.contains("Good (670-739 FICO� Score)"));
		AssertJUnit.assertTrue(actualList.contains("Excellent (800+ FICO� Score)"));

	}
	
	@Test(dataProvider = "year")
	public void getPrice(String year) {
		
		BudgetPage n = new BudgetPage();
		
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
		
		BudgetPage n = new BudgetPage();
		
		BrowserUtils.scroll(0, 2300);
		BrowserUtils.waitForPageToLoad(2000);
		AssertJUnit.assertTrue(driver.getPageSource().contains("Research Best-Selling Cars"));
	}

	@Test
	public void test2() {
		
		BudgetPage n = new BudgetPage();
		
		n.researchMore.click();
		String actual = driver.getCurrentUrl();
		AssertJUnit.assertTrue(actual.contains("/articles"));
		
	}
	
	@Test
	public void clickInfoButton() {

		BudgetPage n = new BudgetPage();

		n.infoButton.click();
		AssertJUnit.assertTrue(n.infoMessage.isEnabled());
	}




}
