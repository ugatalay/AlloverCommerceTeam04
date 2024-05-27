package team04_AlloverCommerceTestNG.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team04_AlloverCommerceTestNG.utilities.Driver;

public class P14_VendorRegisterPage {

    public P14_VendorRegisterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "user_email")
    public WebElement emailBox;

    @FindBy (name = "wcfm_email_verified_input")
    public WebElement verificationCodeBox;

    @FindBy (id = "passoword")
    public WebElement passwordBox;

    @FindBy (id = "confirm_pwd")
    public WebElement confirmPasswordBox;

    @FindBy (id = "wcfm_membership_register_button")
    public WebElement registerButton;

    @FindBy (xpath = "(//div[@tabindex='-1'])[1]")
    public WebElement verificationSendMessage;

    @FindBy (xpath = "(//h1)[2]")
    public WebElement welcomePageText;

    @FindBy (xpath = "(//div[@tabindex='-1'])[2]")
    public WebElement mailSendMessage;

}
