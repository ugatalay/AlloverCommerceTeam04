package team04_AlloverCommerceTestNG.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team04_AlloverCommerceTestNG.utilities.Driver;

public class P02_RegisterPage {



    public P02_RegisterPage() { PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Become a Vendor")
    public WebElement becomeAVendorLink;







}
