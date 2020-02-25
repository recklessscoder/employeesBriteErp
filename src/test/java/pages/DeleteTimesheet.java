package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class DeleteTimesheet {
    public DeleteTimesheet(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='oe_kanban_global_click o_kanban_record'][5]")
    public WebElement employeeProfile;

    @FindBy(xpath = "//button[@class='btn btn-sm oe_stat_button']")
    public WebElement btnTimesheets;

    @FindBy(xpath = "//tr[1]//td[1]//div[1]//input[1]")
    public WebElement btnOptions;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[2]")
    public WebElement btnAction;

    @FindBy(xpath = "//a[contains(text(),'Delete')]")
    public WebElement btnDelete;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement btnOk;

    @FindBy (xpath = "//button[@accesskey = 'c']" )
    public WebElement createButton;

    @FindBy ( xpath = "(//input [@class = 'o_input ui-autocomplete-input'])[1]")
    public WebElement inputEmployeeName;

    @FindBy (xpath = "(//input [@class = 'o_input ui-autocomplete-input'])[2]")
    public WebElement inputProjectName;

    @FindBy (xpath = "(//input [@class = 'o_input ui-autocomplete-input'])[3]")
    public WebElement inputTask;

    @FindBy (xpath = "//input[@name = \"name\"]")
    public  WebElement inputDescription ;

    @FindBy (xpath = "//button [@class=\"btn btn-sm btn-primary\"]")
    public WebElement okButton;
}
