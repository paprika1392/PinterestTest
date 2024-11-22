package PinterestPages;

import PageElements.HomePageHeader;
import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{

    public HomePageHeader homePageHeader = new HomePageHeader();

    private final By rootOfHomePage = By.xpath("//div[@id='__PWS_ROOT__']");
    private final By firstDataGridItem = By.xpath("//div[@data-grid-item-idx='0']");
    private final By saveButton = By.xpath("//button[@aria-label='Save']");

    public void waitHomePageIsLoaded() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(rootOfHomePage));
    }

    public void selectFirstDataGridItem() {
        driver.findElement(firstDataGridItem).isSelected();
    }

    public void clickSaveButton() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(saveButton));
        driver.findElement(saveButton).click();
    }

}
