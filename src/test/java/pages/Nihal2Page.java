package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.TestBase;
import utilities.Driver;

public class Nihal2Page extends TestBase {


   public Nihal2Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='/stores'])[1]")
    public  WebElement findStore;
   //page2
    @FindBy(xpath = "//input[@name='keyword']")
    public WebElement searchZip;
    @FindBy(xpath = "//input[@name='search']")
    public WebElement searchModel;
    @FindBy(xpath = "(//button[contains(text(),'Save search')])[1]")
    public WebElement saveSearch;
    @FindBy(xpath = "//button[contains(text(),'Keep Store')]")
    public WebElement keepinStore;
    @FindBy(xpath = "//a[contains(text(),'See all reviews')]")
    public WebElement reviewButton;


    @FindBy(xpath = "//a[@class='footer-link'][contains(text(),'Schedule an Appraisal')]")
    public WebElement scheduleApp;
    @FindBy(xpath = "//input[@id='appt-fname']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='appt-lname']")
    public WebElement lastName;
    @FindBy(xpath = "//input[@id='appt-phone']")
    public WebElement phone;
    @FindBy(xpath = "//input[@id='appt-email']")
    public WebElement email;
    @FindBy(xpath = "//form[@id='appt-personal']")
    public WebElement nextButton;


    @FindBy(xpath ="//a[@href='http://media.carmax.com/']" )
    public WebElement mediaCenter;
    @FindBy(xpath = "//input[@ placeholder='Email Address']")
    public WebElement emailadress;
    @FindBy(xpath = "(//input[@type='submit'])[2]")
    public WebElement mediaSubmit;
    @FindBy(xpath = "//a[@title='For Students']")
    public WebElement forStudentslink;

    @FindBy(linkText = "Service & Repairs")
    public WebElement serviceRepair;
    @FindBy(xpath = "//a[@id='service-anchor-link']")
    public WebElement serviceOptionButton;
    @FindBy(xpath = "//a[contains(text(),'find a shop near you')]")
    public WebElement findShop;

}
