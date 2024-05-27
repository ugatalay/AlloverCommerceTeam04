package team04_AlloverCommerceTestNG.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team04_AlloverCommerceTestNG.utilities.*;

public class P03_LoginPage {

    public P03_LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "username")
    public WebElement usernameBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement signInButton;



    //Methods
    P00_MainPage mainPage = new P00_MainPage();
    public void login() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        mainPage.homePage().singIn.click();
        mainPage.userVendorLoginPage().usernameBox.click();
        mainPage.userVendorLoginPage().usernameBox.sendKeys(ConfigReader.getProperty("username"));
        mainPage.userVendorLoginPage().passwordBox.sendKeys(ConfigReader.getProperty("userpassword"));
        mainPage.userVendorLoginPage().signInButton.click();
        ReusableMethods.waitForSecond(3);
    }


}
