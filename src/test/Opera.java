import com.opera.core.systems.OperaDriver;
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
 * Created by Ikeo on 09/02/14.
 */
public class Opera {

    WebDriver driver;


    @Before
    public void setUp() throws IOException {
        System.setProperty("webdriver.opera.driver","C:\\Program Files\\Opera\\launcher.exe");
        driver = new OperaDriver();
        driver.get("http://book.theautomatedtester.co.uk");






    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void testExamplesOpera(){
        //We will put examples in here

        WebElement element = driver.findElement(By.linkText("Chapter4"));
        element.click();
    }
}
