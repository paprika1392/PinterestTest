package PageElements;

import PinterestPages.BasePage;
import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePageHeader extends BasePage {

    private final By headerProfile = By.xpath("//div[@data-test-id='header-profile']");
    private final By firstDataGridItem = By.xpath("//div[@data-grid-item-idx='0']");
    private final By saveButton = By.xpath("//button[@aria-label='Save']");

    public void waitUntilHeaderProfileWillBeClickable() {
        Browser.getWebdriverWait().until(ExpectedConditions.elementToBeClickable(headerProfile));
    }

    public void clickHeaderProfile() {
        driver.findElement(headerProfile).click();
    }

    public void selectFirstDataGridItem() {
        driver.findElement(firstDataGridItem).isSelected();
    }

    public void clickSaveButton() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(saveButton));
        driver.findElement(saveButton).click();
    }

}
