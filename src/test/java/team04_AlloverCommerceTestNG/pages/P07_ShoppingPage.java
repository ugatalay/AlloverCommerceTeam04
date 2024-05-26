package team04_AlloverCommerceTestNG.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team04_AlloverCommerceTestNG.utilities.*;

public class P07_ShoppingPage{

    public P07_ShoppingPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[@class='product_title entry-title']")
    public WebElement samsungS23;

    //Methods
    P00_MainPage mainPage = new P00_MainPage();
    public void searchProduct() {
        mainPage.homePage().searchBox.sendKeys(ConfigReader.getProperty("product1")+ Keys.ENTER);
        ReusableMethods.waitForSecond(3);
    }

}