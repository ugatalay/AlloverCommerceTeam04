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

public class US07 extends ReusableMethods {

    P00_MainPage mainPage = new P00_MainPage();
    JavascriptExecutor js = (JavascriptExecutor) getDriver();
    Actions actions = new Actions(getDriver());




    @Test
    public void TC01_AddFourProductsToCompareList() {

      //  textlereGiris();

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        mainPage.shoppingPage().searchbox.click();
        mainPage.shoppingPage().searchbox.sendKeys("Iphone", Keys.ENTER);


        WebDriver driver = Driver.getDriver();
        driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        actions.moveToElement(mainPage.shoppingPage().iphone15ProMaxIcon).perform();
        mainPage.shoppingPage().iphone15ProMaxIcon.click();


       // js.executeScript("arguments[0].style.display = 'none';", comparePopup);

       // IphoneProMax15();
      //  waitForSecond(3);

        Iphone8();
        waitForSecond(3);


        hiPhone();
        waitForSecond(3);


        samsung();
        waitForSecond(3);

        //  int count = Integer.parseInt(comparingProductCount.getText().replaceAll("D+", ""));
       //   assertTrue(count == 4, "Products count is  4.");

        Driver.closeDriver();

    }

    @Test
    public void TC02_AddFiveProductsToCompareList() {

        textlereGiris();

        IphoneProMax15();
        waitForSecond(3);

        Iphone8();
        ReusableMethods.waitForSecond(3);

        hiPhone();
        waitForSecond(3);

        samsung();
        waitForSecond(3);


        WebDriver driver = Driver.getDriver();
        driver = Driver.getDriver();
        driver.navigate().back();

        mainPage.shoppingPage().searchbox.clear();

        Bag();
        waitForSecond(3);

        //  int count = Integer.parseInt(comparingProductCount.getText().replaceAll("D+", ""));
        //  assertTrue(count == 4, "Products count is  4.");

        Driver.closeDriver();


    }


    @Test
    public void TC03_DeleteAndAddNewProducts() {

        textlereGiris();

        IphoneProMax15();
        waitForSecond(3);

        Iphone8();
        waitForSecond(3);

//1 urun sil
        actions.moveToElement(mainPage.shoppingPage().secondProductDeleteCruz).perform();
       mainPage.shoppingPage().secondProductDeleteCruz.click();  //ipone8
        ReusableMethods.waitForSecond(3);

        //bir urun sildigini dogrula


        //actions.clickAndHold(scrollBarInComparePopup).moveByOffset(100, 0).perform();


        // TEKRAR URUN EKLE
        Bag();
        waitForSecond(3);

        //SECILEN YENI URUNUN EKLENEBILDIGINI DOGRULA
       //  int count = Integer.parseInt(comparingProductCount.getText().replaceAll("D+", ""));

        Driver.closeDriver();
    }


    @Test
    public void TC04_compareTheProducts() {

        textlereGiris();

        IphoneProMax15();
        waitForSecond(3);

        Iphone8();
        waitForSecond(3);


        compareButonu();
        waitForSecond(3);

        // SECTIGIN URUNLERIN KARSILASTIGINI DOGRULA

        // assertTrue(compare.isDisplayed()
        Driver.closeDriver();
    }


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


