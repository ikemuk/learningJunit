import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by Ikeo on 09/02/14.
 */
public class IEdriver {

    WebDriver driver;


    @Before
    public void setUp() throws IOException {

        System.setProperty("webdriver.ie.driver", "C:\\Selenium_Home\\learningJunit\\lib\\BrowserDrivers\\IEDriverServer.exe");
        InternetExplorerDriver ie = new InternetExplorerDriver();
        ie.get("http://book.theautomatedtester.co.uk/chapter4");




    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void testExamplesIE(){
        //We will put examples in here

        WebElement element = driver.findElement(By.id("bid"));
        Assert.assertEquals("50",element.getText());
    }
}
