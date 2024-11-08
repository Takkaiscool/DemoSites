package Tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features",
        glue = "StepDefinitions",
        tags = "@smoke",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "summary", "pretty", "html:TestReports/CucumberReport/cucumber.html", "json:target/cucumber-report/cucumber.json"})
public class RunnerClass extends AbstractTestNGCucumberTests {

}
