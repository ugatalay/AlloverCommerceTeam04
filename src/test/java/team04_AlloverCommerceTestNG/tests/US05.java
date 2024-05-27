package team04_AlloverCommerceTestNG.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import team04_AlloverCommerceTestNG.pages.P00_MainPage;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.Driver;
import team04_AlloverCommerceTestNG.utilities.ReusableMethods;
import org.testng.annotations.Test;
import team04_AlloverCommerceTestNG.pages.*;
import team04_AlloverCommerceTestNG.utilities.*;

public class US05 {

    @Test
    public void US05_TC01() throws InterruptedException {

        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));


        mainPage.homePage().signIn.click();
        mainPage.userVendorLoginPage().usernameBox.click();
        mainPage.userVendorLoginPage().usernameBox.sendKeys(ConfigReader.getProperty("username1"));
        mainPage.userVendorLoginPage().passwordBox.sendKeys(ConfigReader.getProperty("userpassword1"));
        mainPage.userVendorLoginPage().signInButton.click();
        ReusableMethods.waitForSecond(3);
        mainPage.homePage().myAccount.click();
        ReusableMethods.waitForSecond(5);


        WebDriver driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        WebElement accountDetailsLink = driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/my-account-2/edit-account/']"));
        actions.moveToElement(accountDetailsLink).click().perform();



    }

    @Test
    public void US05_TC02() throws InterruptedException {


        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));



        mainPage.homePage().signIn.click();
        mainPage.userVendorLoginPage().usernameBox.click();
        mainPage.userVendorLoginPage().usernameBox.sendKeys(ConfigReader.getProperty("username1"));
        mainPage.userVendorLoginPage().passwordBox.sendKeys(ConfigReader.getProperty("userpassword1"));
        mainPage.userVendorLoginPage().signInButton.click();
        ReusableMethods.waitForSecond(3);
        mainPage.homePage().myAccount.click();
        ReusableMethods.waitForSecond(5);


        WebDriver driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        WebElement accountDetailsLink = driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/my-account-2/edit-account/']"));
        actions.moveToElement(accountDetailsLink).click().perform();
        ReusableMethods.waitForSecond(5);


        mainPage.accountDetails().firstName.clear();
        mainPage.accountDetails().firstName.sendKeys(ConfigReader.getProperty("firstName1"));
        mainPage.accountDetails().lastName.clear();
        mainPage.accountDetails().lastName.sendKeys(ConfigReader.getProperty("lastName1"));
        mainPage.accountDetails().displayName.clear();
        mainPage.accountDetails().displayName.sendKeys(ConfigReader.getProperty("displayName1"));
        mainPage.accountDetails().email.clear();
        mainPage.accountDetails().email.sendKeys(ConfigReader.getProperty("email1"));

        WebElement saveChange = driver.findElement(By.xpath("//button[.='Save changes']"));
        actions.moveToElement(saveChange).click().perform();


    }

    @Test
    public void US05_TC03() throws InterruptedException {


        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));



        mainPage.homePage().signIn.click();
        mainPage.userVendorLoginPage().usernameBox.click();
        mainPage.userVendorLoginPage().usernameBox.sendKeys(ConfigReader.getProperty("username1"));
        mainPage.userVendorLoginPage().passwordBox.sendKeys(ConfigReader.getProperty("userpassword1"));
        mainPage.userVendorLoginPage().signInButton.click();
        ReusableMethods.waitForSecond(3);
        mainPage.homePage().myAccount.click();
        ReusableMethods.waitForSecond(5);

        WebDriver driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        WebElement accountDetailsLink = driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/my-account-2/edit-account/']"));
        actions.moveToElement(accountDetailsLink).click().perform();
        ReusableMethods.waitForSecond(5);

        mainPage.accountDetails().firstName.clear();

        mainPage.accountDetails().lastName.clear();

        mainPage.accountDetails().displayName.clear();

        mainPage.accountDetails().email.clear();


        WebElement saveChange = driver.findElement(By.xpath("//button[.='Save changes']"));
        actions.moveToElement(saveChange).click().perform();


    }

    @Test
    public void US05_TC04() throws InterruptedException {


        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));



        mainPage.homePage().signIn.click();
        mainPage.userVendorLoginPage().usernameBox.click();
        mainPage.userVendorLoginPage().usernameBox.sendKeys(ConfigReader.getProperty("username1"));
        mainPage.userVendorLoginPage().passwordBox.sendKeys(ConfigReader.getProperty("userpassword1"));
        mainPage.userVendorLoginPage().signInButton.click();
        ReusableMethods.waitForSecond(3);
        mainPage.homePage().myAccount.click();
        ReusableMethods.waitForSecond(5);

        WebDriver driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        WebElement accountDetailsLink = driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/my-account-2/edit-account/']"));
        actions.moveToElement(accountDetailsLink).click().perform();
        ReusableMethods.waitForSecond(5);

        driver.switchTo().frame("user_description_ifr");
        WebElement biography = driver.findElement(By.xpath("//p"));
        biography.sendKeys("Bu textbox iFrame içinde yer almaktadır");
        driver.switchTo().defaultContent();

        ReusableMethods.waitForSecond(5);
        WebElement saveChange = driver.findElement(By.xpath("//button[.='Save changes']"));
        actions.moveToElement(saveChange).click().perform();




    }

}
