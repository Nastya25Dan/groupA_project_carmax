package nastya;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.BudgetPage;
import tests.TestBase;
import utilities.BrowserUtils;
import utilities.Driver;

public class Sprint2BudgetSearchTest extends TestBase{
	
	
	@Test
	public void seeMyBudgetCar() {
		
		BudgetPage budgetPage = new BudgetPage();
		BrowserUtils.scroll(0, 500);
		budgetPage.suvButton.click();

		
		BrowserUtils.waitForVisibility(budgetPage.monthlyPayment, 3000);
		BrowserUtils.hover(budgetPage.monthlyPayment);
		budgetPage.monthlyPayment.sendKeys(Keys.ENTER);
		budgetPage.monthlyPayment.sendKeys(Keys.BACK_SPACE);
		budgetPage.monthlyPayment.sendKeys(Keys.BACK_SPACE);
		budgetPage.monthlyPayment.sendKeys(Keys.BACK_SPACE);
		budgetPage.monthlyPayment.sendKeys("555");

		BrowserUtils.hover(budgetPage.downPayment);
		budgetPage.downPayment.sendKeys(Keys.ENTER);
		budgetPage.downPayment.sendKeys(Keys.BACK_SPACE);
		budgetPage.downPayment.sendKeys(Keys.BACK_SPACE);
		budgetPage.downPayment.sendKeys(Keys.BACK_SPACE);
		budgetPage.downPayment.sendKeys(Keys.BACK_SPACE);
		budgetPage.downPayment.sendKeys("3500");

		Select select = new Select(budgetPage.creditScoreVeryGood);
		select.selectByVisibleText("Very Good (740-799 FICO® Score)");
		BrowserUtils.waitForPageToLoad(5);

		BrowserUtils.hover(budgetPage.seeCars);
		budgetPage.seeCars.click();

		try {
			BrowserUtils.waitForClickablility(budgetPage.keepStore, 10);
			jsExecutor.executeScript("arguments[0].click();", budgetPage.keepStore);
		} catch (Exception e) {
		}
		
		String suv = Driver.getDriver().getTitle();
		System.out.println(suv);//Used SUVs $26,483-$35,311 for Sale
		int title = Integer.parseInt(Driver.getDriver().getTitle().substring(19,25).replaceAll(",", ""));
		String filterType = budgetPage.filterType.getText();
		int maxAmount = Integer.parseInt(budgetPage.filterAmount.getText().substring(8));

		System.out.println(title);//35311
		System.out.println(filterType);//SUVs
		System.out.println(maxAmount);//35311

		assertTrue(suv.contains(filterType));
		
		assertEquals(maxAmount,title);
		
	}

}
