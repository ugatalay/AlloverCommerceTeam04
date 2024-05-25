package team04_AlloverCommerceTestNG.tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import team04_AlloverCommerceTestNG.pages.*;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.Driver;

public class US06 {

    @Test
    public void US06_TC01() {

        P01_HomePage homePage = new P01_HomePage();
        P03_LoginPage loginPage = new P03_LoginPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        homePage.signIn.click();
        loginPage.usernameBox.click();
        loginPage.usernameBox.sendKeys(ConfigReader.getProperty("username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getProperty("userpassword"));
        loginPage.signInButton.click();
        homePage.searchBox.sendKeys(ConfigReader.getProperty("product1") + Keys.ENTER);




    }


}
