package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TestBase;
import utilities.Driver;

public class Burcu2Page{
	
    public Burcu2Page(){
    	
        PageFactory.initElements(Driver.getDriver(),this);
    }
    
    //Searchbox
    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchBox;
    
    //See More Cars 
    
    @FindBy(xpath = "//a[@href='/cars/all']")
    public WebElement seeMoreCars;
    
    //Shop All Cars
    @FindBy(xpath = "//a[contains(@class, 'reason-to-believe--shop-all-cars-button')]")
    public WebElement shopAllCars;
    
    
    //Filters
    @FindBy(xpath = "//a[@class = 'skip-link'][@href='#search-results']")
    public WebElement filters;
    
    
    //Filters list
    @FindBy(xpath  ="//h4")
    public List<WebElement> filtersList;
    
    
    //List of Make
    @FindBy(xpath  = "//li[@class='refinement-value']")
    public List<WebElement> makeList;
    
  //Filters list - Make
    @FindBy(xpath  ="//div[@class='drawer--label'][@aria-label='Make']")
    public WebElement filtersMake;
    
    
    //Acura's checkbox
    @FindBy(xpath = "//li[@class= 'refinement-value'][@data-clickprops = 'Element type: Facet,Value: Acura,Is selected: false']")
    public WebElement acuraCheckBox;
    
    
    //Audi's checkbox
    @FindBy(xpath = "//li[@class= 'refinement-value'][@data-clickprops = 'Element type: Facet,Value: Audi,Is selected: false']")
    public WebElement audiCheckBox;

    @FindBy(xpath = "//button[contains(text(),'Keep Store')]")
    public WebElement keepinStore;
    
    
    
    

   

}