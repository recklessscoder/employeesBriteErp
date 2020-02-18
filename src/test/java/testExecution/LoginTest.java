package testExecution;

import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.*;

public class LoginTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void loginTest(){
        Reusable.login_nav_to_employee_tab();
    }

}
