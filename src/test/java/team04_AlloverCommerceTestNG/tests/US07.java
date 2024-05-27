package team04_AlloverCommerceTestNG.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import team04_AlloverCommerceTestNG.pages.P00_MainPage;
import team04_AlloverCommerceTestNG.pages.P07_ShoppingPage;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.Driver;
import team04_AlloverCommerceTestNG.utilities.ReusableMethods;

public class US07  {

    P00_MainPage P00_MainPage = new P00_MainPage();


    @Test
    public void TC01() {


        Driver.getDriver().get(ConfigReader.getProperty("url"));

        P00_MainPage.shoppingPage().searchbox.click();
        P00_MainPage.shoppingPage().searchbox.sendKeys("Iphone", Keys.ENTER);


       WebDriver driver = Driver.getDriver();
        driver = Driver.getDriver();
        Actions actions = new Actions(driver);



        actions.moveToElement(P00_MainPage.shoppingPage().iphone15ProMaxIcon).perform();
        P00_MainPage.shoppingPage().iphone15ProMaxIcon.click();



        ReusableMethods.waitForSecond(3);


        actions.moveToElement(P00_MainPage.shoppingPage().iphone8Icon).perform();
        P00_MainPage.shoppingPage().iphone8Icon.click();


        ReusableMethods.waitForSecond(3);

        actions.moveToElement(P00_MainPage.shoppingPage().hiPhoneIcon).perform();
        P00_MainPage.shoppingPage().hiPhoneIcon.click();


        ReusableMethods.waitForSecond(3);


        actions.moveToElement(P00_MainPage.shoppingPage().searchbox).perform();
        P00_MainPage.shoppingPage().searchbox.click();
        P00_MainPage.shoppingPage().searchbox.sendKeys("Samsung Galaxy S23 ULtra", Keys.ENTER);
        actions.moveToElement(P00_MainPage.shoppingPage().samsungGalaxyS23UltraIcon).perform();
        P00_MainPage.shoppingPage().samsungGalaxyS23UltraIcon.click();


        ReusableMethods.waitForSecond(3);


        Assert.assertTrue(P00_MainPage.shoppingPage().CompareProductPanel.isDisplayed());


        Driver.closeDriver();


       }


    @Test
    public void TC02() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        P00_MainPage.shoppingPage().searchbox.click();
        P00_MainPage.shoppingPage().searchbox.sendKeys("Iphone", Keys.ENTER);


        WebDriver driver = Driver.getDriver();
        driver = Driver.getDriver();
        Actions actions = new Actions(driver);



        actions.moveToElement(P00_MainPage.shoppingPage().iphone15ProMaxIcon).perform();
        P00_MainPage.shoppingPage().iphone15ProMaxIcon.click();



        ReusableMethods.waitForSecond(3);


        actions.moveToElement(P00_MainPage.shoppingPage().iphone8Icon).perform();
        P00_MainPage.shoppingPage().iphone8Icon.click();


        ReusableMethods.waitForSecond(3);

        actions.moveToElement(P00_MainPage.shoppingPage().hiPhoneIcon).perform();
        P00_MainPage.shoppingPage().hiPhoneIcon.click();


        ReusableMethods.waitForSecond(3);


        actions.moveToElement(P00_MainPage.shoppingPage().searchbox).perform();
        P00_MainPage.shoppingPage().searchbox.click();
        P00_MainPage.shoppingPage().searchbox.sendKeys("Samsung Galaxy S23 ULtra", Keys.ENTER);
        actions.moveToElement(P00_MainPage.shoppingPage().samsungGalaxyS23UltraIcon).perform();
        P00_MainPage.shoppingPage().samsungGalaxyS23UltraIcon.click();


        ReusableMethods.waitForSecond(3);

        actions.moveToElement(P00_MainPage.shoppingPage().searchbox).perform();
        P00_MainPage.shoppingPage().searchbox.click();
        P00_MainPage.shoppingPage().searchbox.sendKeys("bag", Keys.ENTER);

        WebElement basicCoachBag = driver.findElement(By.xpath("//a[@class='compare btn-product-icon'])[5]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",basicCoachBag);

        ReusableMethods.waitForSecond(3);

        actions.moveToElement(P00_MainPage.shoppingPage().basicCoachBag).perform();

        P00_MainPage.shoppingPage().basicCoachBag.click();

        ReusableMethods.waitForSecond(3);


        Assert.assertTrue(P00_MainPage.shoppingPage().CompareProductPanel.isDisplayed());

        Driver.closeDriver();


    }


    @Test
    public void TC03() {


        Driver.getDriver().get(ConfigReader.getProperty("url"));

        P00_MainPage.shoppingPage().searchbox.click();
        P00_MainPage.shoppingPage().searchbox.sendKeys("Iphone", Keys.ENTER);


        WebDriver driver = Driver.getDriver();
        driver = Driver.getDriver();
        Actions actions = new Actions(driver);


// 1. urun
        actions.moveToElement(P00_MainPage.shoppingPage().iphone15ProMaxIcon).perform();
        P00_MainPage.shoppingPage().iphone15ProMaxIcon.click();



        ReusableMethods.waitForSecond(3);

//2. urun
        actions.moveToElement(P00_MainPage.shoppingPage().iphone8Icon).perform();
        P00_MainPage.shoppingPage().iphone8Icon.click();


        ReusableMethods.waitForSecond(3);

// compare Product paneline git

        actions.moveToElement(P00_MainPage.shoppingPage().comparePanel).perform();
        P00_MainPage.shoppingPage().comparePanel.click();

        ReusableMethods.waitForSecond(3);

 //  eklenmis 1 urunu sil
        actions.moveToElement(P00_MainPage.shoppingPage().secondProductDeleteCruz).perform();
        P00_MainPage.shoppingPage().secondProductDeleteCruz.click();


        ReusableMethods.waitForSecond(3);

        // urunlerin nasil silindigini dogrula?


        //urun arat
        actions.moveToElement(P00_MainPage.shoppingPage().searchbox).perform();
        P00_MainPage.shoppingPage().searchbox.sendKeys("bag", Keys.ENTER);

        actions.moveToElement(P00_MainPage.shoppingPage().basicCoachBag).perform();

        P00_MainPage.shoppingPage().basicCoachBag.click();

        //secilen urunun eklenebildigini dogrula?

        Assert.assertTrue(P00_MainPage.shoppingPage().CompareProductPanel.isDisplayed());



        Driver.closeDriver();

    }




}


