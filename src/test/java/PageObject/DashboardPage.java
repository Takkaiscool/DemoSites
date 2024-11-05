package PageObject;

import Utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;
    @FindBy(xpath = "//h1[contains(@class,'page-entry-title')]")
    public WebElement header;
    public DashboardPage(){
        PageFactory.initElements(DriverManager.getDriver(),this);
        driver=DriverManager.getDriver();
    }

    public void navigatetoDashboards(String dashboard){
        driver.findElement(By.xpath("//h4[text()='"+dashboard+"']/..")).click();
    }

    public String getHeader(){
        return header.getText();
    }
}
