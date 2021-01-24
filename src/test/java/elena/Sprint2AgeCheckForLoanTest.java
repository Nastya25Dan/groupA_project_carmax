package elena;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.CarsChoicesPage;
import pages.LoginPage;

import utilities.BrowserUtils;

public class Sprint2AgeCheckForLoanTest extends TestBase{
	@Test(groups = {"smoke"})
	public void ageCheckForLoan() {
		
		LoginPage lp = new LoginPage();
		CarsChoicesPage cc = new CarsChoicesPage();
		lp.shopButton.click();
		
		lp.suvsField.click();
	
		try{BrowserUtils.waitForClickablility(cc.popUpHandle, 10);
		jsExecutor.executeScript("arguments[0].click();", cc.popUpHandle);}
		catch(Exception e) {}
		
		cc.suvCarOption.click();
		
		BrowserUtils.waitForPageToLoad(3000);

	WebElement k = cc.creditScoreButton;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", k);
		
		cc.creditScoreValue.click();
		
		js.executeScript("arguments[0].click();", cc.termLengthButton);

		
		cc.termLengthValue.click();
		
		cc.preApprovedButton.click();
		
		Faker fake = new Faker();
		cc.firstName.sendKeys(fake.name().firstName());
		cc.lastName.sendKeys(fake.name().lastName());
		cc.dateOfBirth.sendKeys(fake.number().numberBetween(12012010, 12012015)+"");
		
		cc.phoneNumber.click();
		String actualErrorText = cc.errorMessage.getText().toString();
		String expectedErrorText = "Applicant must be 18 years or older.";
		
		Assert.assertEquals(actualErrorText, expectedErrorText);
		
	}
}
