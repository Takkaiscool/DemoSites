package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    private static WebDriver driver;
    public static  void  setWebdriver(String browser){
        switch (browser.toLowerCase()){
            case "chrome":driver=new ChromeDriver();
            break;
            case "firefox":driver=new FirefoxDriver();
            break;
            case "edge":driver=new EdgeDriver();
            break;
        }
    }

    public static WebDriver getDriver(){
        return  driver;
    }
}
