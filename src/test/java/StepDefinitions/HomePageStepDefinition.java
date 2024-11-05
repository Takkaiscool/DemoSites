package StepDefinitions;

import PageObject.DashboardPage;
import PageObject.HomePage;
import Utils.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageStepDefinition {
    HomePage homePage=new HomePage();
    @Given("user navigate to application")
    public void userNavigateToApplication(){
        homePage.navigateToApplication();
        System.out.println("User navigating to application");
    }

    @When("user goto {string} inside {string} menu")
    public void userGotoInsideMenu(String submenu, String menu){
        homePage.navigateToSubmenu(menu,submenu);
        System.out.println("user is navigating to menu "+menu+" inside navigating to submenu "+submenu);

    }

    @Then("user verify breadcrumb as {string}")
    public void userVerifyBreamcrumAs(String breadcrumb){
        Assert.assertEquals(homePage.getBreadCrumb(),breadcrumb);
        System.out.println("Bread crumb is "+breadcrumb);
    }


}
