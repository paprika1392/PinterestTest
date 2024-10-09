package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserClass {

    private static WebDriver driver; //singleton

    private BrowserClass() {         //singleton

    }

    public static WebDriver getDriver() {  //singleton
        if(driver == null) {
            WebDriverManager.chromedriver().setup();  // automatic driver download
            WebDriver driver = new ChromeDriver();
        }
        return driver;
    }

    public static void webDriverStartWork(){
        getDriver();
    }


    }

