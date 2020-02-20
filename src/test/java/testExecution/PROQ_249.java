package testExecution;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeDetailPage;
import pages.EmployeeTabPage;
import utilities.Reusable;

public class PROQ_249 {


    @Test
    public void tc_249() {
        EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();

        // logging in and nav to empl tab
        Reusable.login_nav_to_employee_tab();

        // click on an employee
        EmployeeTabPage employeeTabPage = new EmployeeTabPage();
        employeeTabPage.employeeProfileKanban.click();
        Assert.assertTrue(employeeDetailPage.nextButton.isDisplayed(), "Next button is NOT present");
        System.out.println(employeeDetailPage.employeeNameInHeader.getText());

        // clicking on next button to go to next Employee
        employeeDetailPage.nextButton.click();
        System.out.println(employeeDetailPage.employeeNameInHeader.getText());
        Assert.assertTrue(employeeDetailPage.previousButton.isDisplayed(), "Previous button is NOT displayed");

        // clicking on previous button to go back to previous Employee
        Reusable.pause(1);
        employeeDetailPage.previousButton.click();
        System.out.println(employeeDetailPage.employeeNameInHeader.getText());

        //navigate back to employee tab
        Reusable.return_to_employee_page();


    }
}