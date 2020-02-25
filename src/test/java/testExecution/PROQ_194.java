package testExecution;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmployeeDetailPage;
import pages.EmployeeTabPage;
import utilities.Reusable;

public class PROQ_194 {

    @Test
    public void tc_194 () {
        // log in and nav to Emp tab
        Reusable.login_nav_to_employee_tab();

        // click on an employee
        EmployeeTabPage employeeTabPage = new EmployeeTabPage();
        employeeTabPage.employeeProfileKanban.click();

        // click on Send Message
        EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();
        employeeDetailPage.sendMessageButton.click();

        // entering text into MessageBox
        String sendMessageText = "This is an automated test message";
        employeeDetailPage.messageBox.sendKeys(sendMessageText);

        // clicking on Send button
        employeeDetailPage.sendButtonFinal.click();

        // checking if the most recent message equals to entered text
        // locating most recent message (dynamic)
        Assert.assertEquals(sendMessageText,employeeDetailPage.getLastMessage.getText());

        Reusable.return_to_employee_page();
        // nav to Employees tab




    }
}
