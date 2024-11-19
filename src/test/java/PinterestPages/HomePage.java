package PinterestPages;

import PageElements.HomePageHeader;
import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    public HomePageHeader homePageHeader = new HomePageHeader();

    private final By rootOfHomePage = By.xpath("//div[@id='__PWS_ROOT__']");

    public void waitHomePageIsLoaded() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(rootOfHomePage));
    }

}
