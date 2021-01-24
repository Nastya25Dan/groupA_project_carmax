package nastya;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.interactions.Action;
import org.testng.annotations.Test;

import pages.ChangeLocationPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class Sprint2ChangeLocationTest extends TestBase{
	
	@Test
	public void changeLocation() {
		
		ChangeLocationPage ch = new ChangeLocationPage();
		BrowserUtils.scroll(0, 500);
		ch.icon.click();
		
		try {
			BrowserUtils.waitForClickablility(ch.stores, 10);
			jsExecutor.executeScript("arguments[0].click();", ch.stores);
		} catch (Exception e) {
		}
	
		BrowserUtils.scroll(0, 1500);
		ch.mdStores.click();
		jsExecutor.executeScript("arguments[0].click();" , ch.zoomInButton);
		ch.changeZip.sendKeys("21041");
		ch.submit.click();
//		System.out.println(ch.selected.getText());
		assertTrue( ch.selected.getText().contains("STORE SELECTED"));
	}

}
