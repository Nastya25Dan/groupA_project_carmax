package nastya;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.NastyaPage;
import tests.TestBase;
import utilities.BrowserUtils;
import utilities.Driver;

public class Sprint2BudgetSearchTest extends TestBase{
	
	
	@Test
	public void seeMyBudgetCar() {
		
		NastyaPage n = new NastyaPage();
		
		n.suvButton.click();
		
		BrowserUtils.scroll(0, 500);
		BrowserUtils.waitForVisibility(n.monthlyPayment, 3000);
		BrowserUtils.hover(n.monthlyPayment);
		n.monthlyPayment.sendKeys(Keys.ENTER);
		n.monthlyPayment.sendKeys(Keys.BACK_SPACE);
		n.monthlyPayment.sendKeys(Keys.BACK_SPACE);
		n.monthlyPayment.sendKeys(Keys.BACK_SPACE);
		n.monthlyPayment.sendKeys("555");
		
		BrowserUtils.hover(n.downPayment);
		n.downPayment.sendKeys(Keys.ENTER);
		n.downPayment.sendKeys(Keys.BACK_SPACE);
		n.downPayment.sendKeys(Keys.BACK_SPACE);
		n.downPayment.sendKeys(Keys.BACK_SPACE);
		n.downPayment.sendKeys(Keys.BACK_SPACE);
		n.downPayment.sendKeys("3500");
		
		Select select = new Select(n.creditScoreVeryGood);
		select.selectByVisibleText("Very Good (740-799 FICO® Score)");
		
		String budget = n.yourBudget.getText();
		BrowserUtils.hover(n.seeCars);
		n.seeCars.click();
		
		BrowserUtils.hover(n.keepTheStore);
		n.keepTheStore.click();
		
	}

}
