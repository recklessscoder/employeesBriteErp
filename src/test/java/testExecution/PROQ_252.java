package testExecution;
import org.testng.annotations.Test;
import pages.DeleteTimesheet;
import utilities.Driver;
import utilities.Reusable;

import java.util.concurrent.TimeUnit;

public class PROQ_252 {
    DeleteTimesheet deleteTimesheet = new DeleteTimesheet();

    @Test
    public void deleteTimesheet(){
        Reusable.login_nav_to_employee_tab();
        deleteTimesheet.employeeProfile.click();
        deleteTimesheet.btnTimesheets.click();
        deleteTimesheet.btnOptions.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        deleteTimesheet.btnAction.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        deleteTimesheet.btnDelete.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        deleteTimesheet.btnOk.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        Reusable.return_to_employee_page();

    }
}
