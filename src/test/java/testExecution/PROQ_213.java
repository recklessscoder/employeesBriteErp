package testExecution;

import org.testng.annotations.Test;
import pages.EmployeeDetailPage;
import pages.EmployeeTabPage;
import utilities.Reusable;

public class PROQ_213 {

    EmployeeTabPage employeeTabPage = new EmployeeTabPage();

    @Test
    public void test() {
        //logging in and nav to empl tab
        Reusable.login_nav_to_employee_tab();

        // click on an employee
        EmployeeTabPage employeeTabPage = new EmployeeTabPage();
        employeeTabPage.employeeProfileKanban.click();

        // click on Log note button
        EmployeeDetailPage employeeDetailPage = new EmployeeDetailPage();
        employeeDetailPage.logNoteButton.click();

        // entering text into log note
        String logNoteMessage = "testing of log note";
        employeeDetailPage.logNoteMessageBox.sendKeys(logNoteMessage);
        employeeDetailPage.finalLogButton.click();

        // checking if log note was sent
        if (employeeDetailPage.mostRecentLogNote.getText().equals(logNoteMessage)) {
            System.out.println("Message that was just sent is correct");
        } else {
            System.out.println("This is INCORRECT message!");
        }

        //navigate back to employee tab
        Reusable.return_to_employee_page();


    }



}

