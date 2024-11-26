package PinterestPages;

import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountPage extends BasePage {

    public static String accountName;

    private final By currentAccountName = By.xpath("//div[@data-test-id='profile-name']");

    public  void waitUntilCurrentAccountNameWillBeVisible() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(currentAccountName));
    }

    public void getAccountName() {
        accountName = driver.findElement(currentAccountName).getText();
    }
}
