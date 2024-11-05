package StepDefinitions;

import PageObject.AboutTheDataPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class AboutTheDataStepDefinition {
    AboutTheDataPage aboutTheDataPage=new AboutTheDataPage();

    @Then("user verify the refresh cycle for daily")
    public void userVerifyTheRefreshCycleForDaily(DataTable dataTable){
        List<Map<String,String>> expectedData=dataTable.asMaps();
        List<Map<String,String>> actualData=aboutTheDataPage.getTableDataBasedOnRefreshCycle();
        Assert.assertEquals(expectedData,actualData);
    }
    @Then("user verify the refresh cycle for monthly")
    public void userVerifyTheRefreshCycleForMonthly(DataTable dataTable){
        List<Map<String,String>> expectedData=dataTable.asMaps();
        List<Map<String,String>> actualData=aboutTheDataPage.getTableDataBasedOnRefreshCycleMonthly();
        Assert.assertEquals(expectedData,actualData);
    }
}
