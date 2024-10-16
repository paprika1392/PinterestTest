package PageElements;

import PinterestPages.BasePage;
import Utils.BrowserClass;
import org.openqa.selenium.By;

public class HomePageHeader extends BasePage {

    private final By headerProfile = By.xpath("//div[@data-test-id='header-profile']");

    public void clickHeaderProfile() {
        driver.findElement(headerProfile).click();
    }

}
