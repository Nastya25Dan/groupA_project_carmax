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
	
	@FindBy (xpath = "//a[@href='/articles/best-cars-ranking']")
	public WebElement bestUsedCars;
	
	@FindBy (xpath = "//a[@href='#30']")
	public WebElement under30;
	
	@FindBy (xpath = "//button[@class='kmx-button kmx-button--tertiary kmx-button--flat']")
    public WebElement keepStore;
	
	@FindBy (xpath = "//a[@href='/cars/honda/civic']")
	public WebElement hondaCivic;
	
	@FindBy (xpath = "//div[@aria-label='Exterior Color']")
	public WebElement color;
	
	@FindBy (xpath = "//div[@class='facet--color-value--swatch gray']")
	public WebElement greyColor;
	
	@FindBy (xpath = "//span[@class='price']")
	public List<WebElement> prices;
}
