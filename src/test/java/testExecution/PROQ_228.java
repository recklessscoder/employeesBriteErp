package testExecution;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeDetailPage;
import pages.EmployeeTabPage;
import utilities.Reusable;

public class PROQ_228 {

    //User as a manager / able to see employee list and grid n are clickable
    /*
    User goes to the webpage
http://54.148.96.210/web/login
Website opens and login button displays
2
User logs in with using manager credentials
the user is able to log in and the user directed to then main page.
3
User click on the employee module
User is directed to the employees page
4
User clicks on the rightmost corner “LIST” button
User is able to see employee list as well as grid
     */
    @Test
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