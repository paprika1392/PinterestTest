package PinterestPages;

import Utils.BrowserClass;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;             //singleton

public BasePage() {
    driver = BrowserClass.getDriver();   //singleton
}
}
