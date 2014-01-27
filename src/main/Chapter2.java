import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Ikeo on 14/01/14.
 */
public class Chapter2 {
    WebDriver selenium;

    public Chapter2(WebDriver selenium){
        this.selenium = selenium;

        if(!"Chapter2".equalsIgnoreCase(this.selenium.getTitle())){
            selenium.get("book.theautomatedtester.co.uk/chapter2");
        }

    }

    public boolean isButtonPresent(String button){
        return selenium.findElements(By.xpath("//input[@id='" + button +"']")).size()>0;
    }
}
