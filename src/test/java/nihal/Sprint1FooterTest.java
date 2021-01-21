package nihal;

import org.testng.annotations.Test;
import pages.NihalPage;
import tests.TestBase;
import utilities.BrowserUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class Sprint1FooterTest extends TestBase {

    @Test(priority = 1,groups = "A")

    public void footerTest(){
        NihalPage  m=new NihalPage();
        List<String> actualResult=BrowserUtils.getElementsText(m.footerlist);
        List<String> expectedResult=new ArrayList<>(Arrays.asList("Shop","Sell","Finance","About","Careers","More"));
        System.out.println(expectedResult);
//        Collections.sort(actualResult);
//        Collections.sort(expectedResult);
        assertEquals(actualResult,expectedResult);

    }

}
