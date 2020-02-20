package testExecution;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeDetailPage;
import pages.EmployeeTabPage;
import utilities.Reusable;

public class PROQ_228 {

    @Test (priority  = 2)
    public void seeEmployeeList() {

        EmployeeTabPage employeeTabPage = new EmployeeTabPage();
        EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();
        Reusable.login_nav_to_employee_tab();
        employeeTabPage.gridButton.click();
        Assert.assertTrue(employeeTabPage.gridButton.isEnabled(),"Button  is not clickable");
        Reusable.pause(3);
        employeeTabPage.listButton.click();
        Assert.assertTrue(employeeDetailPage.tableContentList.isDisplayed(),"List button is not clicked!");

    }
}