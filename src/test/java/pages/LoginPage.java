package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class LoginPage {
	
	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);  
	}
	
	@FindBy (id = "shop-by-type-carousel__next")
	public WebElement nextButton;
	
	@FindBy (xpath = "(//img[@class='icon-tile-img loaded tns-complete'])[9]")
	public WebElement dieselField;	
	
	
			
	@FindBy (xpath = "//img[@src='https://www.carmax.com/cars/images/type-icons/sport-utilities.svg']")
	public WebElement suvsField;
	
	@FindBy (xpath = "//img[@src='/cars/images/brand-logos/honda.png']")
	public WebElement hondaField;
	
	@FindBy (xpath = "//*[@href='/cars/all?price=10000']")
	public WebElement lowPriceField;
	
	@FindBy (xpath = "//a[@id='header-mobile-drawer-focus-start']")
	public WebElement shopButton;
	
	@FindBy (xpath = "(//*[@class='shop-by-lifestyle-img'])[2]")
	public WebElement ecoFriendly;


	@FindBy (xpath = "//a[@href='/cars/2019']")
	public WebElement shopByYear;
	
	@FindBy (xpath = "(//*[@class='shop-by-lifestyle-img'])[1]")
	public WebElement commuterType;
	

	
	
	
	
	
	

}