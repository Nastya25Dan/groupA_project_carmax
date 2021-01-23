package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.BrowserUtils;
import utilities.Driver;

public class ResearchMorePage {
	
	public ResearchMorePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
	
	ResearchMorePage m = new ResearchMorePage();
	//BrowserUtils.scroll(0, 1500);

}
