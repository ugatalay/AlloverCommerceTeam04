package team04_AlloverCommerceTestNG.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team04_AlloverCommerceTestNG.utilities.Driver;

public class P06_AccountDetails {

    public P06_AccountDetails() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "account_first_name")
    public WebElement firstName;
    @FindBy(id = "account_last_name")
    public WebElement lastName;

    @FindBy(id = "account_display_name")
    public WebElement displayName;

    @FindBy(id = "account_email")
    public WebElement email;

    @FindBy(id = "password_current")
    public WebElement passwordCurrent;

    @FindBy(id = "password_1")
    public WebElement newPassword;

    @FindBy(id = "password_2")
    public WebElement confirmPassword;

}
