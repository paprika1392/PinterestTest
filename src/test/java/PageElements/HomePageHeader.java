package PageElements;

import PinterestPages.BasePage;
import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageHeader extends BasePage {

    private final By headerProfile = By.xpath("//div[@data-test-id='header-profile']");

    public void waitUntilHeaderProfileWillBeClickable() {
        Browser.getWebdriverWait().until(ExpectedConditions.elementToBeClickable(headerProfile));
    }

    public void clickHeaderProfile() {
        driver.findElement(headerProfile).click();
    }

}
