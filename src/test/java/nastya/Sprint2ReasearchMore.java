package nastya;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.ResearchMorePage;
import utilities.BrowserUtils;

public class Sprint2ReasearchMore extends TestBase{
	
	@Test
	public void researchMore() {
		
		BrowserUtils.scroll(0, 2500);
		ResearchMorePage m = new ResearchMorePage();
		m.researchButton.click();
		
			for(WebElement sub: m.subHeaders) {
			assertTrue(sub.getText().contains("best-selling"));
			System.out.println(sub.getText());
			}
		
		
		
		
	}

}
