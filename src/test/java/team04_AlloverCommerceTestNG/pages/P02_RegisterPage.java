package team04_AlloverCommerceTestNG.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team04_AlloverCommerceTestNG.utilities.Driver;

public class P02_RegisterPage {

    public P02_RegisterPage () {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "reg_username")
    public WebElement userNameBox;

    @FindBy(id = "reg_email")
    public WebElement yourEmailBox ;

    @FindBy(id = "reg_password")
    public WebElement passWordBox;

    @FindBy(id = "register-policy")
      public WebElement checkBox;

   @FindBy(name = "register")
    public WebElement SignInBox;

    @FindBy(xpath = "//button[@name='login']")

    public WebElement signInButton;

    @FindBy(xpath="//a[@class='login logout inline-type']")
    public WebElement SingOutLink;










}
