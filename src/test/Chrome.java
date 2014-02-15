import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

/**
 * Created by Ikeo on 09/02/14.
 */
public class Chrome {

    WebDriver driver;
    private boolean options;


    @Before
    public void setUp() throws MalformedURLException {



        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Home\\learningJunit\\lib\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver(capabilities);
        driver.manage().deleteAllCookies();
        //driver.get("http://book.theautomatedtester.co.uk/chapter4");
        driver.navigate().to("http://book.theautomatedtester.co.uk/chapter4");


    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testExampleChrome(){
        //We will put examples in here

        WebElement element = driver.findElement(By.id("selectLoad"));
        String value = element.getAttribute("value");
        Assert.assertEquals("Click to load the select below", value);
    }
}
