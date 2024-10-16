package Steps;

import PinterestPages.AccountPage;
import PinterestPages.HomePage;
import PinterestPages.WelcomePage;
import Utils.BrowserClass;

import static Utils.Constants.PINTEREST_URL;

public class Steps {

    public static WelcomePage welcomePage = new WelcomePage();
    public static HomePage homePage = new HomePage();
    public static AccountPage accountPage = new AccountPage();

    // Steps for BaseTest

    public static void openBrowser() {
        BrowserClass.webDriverStartWork();
        BrowserClass.setUrl(PINTEREST_URL);
        BrowserClass.customizeBrowserWindow();
    }

    public static void clearCookies() {
        BrowserClass.clearCookiesAndStorage();
    }

    public static void closeBrowser() {
        BrowserClass.closeBrowser();
    }

    // Steps for login test

    public static void enterLoginAndPassword() {
        welcomePage.clickLoginButton();
        welcomePage.waitRegisterForm();
        welcomePage.enterEmail();
        welcomePage.enterPassword();
        welcomePage.clickSubmitRegisterButton();
    }

    public static void goToPersonalProfile(){
        homePage.waitHomePageIsLoaded();
        homePage.homePageHeader.clickHeaderProfile();
    }

    public static void getCurrentAccountName() {
        accountPage.getAccountName();
    }


}
