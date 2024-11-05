package PageObject;

import Utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    @FindBy(partialLinkText = "Home")
    public WebElement home;

    @FindBy(partialLinkText = "Find Health Care")
    public WebElement findHealthCare;

    @FindBy(partialLinkText = "Data")
    public WebElement data;

    @FindBy(partialLinkText = "Maps")
    public WebElement maps;

    @FindBy(partialLinkText = "Tools")
    public WebElement tools;

    @FindBy(partialLinkText = "Topics")
    public WebElement topics;

    @FindBy(partialLinkText = "Help")
    public WebElement help;

    @FindBy(xpath = "//ul[@class='breadcrumb']/li")
    public List<WebElement> breadcrumbs;

    WebDriver driver;

    public HomePage(){
        PageFactory.initElements(DriverManager.getDriver(),this);
        driver=DriverManager.getDriver();
    }

    public void navigateToApplication(){
        driver.get("https://data.hrsa.gov/");
    }

    public void navigateToSubmenu(String menu,String submenu){
        Actions actions=new Actions(driver);
        switch (menu.toLowerCase()){
            case "data":actions.moveToElement(this.data).build().perform();
            break;
            case "topics":actions.moveToElement(this.topics).build().perform();
                break;
            case "tools":actions.moveToElement(this.tools).build().perform();
                break;
            case "help":actions.moveToElement(this.help).build().perform();
                break;
            case "maps":actions.moveToElement(this.maps).build().perform();
                break;
        }
        driver.findElement(By.xpath("//a[@title='"+submenu+"']")).click();

    }

    public String getBreadCrumb(){
        String output="";
        for(int i=0;i<breadcrumbs.size()-1;i++){
            output=output+breadcrumbs.get(i).getText()+">";
        }
        output=output+breadcrumbs.get(breadcrumbs.size()-1).getText();
        return output;
    }



}
