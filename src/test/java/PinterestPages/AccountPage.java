package PinterestPages;

import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountPage extends BasePage {

    public static String accountName;

    private final By currentAccountName = By.xpath("//div[@data-test-id='profile-name']");
    private final By firstDataGridItem = By.xpath("//div[@data-grid-item-idx='0']");
    private final By saveButton = By.xpath("//button[@aria-label='Save']");

    public  void waitUntilCurrentAccountNameWillBeVisible() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(currentAccountName));
    }

    public void getAccountName() {
        accountName = driver.findElement(currentAccountName).getText();
    }

    public void selectFirstDataGridItem() {
        driver.findElement(firstDataGridItem).isSelected();
    }

    public void clickSaveButton() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(saveButton));
        driver.findElement(saveButton).click();
    }

}
