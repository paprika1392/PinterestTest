package Tests;

import PinterestPages.AccountPage;
import Steps.Steps;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utils.Constants.*;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        Steps.enterLoginAndPassword(LOGIN, PASSWORD);
        Steps.goToPersonalProfile();
        Steps.getCurrentAccountName();
        boolean result = AccountPage.accountName.equals(EXPECTED_ACCOUNT_NAME);
        Assert.assertTrue(result, "Incorrect current account name");

    }
}
