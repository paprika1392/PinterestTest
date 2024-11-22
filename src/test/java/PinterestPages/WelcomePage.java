package PinterestPages;

import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WelcomePage extends BasePage {

    private final By loginButton = By.xpath("//div[@data-test-id='simple-login-button']");
    private final By registerForm = By.xpath("//div[@data-test-id='login-modal-default']");
    private final By emailField = By.xpath("//input[@id='email']");
    private final By passwordField = By.xpath("//input[@id='password'] ");
    private final By submitRegisterButton = By.xpath("//div[@data-test-id='registerFormSubmitButton'] ");

    public void waitUntilLoginButtonWillBeClickable() {
        Browser.getWebdriverWait().until(ExpectedConditions.elementToBeClickable(loginButton));
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void waitRegisterForm() {
        Browser.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(registerForm));
    }

    public void enterEmail(String login) {
        driver.findElement(emailField).sendKeys(login);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSubmitRegisterButton() {
        driver.findElement(submitRegisterButton).click();
    }
}
