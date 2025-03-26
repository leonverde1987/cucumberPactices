package selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class generic  {
    WebDriver driver;

    public generic(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void getPage(String URL){
        driver.get(URL);
    }

    public String getTextOfElement(WebElement elem){
        return elem.getText();
    }

}
