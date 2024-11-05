package StepDefinitions;

import PageObject.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DashboardStepDefinition {
    DashboardPage dashboardPage=new DashboardPage();

    @When("user click on {string}")
    public void userClickOn(String dashboard){
        dashboardPage.navigatetoDashboards(dashboard);
        System.out.println("user clicking on dashboard "+dashboard );
    }

    @Then("user verify page header as {string}")
    public void userVerifyPageHeaderAs(String header){
        Assert.assertEquals(dashboardPage.getHeader(),header);
        System.out.println("Page header is "+header);
    }
}
