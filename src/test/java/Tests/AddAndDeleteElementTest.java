package Tests;

import Steps.Steps;
import Utils.Browser;
import org.testng.annotations.Test;

import static Utils.Constants.LOGIN;
import static Utils.Constants.PASSWORD;

public class AddAndDeleteElementTest extends BaseTest {
    @Test
    public void addAndDeleteElementTest() {
        Steps.enterLoginAndPassword(LOGIN, PASSWORD);
        Steps.selectAndSaveFirstDataGridElement();
        Steps.goToPersonalProfile();
        Steps.selectAndDeleteFirstDataGridElement();
      }

}
