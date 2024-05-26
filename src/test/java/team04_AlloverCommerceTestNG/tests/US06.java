package team04_AlloverCommerceTestNG.tests;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import team04_AlloverCommerceTestNG.pages.*;
import team04_AlloverCommerceTestNG.utilities.*;

public class US06 {

    @Test
    public void US06_TC01() throws InterruptedException {

        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        mainPage.homePage().signIn.click();
        mainPage.userVendorLoginPage().usernameBox.click();
        mainPage.userVendorLoginPage().usernameBox.sendKeys(ConfigReader.getProperty("username"));
        mainPage.userVendorLoginPage().passwordBox.sendKeys(ConfigReader.getProperty("userpassword"));
        mainPage.userVendorLoginPage().signInButton.click();
        ReusableMethods.waitForSecond(3);

        mainPage.homePage().searchBox.sendKeys(ConfigReader.getProperty("product1")+ Keys.ENTER);
        ReusableMethods.waitForSecond(3);
        Assert.assertTrue(mainPage.shoppingPage().samsungS23.isDisplayed());

    }


}
