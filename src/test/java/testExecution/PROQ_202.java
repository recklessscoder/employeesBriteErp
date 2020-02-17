package testExecution;

import org.testng.annotations.Test;
import pages.EmployeeDetailPage;
import pages.EmployeeTabPage;
import utilities.Reusable;

public class PROQ_202 {
    @Test
    public void tc202 () {
        // logging in and nav to empl tab
        Reusable.login_nav_to_employee_tab();

        // clicking on an employee
        EmployeeTabPage employeeTabPage = new EmployeeTabPage();
        employeeTabPage.employeeProfileKanban.click();

        // finding out the name and printing out
        EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();
        String employeeName = employeeDetailPage.nameOfEmployeeInHeader.getText();
        System.out.println(employeeName);

        //returning to Employees tab
        Reusable.return_to_employee_page();
    }
}
