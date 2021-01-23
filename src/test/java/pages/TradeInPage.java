package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class TradeInPage {

	public TradeInPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "appraisal-form-year")
	public WebElement yearBox;
	
	@FindBy (id = "appraisal-form-make")
	public WebElement makeBox;
	
	@FindBy (id = "appraisal-form-model")
	public WebElement modelBox;
	
	@FindBy (id = "appraisal-form-mileage")
	public WebElement mileageBox;
	
	@FindBy (id = "appraisal-form-submit")
	public WebElement seeYours;
	
//	@FindBy (xpath = "//a[@name='Make an appointment']")
//	public WebElement makeAppt; ->//button
	
	@FindBy (xpath = "//h3[@class='vehicle-found-heading kmx-typography--display-2']")
	public WebElement result; 
}
