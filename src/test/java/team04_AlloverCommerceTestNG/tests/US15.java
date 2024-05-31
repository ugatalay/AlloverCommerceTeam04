package team04_AlloverCommerceTestNG.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import team04_AlloverCommerceTestNG.pages.P00_MainPage;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.Driver;
import team04_AlloverCommerceTestNG.utilities.ReusableMethods;

public class US15 {
    @Test
    public void US15_TC01() throws InterruptedException {

        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));


        mainPage.homePage().signIn.click();
        mainPage.userVendorLoginPage().usernameBox.click();
        mainPage.userVendorLoginPage().usernameBox.sendKeys(ConfigReader.getProperty("username1"));
        mainPage.userVendorLoginPage().passwordBox.sendKeys(ConfigReader.getProperty("userpassword1"));
        mainPage.userVendorLoginPage().signInButton.click();
        ReusableMethods.waitForSecond(2);
        mainPage.homePage().myAccount.click();
        ReusableMethods.waitForSecond(2);


        WebDriver driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        WebElement storeManagerLink = driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/store-manager/']"));
        actions.moveToElement(storeManagerLink).click().perform();
        ReusableMethods.waitForSecond(2);

        WebElement productsLink = driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/store-manager/products/']"));
        actions.moveToElement(productsLink).click().perform();
        ReusableMethods.waitForSecond(2);

        WebElement addNewProductLink = driver.findElement(By.id("add_new_product_dashboard"));
        actions.moveToElement(addNewProductLink).click().perform();
        ReusableMethods.waitForSecond(2);

        WebElement inventory = driver.findElement(By.id("wcfm_products_manage_form_inventory_head"));

        ReusableMethods.scroll(inventory);

    }

    @Test
    public void US15_TC02() throws InterruptedException {


        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));


        mainPage.homePage().signIn.click();
        mainPage.userVendorLoginPage().usernameBox.click();
        mainPage.userVendorLoginPage().usernameBox.sendKeys(ConfigReader.getProperty("username1"));
        mainPage.userVendorLoginPage().passwordBox.sendKeys(ConfigReader.getProperty("userpassword1"));
        mainPage.userVendorLoginPage().signInButton.click();
        ReusableMethods.waitForSecond(2);
        mainPage.homePage().myAccount.click();
        ReusableMethods.waitForSecond(2);


        WebDriver driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        WebElement storeManagerLink = driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/store-manager/']"));
        actions.moveToElement(storeManagerLink).click().perform();
        ReusableMethods.waitForSecond(2);

        WebElement productsLink = driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/store-manager/products/']"));
        actions.moveToElement(productsLink).click().perform();
        ReusableMethods.waitForSecond(2);

        WebElement addNewProductLink = driver.findElement(By.id("add_new_product_dashboard"));
        actions.moveToElement(addNewProductLink).click().perform();
        ReusableMethods.waitForSecond(2);

        WebElement inventory = driver.findElement(By.id("wcfm_products_manage_form_inventory_head"));

        ReusableMethods.scroll(inventory);
        ReusableMethods.waitForSecond(2);

        WebElement skuInput = driver.findElement(By.id("sku"));
        actions.moveToElement(skuInput).click().perform();
        actions.moveToElement(skuInput).sendKeys("sdfcj").perform();
        ReusableMethods.waitForSecond(1);

        WebElement manageStock = driver.findElement(By.id("manage_stock"));
        actions.moveToElement(manageStock).click().perform();

        WebElement backOrders = driver.findElement(By.id("backorders"));
        actions.moveToElement(backOrders).click().perform();
        actions.moveToElement(backOrders).sendKeys("Allow").perform();

        WebElement soldindividually = driver.findElement(By.id("sold_individually"));
        actions.moveToElement(soldindividually).click().perform();

    }

    @Test
    public void US15_TC03() throws InterruptedException {

        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));



    }

    @Test
    public void US15_TC04() throws InterruptedException {

        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));





    }

    @Test
    public void US15_TC05() throws InterruptedException {


        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));




    }
}
