package team04_AlloverCommerceTestNG.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;
import team04_AlloverCommerceTestNG.pages.P00_MainPage;
import team04_AlloverCommerceTestNG.pages.P07_ShoppingPage;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.Driver;
import team04_AlloverCommerceTestNG.utilities.ReusableMethods;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static team04_AlloverCommerceTestNG.utilities.Driver.getDriver;

public class US07  {

    P00_MainPage mainPage = new P00_MainPage();
    JavascriptExecutor js = (JavascriptExecutor) getDriver();
    Actions actions = new Actions(getDriver());


    @BeforeClass
    public void beforeClass() {

        WebDriver driver = Driver.getDriver();
        driver = Driver.getDriver();
        driver.navigate().back();


    }

   /* @Test
    public void TC01_AddFourProductsToCompareList() {



        Driver.getDriver().get(ConfigReader.getProperty("url"));
        mainPage.shoppingPage().searchbox.click();
        mainPage.shoppingPage().searchbox.sendKeys("Iphone", Keys.ENTER);

        actions.moveToElement(mainPage.shoppingPage().iphone15ProMaxIcon).perform();
        mainPage.shoppingPage().iphone15ProMaxIcon.click();

        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);

       // js.executeScript("arguments[0].style.display = 'none';", comparePopup);

        actions.moveToElement(mainPage.shoppingPage().iphone8Icon).perform();
        mainPage.shoppingPage().iphone8Icon.click();
        ReusableMethods.waitForSecond(3);

        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);

        actions.moveToElement(mainPage.shoppingPage().hiPhoneIcon).perform();
        mainPage.shoppingPage().hiPhoneIcon.click();
        ReusableMethods.waitForSecond(3);

        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);

        actions.moveToElement(mainPage.shoppingPage().searchbox).perform();
        mainPage.shoppingPage().searchbox.sendKeys("Samsung Galaxy S23 ULtra", Keys.ENTER);
        actions.moveToElement(mainPage.shoppingPage().samsungGalaxyS23UltraIcon).perform();
        mainPage.shoppingPage().samsungGalaxyS23UltraIcon.click();
        ReusableMethods.waitForSecond(3);
        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);


         // int count = Integer.parseInt(mainPage.comparePage()comparingProductCount.getText().replaceAll("D+", ""));
         // assertTrue(count == 4, "Products count is  4.");

           Driver.closeDriver();

    }

   @Test
    public void TC02_AddFiveProductsToCompareList() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        mainPage.shoppingPage().searchbox.click();
        mainPage.shoppingPage().searchbox.sendKeys("Iphone", Keys.ENTER);


        actions.moveToElement(mainPage.shoppingPage().iphone15ProMaxIcon).perform();
        mainPage.shoppingPage().iphone15ProMaxIcon.click();

        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);

        // js.executeScript("arguments[0].style.display = 'none';", comparePopup);

        actions.moveToElement(mainPage.shoppingPage().iphone8Icon).perform();
        mainPage.shoppingPage().iphone8Icon.click();
        waitForSecond(3);

        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);

        actions.moveToElement(mainPage.shoppingPage().hiPhoneIcon).perform();
        mainPage.shoppingPage().hiPhoneIcon.click();
        waitForSecond(3);

        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);

        actions.moveToElement(mainPage.shoppingPage().searchbox).perform();
        mainPage.shoppingPage().searchbox.sendKeys("Samsung Galaxy S23 ULtra", Keys.ENTER);
        actions.moveToElement(mainPage.shoppingPage().samsungGalaxyS23UltraIcon).perform();
        mainPage.shoppingPage().samsungGalaxyS23UltraIcon.click();
        waitForSecond(3);

        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);


        actions.moveToElement(mainPage.shoppingPage().searchbox).perform();
        mainPage.shoppingPage().searchbox.sendKeys("bag", Keys.ENTER);
        mainPage.shoppingPage().basicHandBag.click();


          int count = Integer.parseInt(mainPage.comparePage().comparingProductCount.getText().replaceAll("D+", ""));
          assertTrue(count == 4, "Products count is  4.");

        Driver.closeDriver();


    }


    @Test
    public void TC03_DeleteAndAddNewProducts() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        mainPage.shoppingPage().searchbox.click();
        mainPage.shoppingPage().searchbox.sendKeys("Iphone", Keys.ENTER);


        actions.moveToElement(mainPage.shoppingPage().iphone15ProMaxIcon).perform();
        mainPage.shoppingPage().iphone15ProMaxIcon.click();

        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);

        // js.executeScript("arguments[0].style.display = 'none';", comparePopup);

        actions.moveToElement(mainPage.shoppingPage().iphone8Icon).perform();
        mainPage.shoppingPage().iphone8Icon.click();
        waitForSecond(3);

//1 urun sil
        actions.moveToElement(mainPage.shoppingPage().secondProductDeleteCruz).perform();
       mainPage.shoppingPage().secondProductDeleteCruz.click();  //ipone8
        ReusableMethods.waitForSecond(3);

        //bir urun sildigini dogrula

     //   actions.clickAndHold(scrollBarInComparePopup).moveByOffset(100, 0).perform();


        // TEKRAR URUN EKLE
        Bag();
        waitForSecond(3);

        //SECILEN YENI URUNUN EKLENEBILDIGINI DOGRULA
       //  int count = Integer.parseInt(comparingProductCount.getText().replaceAll("D+", ""));

        Driver.closeDriver();
    }


    @Test
    public void TC04_compareTheProducts() {

        ReusableMethods.textlereGiris();

       IphoneProMax15();
        waitForSecond(3);

        Iphone8();
        waitForSecond(3);


        compareButonu();
        waitForSecond(3);

        // SECTIGIN URUNLERIN KARSILASTIGINI DOGRULA

        // assertTrue(compare.isDisplayed()
        Driver.closeDriver();
    }*/


    @Test
    public void TC05_deleteProductsOnTheComparescreen() {


        ReusableMethods.textlereGiris();


        ReusableMethods.IphoneProMax15();
        ReusableMethods.waitForSecond(3);

        ReusableMethods.Iphone8();
        ReusableMethods.waitForSecond(3);

        ReusableMethods.hiPhone();
        ReusableMethods.waitForSecond(3);


        ReusableMethods.cleanAllButon();

        ReusableMethods.waitForSecond(3);


        ReusableMethods.compareButonu();

        //  Assert.assertTrue(P00_MainPage.shoppingPage()..isDisplayed());

        Driver.closeDriver();


    }


}


