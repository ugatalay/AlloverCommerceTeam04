package team04_AlloverCommerceTestNG.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team04_AlloverCommerceTestNG.utilities.Driver;

public class P01_HomePage {

    public P01_HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Sign In']")
    public WebElement signIn;

    @FindBy(xpath = "//div[@class='search-wrapper hs-simple']//input[@name='s']")
    public WebElement searchBox;





}
