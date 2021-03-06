package nastya;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.ResearchMorePage;
import utilities.BrowserUtils;

public class Sprint2ReasearchMoreTest extends TestBase {

	@Test (groups = {"smoke"})
	public void researchMore() {

		BrowserUtils.scroll(0, 2500);
		ResearchMorePage m = new ResearchMorePage();
		m.researchButton.click();

		for (WebElement sub : m.subHeaders) {
			AssertJUnit.assertTrue(sub.getText().contains("best-selling"));
		}

		m.bestUsedCars.click();

		int budgetUnder30 = Integer.parseInt(m.under30.getText().substring(7).replaceAll(",", ""));

		m.hondaCivic.click();

		try {
			BrowserUtils.waitForClickablility(m.keepStore, 10);
			jsExecutor.executeScript("arguments[0].click();", m.keepStore);
		} catch (Exception e) {
		}

		m.color.click();
		BrowserUtils.waitForClickablility(m.greyColor, 5);
		m.greyColor.click();

		int price;
		for (WebElement content : m.prices) {
			String pr = content.getText();
			try {
				price = Integer.parseInt(pr.replaceAll("$,*", ""));
				AssertJUnit.assertTrue(price < budgetUnder30);
			} catch (NumberFormatException ex) {

			}

		}

	}

}
