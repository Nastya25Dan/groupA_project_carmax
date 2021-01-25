package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class TradeInPage {

	public TradeInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "(//input[@class='mdc-text-field__input'])[3]")
	public WebElement yearBox;
	
	@FindBy (xpath = "(//select[@class='mdc-select__native-control'])[2]")
	public WebElement makeBox;
	
	@FindBy (xpath = "(//select[@class='mdc-select__native-control'])[3]")
	public WebElement modelBox;
	
	@FindBy (xpath = "(//input[@class='mdc-text-field__input'])[4]")
	public WebElement mileageBox;
	
	@FindBy (id = "appraisal-form-submit")
	public WebElement seeYours;

	@FindBy (xpath = "//h3[@class='vehicle-found-heading kmx-typography--display-2']")
	public WebElement result; 
}
