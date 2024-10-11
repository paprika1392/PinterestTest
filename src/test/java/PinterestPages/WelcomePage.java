package PinterestPages;

import Utils.BrowserClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Utils.Constants.LOGIN;
import static Utils.Constants.PASSWORD;

public class WelcomePage extends BasePage {

    private final By loginButton = By.xpath("//div[@data-test-id='simple-login-button']");
    private final By registerForm = By.xpath("//div[@data-test-id='login-modal-default']");
    private final By emailField = By.xpath("//input[@id='email']");
    private final By passwordField = By.xpath("//input[@id='password'] ");
    private final By submitRegisterButton = By.xpath("//div[@data-test-id='registerFormSubmitButton'] ");


    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void waitRegisterForm() {
        BrowserClass.getWebdriverWait().until(ExpectedConditions.visibilityOfElementLocated(registerForm));
    }

    public void enterEmail() {
        driver.findElement(emailField).sendKeys(LOGIN);
    }

    public void enterPassword() {
        driver.findElement(passwordField).sendKeys(PASSWORD);
    }

    public void clickSubmitRegisterButton() {
        driver.findElement(submitRegisterButton).click();
    }
}
