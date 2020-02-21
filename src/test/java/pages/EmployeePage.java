package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EmployeePage {
    public EmployeePage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span")
    public WebElement search;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/button")
    public WebElement favoriteBox;
    @FindBy(linkText = "Add to my Dashboard")
    public WebElement addDashboard;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/ul/li[9]/input")
    public WebElement employeeBox;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/ul/li[10]/button")
    public WebElement addEmployee;

    // Dashboard tab locator
    @FindBy (xpath = "(//span[@class='oe_menu_text'])[12]")
    public WebElement dashboardTab;

    // name of added Employee module
    @FindBy (xpath = "(//span[@class='oe_header_txt'])[1]")
    public WebElement nameOfEmployeeModuleOnDashboard;


}
