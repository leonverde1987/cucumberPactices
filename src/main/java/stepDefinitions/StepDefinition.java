package stepDefinitions;

import Bases.baseUtil;
import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.pageExample;


public class StepDefinition extends baseUtil {
    WebDriver driver;
    //private TestContext testContext;
    private baseUtil base;

    public StepDefinition(baseUtil base) {
        this.base = base;
        //this.driver=driver;
    }
    //public StepDefinition(){
        //this.testContext = testContext;
        //PageFactory.initElements(new hooks().driver, this);
        //driver = testContext.getHook().driver;
        //this.driver= new DriverFactory().createInstance();
    //}

    @Given("i am starting on cucumber <{int}>")
    public void iAmStartingOnCucumber(int a) {
        System.out.println("HELLO WORLD number"+a);
    }

    @Given("i am automation on cucumber <{int}>")
    public void iAmAntomationOnCucumber(int a) {
        System.out.println("HELLO AUTOMATION number"+a);
    }

    @Given("i am open Chrome browser")
    public void iAmOpenChromeBrowser() {

    }

    @When("i go to page <{string}>")
    public void iGoToPage(String URL) {
        new pageExample(base.driver).go_to_page(URL);
    }

    @Then("i validate title contains <{string}>")
    public void iValidateTitleContains(String text) {
        Assert.assertTrue(new pageExample(base.driver).getTitleText().contains(text), "Title doesn't contains "+text);
    }
}
