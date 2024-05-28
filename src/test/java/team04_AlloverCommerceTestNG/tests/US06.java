package team04_AlloverCommerceTestNG.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import team04_AlloverCommerceTestNG.pages.*;
import team04_AlloverCommerceTestNG.utilities.ReusableMethods;

public class US06 {

    P00_MainPage mainPage = new P00_MainPage();

    @Test
    public void US06_TC01() throws InterruptedException {
        mainPage.userVendorLoginPage().login();
        mainPage.shoppingPage().searchProduct();
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
        mainPage.shoppingPage().searchProduct();
        ReusableMethods.scroll(mainPage.shoppingPage().addToCartButton);
        ReusableMethods.click(mainPage.shoppingPage().addToCartButton);
        Assert.assertTrue(mainPage.shoppingPage().productAddedText.isDisplayed());
    }
}
