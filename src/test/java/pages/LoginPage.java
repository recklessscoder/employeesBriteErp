package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

public LoginPage(){
    PageFactory.initElements(Driver.getDriver(), this);
}

    //username box web element
    @FindBy (id = "login")
    public WebElement usernameInput;

    //password box web element
    @FindBy(id = "password")
    public WebElement passwordInput;

    //login button web element
    @FindBy(xpath = "//button[@type = 'submit']")
    public WebElement loginButton;


}
