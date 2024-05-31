package team04_AlloverCommerceTestNG.tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import team04_AlloverCommerceTestNG.pages.P00_MainPage;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.Driver;

public class US10 {
    P00_MainPage mainPage = new P00_MainPage();

    @AfterClass
    public void afterClass (){
        Driver.closeDriver();
    }



    @Test (description = "US 10 - TC 01  visible Too Short Type  Password at Vendor Register " )
    public void visibleTooShortTypePassword() {

        // Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // Register alanına tıkla
        mainPage.homePage().registerButton.click();

        // Açılan pop-up ta "Become a Vendor" alanına tıkla
        mainPage.registerPage().becomeAVendorLink.click();

       // Password alanına "1" gir
        mainPage.vendorRegisterPage().passwordBox.sendKeys("1");

       // "Too short"  bilgisinin çıktığını doğrula
        Assert.assertEquals(mainPage.vendorRegisterPage().passwordStrengthType.getText(),"Too short");


    }

    @Test (description = "US 10 - TC 02  visible Weak Type  Password at Vendor Register " )
    public void visibleWeakTypePassword() {

        // Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // Register alanına tıkla
        mainPage.homePage().registerButton.click();

        // Açılan pop-up ta "Become a Vendor" alanına tıkla
        mainPage.registerPage().becomeAVendorLink.click();

        // Password alanına  "123456" gir
        mainPage.vendorRegisterPage().passwordBox.sendKeys("123456");

        // "Weak"  bilgisinin çıktığını doğrula
        Assert.assertEquals(mainPage.vendorRegisterPage().passwordStrengthType.getText(),"Weak");



    }

    @Test (description = "US 10 - TC 03  visible Good Type  Password at Vendor Register " )
    public void visibleGoodTypePassword() {

        // Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // Register alanına tıkla
        mainPage.homePage().registerButton.click();

        // Açılan pop-up ta "Become a Vendor" alanına tıkla
        mainPage.registerPage().becomeAVendorLink.click();

        // Password alanına "123456ab" gir
        mainPage.vendorRegisterPage().passwordBox.sendKeys("123456ab");

        // "Good"  bilgisinin çıktığını doğrula
        Assert.assertEquals(mainPage.vendorRegisterPage().passwordStrengthType.getText(),"Good");



    }

    @Test (description = "US 10 - TC 04  visible Strong Type  Password at Vendor Register " )
    public void visiblestrongTypePassword() {

        // Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // Register alanına tıkla
        mainPage.homePage().registerButton.click();

        // Açılan pop-up ta "Become a Vendor" alanına tıkla
        mainPage.registerPage().becomeAVendorLink.click();

        // Password alanına "12Aa-%" gir
        mainPage.vendorRegisterPage().passwordBox.sendKeys("12Aa-%");

        // "Strong"  bilgisinin çıktığını doğrula
        Assert.assertEquals(mainPage.vendorRegisterPage().passwordStrengthType.getText(),"Strong");



    }
}
