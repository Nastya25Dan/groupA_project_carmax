package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class ChangeLocationPage {
	
	public ChangeLocationPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy (xpath = "//button[@class='budget-search-disclaimer-dialog-button']")
	public WebElement icon;
	
	@FindBy (xpath = "(//a[@href='/stores'])[2]")
	public WebElement stores;
	
	@FindBy (xpath = "//a[@href='/stores/md']")
	public WebElement mdStores;
	
	@FindBy (xpath = "//button[@class='mapboxgl-ctrl-icon mapboxgl-ctrl-zoom-in']")
	public WebElement zoomInButton;
	
	@FindBy (xpath = "//input[@placeholder='Search by ZIP or State']")
	public WebElement changeZip;
	
	@FindBy (xpath = "//button[@class='button-base search-bar--button-container']")
	public WebElement submit;
	
	@FindBy (xpath = "//span[@class='userStoreSelected center active']")
	public WebElement selected;
}
