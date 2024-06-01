package team04_AlloverCommerceTestNG.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team04_AlloverCommerceTestNG.utilities.Driver;

public class P12_ComparePage {


    public P12_ComparePage (){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//div[@class='compare-popup show']")
    public static WebElement comparePopup;

    @FindBy(xpath="//a[@class='btn btn-dark btn-rounded']")
    public WebElement compareButonu;


    @FindBy(xpath = "//div[@class='compare-heading']/p")
    public WebElement comparingProductCount;


    @FindBy(xpath = "//div[@class='main-content']")
    public WebElement compareField;


}
