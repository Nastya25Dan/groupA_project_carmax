package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BrowserUtils;
import utilities.Driver;

public class ResearchMorePage {
	
	public ResearchMorePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
	
	@FindBy (xpath = "//a[@href='/articles']")
	public WebElement researchButton;
	
	@FindBy (xpath = "//section[@class='article-hero-banner-card']")
	public List<WebElement> bannerLinks;
	
	@FindBy (xpath = "//span[@data-prop='article-hero-banner-card--subheader']")
	public List<WebElement> subHeaders;
}
