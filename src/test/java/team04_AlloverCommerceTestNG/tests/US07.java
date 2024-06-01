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

    @Test
    public void TC01_AddFourProductsToCompareList() {



        Driver.getDriver().get(ConfigReader.getProperty("url"));
        mainPage.shoppingPage().searchbox.click();
        mainPage.shoppingPage().searchbox.sendKeys("Iphone", Keys.ENTER);

        actions.moveToElement(mainPage.shoppingPage().iphone15ProMaxIcon).perform();
        mainPage.shoppingPage().iphone15ProMaxIcon.click();


        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);



        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.shoppingPage().iphone8Icon);
        js.executeScript("arguments[0].click()",mainPage.shoppingPage().iphone8Icon);
        ReusableMethods.waitForSecond(3);

        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);




        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.shoppingPage().hiPhoneIcon);
        js.executeScript("arguments[0].click()",mainPage.shoppingPage().hiPhoneIcon);
        ReusableMethods.waitForSecond(3);

        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);



        actions.moveToElement(mainPage.shoppingPage().searchbox).perform();
        mainPage.shoppingPage().searchbox.sendKeys("Samsung Galaxy S23 ULtra", Keys.ENTER);
        actions.moveToElement(mainPage.shoppingPage().samsungGalaxyS23UltraIcon).perform();
        mainPage.shoppingPage().samsungGalaxyS23UltraIcon.click();
        ReusableMethods.waitForSecond(3);

       // js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);

        int count = Integer.parseInt(mainPage.comparePage().comparingProductCount.getText().replaceAll("\\D+", ""));
        assertTrue(count == 4, "Products count is 4.");



    }

   @Test
    public void TC02_NotAddFiveProductsToCompareListNegativeTest() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        mainPage.shoppingPage().searchbox.click();
        mainPage.shoppingPage().searchbox.sendKeys("Iphone", Keys.ENTER);


        actions.moveToElement(mainPage.shoppingPage().iphone15ProMaxIcon).perform();
        mainPage.shoppingPage().iphone15ProMaxIcon.click();
        ReusableMethods.waitForSecond(3);


        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);



       js.executeScript("arguments[0].scrollIntoView(true)",mainPage.shoppingPage().iphone8Icon);
       js.executeScript("arguments[0].click()",mainPage.shoppingPage().iphone8Icon);
       ReusableMethods.waitForSecond(3);



        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);




       js.executeScript("arguments[0].scrollIntoView(true)",mainPage.shoppingPage().hiPhoneIcon);
       js.executeScript("arguments[0].click()",mainPage.shoppingPage().hiPhoneIcon);
       ReusableMethods.waitForSecond(3);


       js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);




        actions.moveToElement(mainPage.shoppingPage().searchbox).perform();
        mainPage.shoppingPage().searchbox.sendKeys("Samsung Galaxy S23 ULtra", Keys.ENTER);
        actions.moveToElement(mainPage.shoppingPage().samsungGalaxyS23UltraIcon).perform();
        mainPage.shoppingPage().samsungGalaxyS23UltraIcon.click();
        ReusableMethods.waitForSecond(3);



        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);


        actions.moveToElement(mainPage.shoppingPage().searchbox).perform();

        mainPage.shoppingPage().searchbox.sendKeys("bag", Keys.ENTER);

       js.executeScript("arguments[0].scrollIntoView(true)",mainPage.shoppingPage().basicHandBagIcon);
       js.executeScript("arguments[0].click()",mainPage.shoppingPage().basicHandBagIcon);
       ReusableMethods.waitForSecond(3);



       int count = Integer.parseInt(mainPage.comparePage().comparingProductCount.getText().replaceAll("\\D+", ""));
       assertTrue(count == 4, "Products count is 4.");




    }


    @Test
    public void TC03_DeleteAndAddNewProducts() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        mainPage.shoppingPage().searchbox.click();
        mainPage.shoppingPage().searchbox.sendKeys("Iphone", Keys.ENTER);


        actions.moveToElement(mainPage.shoppingPage().iphone15ProMaxIcon).perform();
        mainPage.shoppingPage().iphone15ProMaxIcon.click();
        ReusableMethods.waitForSecond(3);


        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);



        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.shoppingPage().iphone8Icon);
        js.executeScript("arguments[0].click()",mainPage.shoppingPage().iphone8Icon);
        ReusableMethods.waitForSecond(3);



        //1 urun sil
        actions.moveToElement(mainPage.shoppingPage().secondProductDeleteCruz).perform();
        mainPage.shoppingPage().secondProductDeleteCruz.click();  //hiphone
        ReusableMethods.waitForSecond(3);



        int count = Integer.parseInt(mainPage.comparePage().comparingProductCount.getText().replaceAll("\\D+", ""));
        assertTrue(count == 1, "Products count is 1.");



        actions.moveToElement(mainPage.shoppingPage().searchbox).perform();

        mainPage.shoppingPage().searchbox.sendKeys("bag", Keys.ENTER);

        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.shoppingPage().basicHandBagIcon);
        js.executeScript("arguments[0].click()",mainPage.shoppingPage().basicHandBagIcon);
        ReusableMethods.waitForSecond(3);

        int count1 = Integer.parseInt(mainPage.comparePage().comparingProductCount.getText().replaceAll("\\D+", ""));
        assertTrue(count1 == 2, "Products count is 2.");



    }


    @Test
    public void TC04_compareTheProducts() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        mainPage.shoppingPage().searchbox.click();
        mainPage.shoppingPage().searchbox.sendKeys("Iphone", Keys.ENTER);


        actions.moveToElement(mainPage.shoppingPage().iphone15ProMaxIcon).perform();
        mainPage.shoppingPage().iphone15ProMaxIcon.click();

        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);


        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.shoppingPage().iphone8Icon);
        js.executeScript("arguments[0].click()",mainPage.shoppingPage().iphone8Icon);
        ReusableMethods.waitForSecond(3);

        assertTrue(mainPage.comparePage().compareField.isDisplayed(), "Karşılastırma ekranı açıldı.");





    }


    @Test
    public void TC05_deleteProductsOnTheComparescreen() {


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        mainPage.shoppingPage().searchbox.click();
        mainPage.shoppingPage().searchbox.sendKeys("Iphone", Keys.ENTER);


        actions.moveToElement(mainPage.shoppingPage().iphone15ProMaxIcon).perform();
        mainPage.shoppingPage().iphone15ProMaxIcon.click();

        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);


        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.shoppingPage().iphone8Icon);
        js.executeScript("arguments[0].click()",mainPage.shoppingPage().iphone8Icon);
        ReusableMethods.waitForSecond(3);


        js.executeScript("arguments[0].remove();",  mainPage.comparePage().comparePopup);


        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.shoppingPage().hiPhoneIcon);
        js.executeScript("arguments[0].click()",mainPage.shoppingPage().hiPhoneIcon);
        ReusableMethods.waitForSecond(3);





        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.shoppingPage().cleanAllButonu);
        js.executeScript("arguments[0].click()",mainPage.shoppingPage().cleanAllButonu);
        ReusableMethods.waitForSecond(3);





        int count1 = Integer.parseInt(mainPage.comparePage().comparingProductCount.getText().replaceAll("\\D+", ""));
        assertTrue(count1 == 0, "Products count is 0.");





    }


    @AfterMethod
    public void tearDown() { Driver.closeDriver();

    }
}


