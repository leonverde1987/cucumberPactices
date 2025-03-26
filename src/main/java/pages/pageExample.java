package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.generic;


public class pageExample {
    WebDriver driver;

    @FindBy(xpath = "//h1[@class='hero__title']")
    WebElement titlePage;

    public pageExample(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void go_to_page(String url){
        new generic(driver).getPage(url);
    }

    public boolean validateTitle(){
        return titlePage.isDisplayed();
    }

    public String getTitleText(){
        return new generic(driver).getTextOfElement(titlePage);
    }

}
