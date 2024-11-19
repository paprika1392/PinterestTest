package Tests;

import PinterestPages.AccountPage;
import Steps.Steps;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utils.Constants.ACTUAL_ACCOUNT_NAME;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        Steps.enterLoginAndPassword();
        Steps.goToPersonalProfile();
        Steps.getCurrentAccountName();
        Boolean result = AccountPage.accountName.equals(ACTUAL_ACCOUNT_NAME);
        Assert.assertTrue(result, String.format("Incorrect current account name"));

    }
}
