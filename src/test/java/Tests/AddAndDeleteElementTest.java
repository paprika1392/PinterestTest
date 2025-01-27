package Tests;

import PageElements.FirstDataGridElement;
import Steps.Steps;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Utils.Constants.LOGIN;
import static Utils.Constants.PASSWORD;

public class AddAndDeleteElementTest extends BaseTest {
    @Test
    public void addAndDeleteElementTest() {
        Steps.enterLoginAndPassword(LOGIN, PASSWORD);
        Steps.addFirstDataGridElement();
        Steps.goToAccountPage();
        Steps.reloadCurrentPage();
        Assert.assertTrue(FirstDataGridElement.displayOfFirstDataGridItem, "The element is not displayed");
        Steps.deleteFirstDataGridElement();
        Assert.assertFalse(FirstDataGridElement.displayOfFirstDataGridItem, "The element is till displayed");
      }

}
