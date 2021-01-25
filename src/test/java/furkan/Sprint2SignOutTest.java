package furkan;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.AfterSign;
import pages.MainPage;
import pages.SignIn;
import utilities.BrowserUtils;
import utilities.ConfigReader;
import utilities.Driver;
public class Sprint2SignOutTest extends TestBase {
	
	
	@Parameters("browser")
	@Test()
public void signOut() {
		
		MainPage mp = new MainPage();
		mp.profileIcon.click();
		BrowserUtils.waitForClickablility(mp.signIn, 10);
		jsExecutor.executeScript("arguments[0].click();" , mp.signIn);
		SignIn s = new SignIn();
		s.userEmail.sendKeys(ConfigReader.getProperty("email"));
		s.userPassword.sendKeys(ConfigReader.getProperty("password"));
		s.signInButton.click();
		BrowserUtils.waitFor(6);
		mp.profileIcon.click();
		AfterSign as = new AfterSign();
		as.signOut.click();
		BrowserUtils.waitFor(3);
		mp.profileIcon.click();
		List<WebElement>list = Driver.getDriver().findElements(By.xpath("//li[@class='header-footer-menu-list-item']"));
		int expectedSize=3;
		assertTrue(expectedSize==list.size());
	
	
	}

}
