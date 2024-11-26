package PageElements;

import PinterestPages.BasePage;
import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FirstDataGridElement extends BasePage {

    private final By firstDataGridItem = By.xpath("//div[@data-grid-item-idx='0']");
    private final By saveButton = By.xpath("//button[@aria-label='Save']");
    private final By deleteButton = By.xpath("//div[@data-test-id='delete-pin-button']");

    public void selectFirstDataGridItem() {
        driver.findElement(firstDataGridItem).isSelected();
    }

    public void clickSaveButton() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(saveButton));
        driver.findElement(saveButton).click();
    }

    public void clickFirstDataGridElement() {
        driver.findElement(firstDataGridItem).click();
    }

    public void clickDeleteButton() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(deleteButton));
        driver.findElement(deleteButton).click();
    }
}
