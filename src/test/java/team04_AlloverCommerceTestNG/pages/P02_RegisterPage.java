package team04_AlloverCommerceTestNG.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team04_AlloverCommerceTestNG.utilities.Driver;

public class P02_RegisterPage {

    public  P02_RegisterPage() { PageFactory.initElements(Driver.getDriver(), this); }


    @FindBy(linkText = "Become a Vendor")
    public WebElement becomeAVendorLink;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement userName;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement yourEmailAddress;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement password;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement iAgreeToThePrivacyPolicy;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signUp;

    @FindBy(xpath = "//a[.='Please log in.']")
    public WebElement pleaseLogIn;

    @FindBy(xpath = "//p[.='An account is already registered with that username. Please choose another.']")
    public WebElement pleaseChooseAnother;

    @FindBy(linkText = "Sign Out")
    public WebElement signOut;
}
