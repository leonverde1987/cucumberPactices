package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@Regression",
        features = "src/test/resources/features/",
        glue = {"hooks", "stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports/cucumberreport.html"})
public class cucumberRunner extends AbstractTestNGCucumberTests {

}
