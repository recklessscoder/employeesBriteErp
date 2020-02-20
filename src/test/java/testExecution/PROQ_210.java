package testExecution;
import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.PROQ_210.EmployeeProfile;
import utilities.Reusable;

public class PROQ_210 {
    EmployeeProfile employeeProfile = new EmployeeProfile();
    Faker faker = new Faker();

    @Test
    public void createTimesheet(){
        Reusable.login_nav_to_employee_tab();
        employeeProfile.employeeProfile.click();
        employeeProfile.btnTimesheets.click();
        employeeProfile.btnCreate.click();
        employeeProfile.calendarDate.click();
        employeeProfile.btnEmployee.click();
        employeeProfile.selectEmployeeName.click();
        employeeProfile.descriptionField.sendKeys(faker.lorem().word());
        employeeProfile.projectField.click();
        employeeProfile.projectTab.click();
        employeeProfile.taskField.click();
        employeeProfile.taskTab.click();
        employeeProfile.timeField.clear();
        employeeProfile.timeField.sendKeys("03:00");
        Reusable.pause(3);
        employeeProfile.saveButton.click();
//        Reusable.return_to_employee_page();
    }
}
