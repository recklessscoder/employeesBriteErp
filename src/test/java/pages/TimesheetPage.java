package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TimesheetPage {

    public TimesheetPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy (xpath = "//button[@class = 'btn btn-primary btn-sm o_list_button_add']")
    public WebElement createButton;

    @FindBy (xpath = "(//input[@class = 'o_input ui-autocomplete-input'])[1]")
    public WebElement employeeDropDownButton;

    @FindBy (xpath = "(//input[@class = 'o_input ui-autocomplete-input'])[2]")
    public WebElement projectField;

    @FindBy (xpath = "//input [@name = 'name']")
    public  WebElement descriptionField ;
}
