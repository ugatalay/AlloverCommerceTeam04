package team04_AlloverCommerceTestNG.pages;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.Driver;
import team04_AlloverCommerceTestNG.utilities.ReusableMethods;



public class P07_ShoppingPage {
P00_MainPage mainPage = new P00_MainPage();
    public P07_ShoppingPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }



    public void invalidSearch() {
     mainPage.homePage().searchBox.sendKeys(ConfigReader.getProperty("invalid_search") + Keys.ENTER);
        ReusableMethods.waitForSecond(3);

}

}