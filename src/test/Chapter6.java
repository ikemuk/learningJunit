import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.io.IOException;

/**
 * Created by Ikeo on 02/02/14.
 */
public class Chapter6 {
    WebDriver driver;


    @Before
    public void setUp() throws IOException {
        FirefoxProfile profile = new FirefoxProfile();

        profile.addExtension(new File("C:\\Selenium_Home\\learningJunit\\lib\\Addons\\firebug-1.12.6-fx.xpi"));
        profile.setPreference("browser.startup.homepage", "http://book.theautomatedtester.co.uk/chapter4");

        driver = new FirefoxDriver(profile);


    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testExamples(){
        //We will put examples in here

        WebElement element = driver.findElement(By.id("nextBid"));
        element.sendKeys("100");
    }



}
