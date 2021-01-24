package nastya;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.PopularCarsPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class Sprint2PopularUsedCarsTest extends TestBase{
	
	@Test (groups = {"smoke"})
	public void checkAllLinks() {
		
		
		BrowserUtils.scroll(0, 2500);
		List<WebElement> links = new PopularCarsPage().popularLinks;
		
		List<String> expectedLinkNames = Arrays.asList( "Research Best-Selling Cars",
															"Research AWD Cars",
															"Research Hybrid Cars",
															"Research SUVs",
															"Research Compact SUVs",
															"Research Midsize SUVs"
																);
		
		
		List<String> actualLinkNames = BrowserUtils.getElementsText(links);
		
		Collections.sort(actualLinkNames);
		Collections.sort(expectedLinkNames);
		
		assertEquals(actualLinkNames, expectedLinkNames);
		
		
		
	}
	

}
