package StepDefinitions;

import Utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.shaded.messages.types.Source;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.time.Duration;

public class Hooks {

    @Before
    public void setup(){
        DriverManager.setWebdriver("Chrome");
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterStep
    public void afterEachStep(Scenario scenario) throws Exception{
        if(scenario.isFailed()){
            TakesScreenshot screenshot=(TakesScreenshot) DriverManager.getDriver();
            File source = screenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./screenshots/error.png"));
            scenario.attach(screenshot.getScreenshotAs(OutputType.BYTES), "image/png","error");
        }
    }

    @After
    public void tearUp(){
        DriverManager.getDriver().close();
    }

}
