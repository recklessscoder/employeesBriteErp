package utilities;

import cucumber.api.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.EmployeeTabPage;
import pages.LoginPage;

import java.io.File;
import java.util.Random;

public class Reusable {
    public static void login_nav_to_employee_tab(){

        LoginPage loginPage = new LoginPage();


        Driver.getDriver().get(Config.getProperty("briteUrl"));

        loginPage.usernameInput.sendKeys(Config.getProperty("managerUsername"));
        loginPage.passwordInput.sendKeys(Config.getProperty("managerPassword"));
        loginPage.loginButton.click();

       Reusable.pause(2);
        Driver.getDriver().findElement(By.xpath("(//*[contains(text(),'Employees')])[1]")).click();


    }

    public static void return_to_employee_page(){
        EmployeeTabPage employeeTabPage =new EmployeeTabPage();
        employeeTabPage.sideBarEmployeeButton.click();
    }

    public static int randomEmployee(int maxEmployee){
        Random random = new Random();
        return random.nextInt(maxEmployee);
    }

    public static void pause (int seconds){
        try {
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void waitForVisibility(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), seconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static boolean isFileDownloaded(String downloadPath, String fileName) {

            File dir = new File(downloadPath);
            File[] dirContents = dir.listFiles();
            for (int i = 0; i < dirContents.length; i++) {
                if (dirContents[i].getName().equals(fileName)) {
// File has been found, it can now be deleted:
                    dirContents[i].delete();
                    return true;
                }
            }
            return false;
        }


}
