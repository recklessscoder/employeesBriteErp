package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EmployeeDetailPage {


    public EmployeeDetailPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//button[@class= 'o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[1]/..")
    public WebElement printDropdownButton;

    @FindBy(xpath = "(//button[@class= 'o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]/..")
    public WebElement attachmentButton;

    @FindBy(xpath = "(//button[@class= 'o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]/..")
    public WebElement actionDropdownButton;

    @FindBy (xpath = "(//a[@data-section='files'])[1]")
    public WebElement latestUploadedFile;

    @FindBy (xpath = "//span[contains(text(),'Timesheet')]")
    public WebElement timesheetButton;

}
