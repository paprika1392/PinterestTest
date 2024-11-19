package PinterestPages;

import Utils.Browser;
import org.openqa.selenium.WebDriver;

public class BasePage {

    public WebDriver driver;             //singleton

public BasePage() {
    driver = Browser.getDriver();   //singleton
}
}
