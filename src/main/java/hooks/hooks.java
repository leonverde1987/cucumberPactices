package hooks;

import Bases.baseUtil;
import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.*;


public class hooks extends baseUtil {
    private baseUtil base;

    public hooks(baseUtil base) {
        this.base = base;
    }

    @Before
    public void setup() {
        System.out.println("Before Suite");
        base.driver = new DriverFactory().createInstance();
        System.out.println("Abrio el navegador");
    }

    @After
    public void teardown(Scenario scenario){
        System.out.println("After Suite");
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) base.driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src, "image/png", "screenshot");
        }
        base.driver.quit();
    }

}

