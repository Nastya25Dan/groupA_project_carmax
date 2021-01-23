package nihal;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Nihal2Page;
import tests.TestBase;
import utilities.BrowserUtils;

import static org.testng.Assert.assertTrue;

public class Sprint2ModelTest extends TestBase {
    @Test
    public void searchModel() {
        Nihal2Page n = new Nihal2Page();
        BrowserUtils.scroll(0, 100);
        n.findStore.click();
        n.searchModel.click();
        n.searchModel.sendKeys("Toyota" + Keys.ENTER);
        BrowserUtils.waitForPageToLoad(3000);
        BrowserUtils.waitForVisibility(n.keepinStore,3000);
        actions.moveToElement(n.keepinStore).click().build().perform();
        BrowserUtils.scroll(0, 100);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.getPageSource().contains("See all reviews"));
        n.reviewButton.click();
        softAssert.assertTrue(driver.getCurrentUrl().contains("reviews"));
        softAssert.assertAll();
    }
//
//    @Test
//    public void searchModel1() {
//        Nihal2Page n = new Nihal2Page();
//        BrowserUtils.scroll(0, 100);
//        n.findStore.click();
//        n.searchModel.click();
//        n.searchModel.sendKeys("Audi" + Keys.ENTER);
//        BrowserUtils.waitForVisibility(n.keepinStore,2000);
//        actions.moveToElement(n.keepinStore).click().build().perform();
//        BrowserUtils.scroll(0, 100);
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertTrue(driver.getPageSource().contains("See all reviews"));
//        n.reviewButton.click();
//        softAssert.assertTrue(driver.getCurrentUrl().contains("reviews"));
//        softAssert.assertAll();
//    }

//    @Test
//    public void searchModel2() {
//        Nihal2Page n = new Nihal2Page();
//        BrowserUtils.scroll(0, 100);
//        n.findStore.click();
//        n.searchModel.click();
//        n.searchModel.sendKeys("Nissan" + Keys.ENTER);
//        BrowserUtils.waitForVisibility(n.keepinStore,3000);
//        actions.moveToElement(n.keepinStore).click().build().perform();
//        BrowserUtils.scroll(0, 100);
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertTrue(driver.getPageSource().contains("See all reviews"));
//        n.reviewButton.click();
//        softAssert.assertTrue(driver.getCurrentUrl().contains("reviews"));
//        softAssert.assertAll();
//    }


}





















