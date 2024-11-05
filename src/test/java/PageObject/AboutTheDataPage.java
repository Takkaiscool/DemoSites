package PageObject;

import Utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AboutTheDataPage {
    WebDriver driver;
    public AboutTheDataPage(){
        PageFactory.initElements(DriverManager.getDriver(),this);
        driver=DriverManager.getDriver();
    }

    public List<Map<String,String>> getTableDataBasedOnRefreshCycle(){
        List<Map<String,String>> entireData=new ArrayList<>();

        List<WebElement> numberOfRows=driver.findElements(By.xpath("//td[text()='Daily']/.."));
        List<WebElement> dataSource=driver.findElements(By.xpath("//td[text()='Daily']/../td[1]"));
        List<WebElement> metadata=driver.findElements(By.xpath("//td[text()='Daily']/../td[2]"));
        List<WebElement> dateOfSourceData=driver.findElements(By.xpath("//td[text()='Daily']/../td[3]"));
        List<WebElement> refreshCycle=driver.findElements(By.xpath("//td[text()='Daily']/../td[4]"));
        List<WebElement> dataAvialbleIn=driver.findElements(By.xpath("//td[text()='Daily']/../td[5]"));
        List<WebElement> dataType=driver.findElements(By.xpath("//td[text()='Daily']/../td[6]"));
        for(int i=0;i<numberOfRows.size();i++){
            Map<String,String> eachRow=new LinkedHashMap<>();
            eachRow.put("Data Source",dataSource.get(i).getText());
            eachRow.put("Metadata",metadata.get(i).getText());
            eachRow.put("Date of Source Data",dateOfSourceData.get(i).getText());
            eachRow.put("Refresh Cycle",refreshCycle.get(i).getText());
            eachRow.put("Data Available In",dataAvialbleIn.get(i).getText());
            eachRow.put("Data Type",dataType.get(i).getText());
            entireData.add(eachRow);
        }
        System.out.println(entireData);
        return entireData;
    }
 public List<Map<String,String>> getTableDataBasedOnRefreshCycleMonthly(){
        List<Map<String,String>> entireData=new ArrayList<>();

        List<WebElement> numberOfRows=driver.findElements(By.xpath("//td[text()='Monthly']/.."));
        List<WebElement> dataSource=driver.findElements(By.xpath("//td[text()='Monthly']/../td[1]"));
        List<WebElement> metadata=driver.findElements(By.xpath("//td[text()='Monthly']/../td[2]"));
        List<WebElement> dateOfSourceData=driver.findElements(By.xpath("//td[text()='Monthly']/../td[3]"));
        List<WebElement> refreshCycle=driver.findElements(By.xpath("//td[text()='Monthly']/../td[4]"));
        List<WebElement> dataAvialbleIn=driver.findElements(By.xpath("//td[text()='Monthly']/../td[5]"));
        List<WebElement> dataType=driver.findElements(By.xpath("//td[text()='Monthly']/../td[6]"));
        for(int i=0;i<numberOfRows.size();i++){
            Map<String,String> eachRow=new LinkedHashMap<>();
            eachRow.put("Data Source",dataSource.get(i).getText());
            eachRow.put("Metadata",metadata.get(i).getText());
            eachRow.put("Date of Source Data",dateOfSourceData.get(i).getText());
            eachRow.put("Refresh Cycle",refreshCycle.get(i).getText());
            eachRow.put("Data Available In",dataAvialbleIn.get(i).getText());
            eachRow.put("Data Type",dataType.get(i).getText());
            entireData.add(eachRow);
        }
        System.out.println(entireData);
        return entireData;
    }


}
