package team04_AlloverCommerceTestNG.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import team04_AlloverCommerceTestNG.pages.*;

public class US06 {

    @Test
    public void US06_TC01() throws InterruptedException {

        P00_MainPage mainPage = new P00_MainPage();
        mainPage.userVendorLoginPage().login();
        mainPage.shoppingPage().searchProduct();
        Assert.assertTrue(mainPage.shoppingPage().samsungS23.isDisplayed());

    }


}
