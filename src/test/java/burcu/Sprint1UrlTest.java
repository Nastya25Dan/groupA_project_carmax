package burcu;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Sprint1UrlTest extends TestBase{

    @Test
    public void verifyUrl(){
        String expectedUrl="https://www.carmax.com/";
        String actualUrl= driver.getCurrentUrl();
        AssertJUnit.assertEquals(actualUrl,expectedUrl);


    }
}
