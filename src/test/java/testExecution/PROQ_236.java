package testExecution;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeDetailPage;
import pages.EmployeeTabPage;
import utilities.Driver;
import utilities.Reusable;

public class PROQ_236 {


    @Test
    public void tc_236() {
        //    user is on employee tab
        Reusable.login_nav_to_employee_tab();

        // user clicks on employee profile
        EmployeeTabPage employeeTabPage = new EmployeeTabPage();
        employeeTabPage.employeeProfileKanban.click();
        EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();

        // user locate and hover message that he wants to Mark as TODO

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(employeeDetailPage.lastMessage).build().perform();

        // user clicks on STAR icon

        employeeDetailPage.starForLastMessage.click();
        action.moveToElement(employeeDetailPage.employeeNameInHeader).build().perform();

        // that message should be marked with star as TODO

        Assert.assertTrue(employeeDetailPage.starForLastMessage.isDisplayed());

        // unclicking star
        employeeDetailPage.starForLastMessage.click();
    }
}
