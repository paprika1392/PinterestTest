package PinterestPages;

import Utils.BrowserClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    private final By rootOfHomePage = By.xpath("//div[@id='__PWS_ROOT__']");

    public void waitHomePageIsLoaded() {
        BrowserClass.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(rootOfHomePage));
    }

}
