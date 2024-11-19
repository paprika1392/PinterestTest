package Steps;

import PinterestPages.AccountPage;
import PinterestPages.HomePage;
import PinterestPages.WelcomePage;
import Utils.Browser;

import static Utils.Constants.PINTEREST_URL;

public class Steps {

    public static WelcomePage welcomePage = new WelcomePage();
    public static HomePage homePage = new HomePage();
    public static AccountPage accountPage = new AccountPage();

    // Steps for BaseTest

    public static void openBrowser() {
        Browser.webDriverStartWork();
        Browser.setUrl(PINTEREST_URL);
        Browser.customizeBrowserWindow();
    }

    public static void clearCookies() {
        Browser.clearCookiesAndStorage();
    }

    public static void closeBrowser() {
        Browser.closeBrowser();
    }

    // Steps for login test

    public static void enterLoginAndPassword(String login, String password) {
        welcomePage.waitUntilLoginButtonWillBeClickable();
        welcomePage.clickLoginButton();
        welcomePage.waitRegisterForm();
        welcomePage.enterEmail(login);
        welcomePage.enterPassword(password);
        welcomePage.clickSubmitRegisterButton();
    }

    public static void goToPersonalProfile(){
        homePage.waitHomePageIsLoaded();
        homePage.homePageHeader.waitUntilHeaderProfileWillBeClickable();
        homePage.homePageHeader.clickHeaderProfile();
    }

    public static void getCurrentAccountName() {
        accountPage.waitUntilCurrentAccountNameWillBeVisible();
        accountPage.getAccountName();
    }


}
