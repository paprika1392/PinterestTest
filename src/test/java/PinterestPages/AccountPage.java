package PinterestPages;

import org.openqa.selenium.By;

public class AccountPage extends BasePage {

    private final By currentAccountName = By.xpath("//div[@data-test-id='profile-name']");


    public void getAccountName() {
        String accountName = driver.findElement(currentAccountName).getText();
    }


}
