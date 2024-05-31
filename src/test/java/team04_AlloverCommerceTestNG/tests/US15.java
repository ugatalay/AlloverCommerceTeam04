package team04_AlloverCommerceTestNG.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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


        WebElement shipping = driver.findElement(By.id("wcfm_products_manage_form_shipping_head"));
        actions.moveToElement(shipping).click().perform();
        ReusableMethods.scroll(shipping);
        ReusableMethods.waitForSecond(2);

        WebElement weight = driver.findElement(By.id("weight"));
        actions.moveToElement(weight).click().perform();
        actions.moveToElement(weight).sendKeys("120").perform();
        ReusableMethods.waitForSecond(1);


        WebElement dimensions = driver.findElement(By.id("length"));
        actions.moveToElement(dimensions).click().perform();
        actions.moveToElement(dimensions).sendKeys("1.50").perform();
        ReusableMethods.waitForSecond(1);


        WebElement dimensions1 = driver.findElement(By.id("width"));
        actions.moveToElement(dimensions1).click().perform();
        actions.moveToElement(dimensions1).sendKeys("25.0").perform();
        ReusableMethods.waitForSecond(1);

        WebElement dimensions2 = driver.findElement(By.id("height"));
        actions.moveToElement(dimensions2).click().perform();
        actions.moveToElement(dimensions2).sendKeys("2.20").perform();
        ReusableMethods.waitForSecond(1);


        WebElement shippingclass = driver.findElement(By.id("shipping_class"));
        actions.moveToElement(shippingclass).click().perform();
        ReusableMethods.waitForSecond(1);


        WebElement processingtime = driver.findElement(By.id("_wcfmmp_processing_time"));
        actions.moveToElement(processingtime).click().perform();
        actions.moveToElement(dimensions2).sendKeys("1-3 business days").perform();
        ReusableMethods.waitForSecond(1);
    }

    @Test
    public void US15_TC04() throws InterruptedException {

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


        WebElement shipping = driver.findElement(By.id("wcfm_products_manage_form_shipping_head"));

        actions.moveToElement(shipping).click().perform();

        ReusableMethods.scroll(shipping);
        ReusableMethods.waitForSecond(2);

        WebElement weight = driver.findElement(By.id("weight"));
        actions.moveToElement(weight).click().perform();
        actions.moveToElement(weight).sendKeys("abc").perform();
        ReusableMethods.waitForSecond(5);


        WebElement dimensions = driver.findElement(By.id("length"));
        actions.moveToElement(dimensions).click().perform();
        actions.moveToElement(dimensions).sendKeys("1.50").perform();
        ReusableMethods.waitForSecond(5);


        WebElement dimensions1 = driver.findElement(By.id("width"));
        actions.moveToElement(dimensions1).click().perform();
        actions.moveToElement(dimensions1).sendKeys("25.0").perform();
        ReusableMethods.waitForSecond(5);

        WebElement dimensions2 = driver.findElement(By.id("height"));
        actions.moveToElement(dimensions2).click().perform();
        actions.moveToElement(dimensions2).sendKeys("2.20").perform();
        ReusableMethods.waitForSecond(5);


        WebElement shippingclass = driver.findElement(By.id("shipping_class"));
        actions.moveToElement(shippingclass).click().perform();
        ReusableMethods.waitForSecond(5);


        WebElement processingtime = driver.findElement(By.id("_wcfmmp_processing_time"));
        actions.moveToElement(processingtime).click().perform();
        actions.moveToElement(dimensions2).sendKeys("1-3 business days").perform();
        ReusableMethods.waitForSecond(5);


    }

    @Test
    public void US15_TC05() throws InterruptedException {


        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        mainPage.homePage().signIn.click();
        mainPage.userVendorLoginPage().usernameBox.click();
        mainPage.userVendorLoginPage().usernameBox.sendKeys(ConfigReader.getProperty("username1"));
        mainPage.userVendorLoginPage().passwordBox.sendKeys(ConfigReader.getProperty("userpassword1"));
        mainPage.userVendorLoginPage().signInButton.click();
        ReusableMethods.waitForSecond(1);
        mainPage.homePage().myAccount.click();
        ReusableMethods.waitForSecond(1);


        WebDriver driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        WebElement storeManagerLink = driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/store-manager/']"));
        actions.moveToElement(storeManagerLink).click().perform();
        ReusableMethods.waitForSecond(1);

        WebElement productsLink = driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/store-manager/products/']"));
        actions.moveToElement(productsLink).click().perform();
        ReusableMethods.waitForSecond(1);

        WebElement addNewProductLink = driver.findElement(By.id("add_new_product_dashboard"));
        actions.moveToElement(addNewProductLink).click().perform();
        ReusableMethods.waitForSecond(1);

        WebElement attributes = driver.findElement(By.id("wcfm_products_manage_form_attribute_head"));
        actions.moveToElement(attributes).click().perform();
        ReusableMethods.waitForSecond(1);

        WebElement color = driver.findElement(By.id("attributes_is_active_1"));
        actions.moveToElement(color).click().perform();




        WebElement colorDdm = driver.findElement(By.id("attributes_value_1"));
        actions.moveToElement(colorDdm).click().perform();
        //actions.moveToElement(colorDdm).sendKeys("aa").perform();

        ReusableMethods.ddmIndex(colorDdm,15);


        WebElement size = driver.findElement(By.id("attributes_is_active_2"));
        actions.moveToElement(size).click().perform();
        ReusableMethods.waitForSecond(3);

        WebElement sizeDdm = driver.findElement(By.id("attributes_value_2"));
        actions.moveToElement(sizeDdm).click().perform();


        ReusableMethods.ddmIndex(sizeDdm,15);

    }
}
