package PinterestPages;

import PageElements.FirstDataGridElement;
import PageElements.HomePageHeader;
import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    public HomePageHeader homePageHeader = new HomePageHeader();
    public FirstDataGridElement firstDataGridElement = new FirstDataGridElement();

    private final By rootOfHomePage = By.xpath("//div[@id='__PWS_ROOT__']");

    public void waitHomePageIsLoaded() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(rootOfHomePage));
    }

}
