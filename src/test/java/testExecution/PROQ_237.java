package testExecution;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeDetailPage;
import pages.EmployeeTabPage;
import utilities.Reusable;

public class PROQ_237 {

    //Employee profile tabs are displayed

    @Test
    public void showingExistingEmployee() {
        Reusable.login_nav_to_employee_tab();

    //Search employee and see employee tab displayed

    EmployeeTabPage employeeTabPage = new EmployeeTabPage();
    EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();

// Type in an employee name
    employeeTabPage.searchBox.click();
    Reusable.pause(3);
    employeeTabPage.searchBox.sendKeys("Abuzer Kadayif" + Keys.ENTER);
    Reusable.pause(3);

// Verify if employee profile box is displayed
        Assert.assertTrue(employeeDetailPage.tableForEmployee.isDisplayed(), "Sorry, employee is not searchable");
    Reusable.pause(3);
    Reusable.return_to_employee_page();


    }

}
