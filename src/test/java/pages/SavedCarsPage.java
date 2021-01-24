package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class SavedCarsPage {
	
	public SavedCarsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	
	@FindBy (xpath = "//a[@class='wl-compare']")
	public WebElement compareButton;
	
	@FindBy (xpath = "//h1[@class='kmx-typography--display-3 text-centered']")
	public WebElement compareTitle;
	
	@FindBy (css = "a[href^='/car/']")
	public List<WebElement> comparedCars;
	
	
	
	

}
