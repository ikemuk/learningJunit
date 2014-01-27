import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.FindsByClassName;
import org.openqa.selenium.internal.FindsById;
import org.openqa.selenium.internal.FindsByName;
import org.openqa.selenium.internal.FindsByXPath;

import java.util.List;

/**
 * Created by Ikeo on 20/01/14.
 */
public class findElements {

    WebDriver driver;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://book.theautomatedtester.co.uk/chapter1");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testExamples(){
        WebElement element = ((FindsById)driver).findElementById("verifybutton");

        List<WebElement> elements = ((FindsById)driver).findElementsById("verifybutton");
        Assert.assertEquals(1, elements.size());

        WebElement element2 = ((FindsByName)driver).findElementByName("selected(1234)");

        List<WebElement> element3 = ((FindsByName)driver).findElementsByName("selected(1234)");
        Assert.assertEquals(1, element3.size());

        WebElement element4 = ((FindsByClassName)driver).findElementByClassName("storetext");

        List<WebElement> element5 = ((FindsByClassName)driver).findElementsByClassName("storetext");
        Assert.assertEquals(1, element5.size());

        //WebElement element6 = ((FindsByXPath)driver).findElementByXPath("verifybutton");

        List<WebElement> element7 = ((FindsByXPath)driver).findElementsByXPath("//input");
        Assert.assertEquals(6, element7.size());

    }

}
