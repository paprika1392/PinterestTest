package PageElements;

import PinterestPages.BasePage;
import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FirstDataGridElement extends BasePage {
    
    public static Boolean displayOfFirstDataGridItem;

    private final By firstDataGridItem = By.xpath("//div[@data-grid-item-idx='0']");
    private final By saveButton = By.xpath("//button[@aria-label='Save']");
    private final By deleteButton = By.xpath("//div[@data-test-id='delete-pin-button']");
    private final By editButton = By.xpath("//button[@aria-label='Edit']");
    private final By confirmDeleteButton = By.xpath("//div[@data-test-id='confirm-delete-pin']");

    public void selectFirstDataGridItem() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(firstDataGridItem));
        WebElement element = driver.findElement(firstDataGridItem);

        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }

    public void clickSaveButton() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(saveButton));
        driver.findElement(saveButton).click();
    }

    public void clickEditButton() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(editButton));
        driver.findElement(editButton).click();
    }

    public void clickDeleteButton() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(deleteButton));
        driver.findElement(deleteButton).click();
    }

    public void clickConfirmDeleteButton() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(confirmDeleteButton));
        driver.findElement(confirmDeleteButton).click();
    }

    public Boolean checkFirstDataGridElementIsDisplayed() {
        displayOfFirstDataGridItem = driver.findElement(firstDataGridItem).isDisplayed();
        return displayOfFirstDataGridItem;
    }

}
