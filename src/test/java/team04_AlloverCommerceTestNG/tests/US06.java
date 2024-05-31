package team04_AlloverCommerceTestNG.tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import team04_AlloverCommerceTestNG.pages.*;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.ReusableMethods;

public class US06{


    P00_MainPage mainPage = new P00_MainPage();

   @Test
    public void US06_TC01() throws InterruptedException {
        mainPage.userVendorLoginPage().login();

        mainPage.shoppingPage().searchProduct1();

        Assert.assertTrue(mainPage.shoppingPage().samsungS23.isDisplayed());

    }

    @Test
    public void US06_TC02() {
        mainPage.userVendorLoginPage().login();
        mainPage.shoppingPage().invalidSearch();
        Assert.assertEquals("No products were found matching your selection.", mainPage.shoppingPage().searchResult.getText());

    }



    @Test
    public void US06_TC03() {
        mainPage.userVendorLoginPage().login();
        mainPage.shoppingPage().searchProduct1();
        Assert.assertTrue(mainPage.shoppingPage().productAddedText.isDisplayed());
    }

    @Test
    public void US06_TC04() {
        mainPage.userVendorLoginPage().login();
        mainPage.shoppingPage().searchProduct2();
        Assert.assertTrue(mainPage.shoppingPage().productAddedText.isDisplayed());
    }

    @Test
    public void US06_TC05() {
        mainPage.userVendorLoginPage().login();
        mainPage.shoppingPage().searchProduct3();
        Assert.assertTrue(mainPage.shoppingPage().productAddedText.isDisplayed());
    }

    @Test
    public void US06_TC06() {
        mainPage.userVendorLoginPage().login();
        mainPage.shoppingPage().searchProduct1();
        mainPage.shoppingPage().viewCartButton.click();
        Assert.assertTrue(mainPage.shoppingPage().productInCart.isDisplayed());
    }

    @Test
    public void US06_TC07() {
        mainPage.userVendorLoginPage().login();
        mainPage.shoppingPage().searchProduct1();
        mainPage.shoppingPage().viewCartButton.click();
        mainPage.shoppingPage().quantityPlus.click();
    }

}
