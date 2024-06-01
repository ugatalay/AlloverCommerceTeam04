package team04_AlloverCommerceTestNG.tests;

import dev.failsafe.internal.util.Assert;
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import team04_AlloverCommerceTestNG.pages.P00_MainPage;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.Driver;
import team04_AlloverCommerceTestNG.utilities.ReusableMethods;

import static team04_AlloverCommerceTestNG.utilities.Driver.getDriver;

public class US08 extends ReusableMethods {

    P00_MainPage mainPage = new P00_MainPage();

    Actions actions = new Actions(getDriver());

    JavascriptExecutor jse = (JavascriptExecutor) getDriver();

    JavascriptExecutor js = (JavascriptExecutor) getDriver();




    @Test
    public void TC01_addProductToWishLIst() {


        Driver.getDriver().get(ConfigReader.getProperty("url"));
        mainPage.productPage().searchbox.click();
        mainPage.productPage().searchbox.sendKeys("MacBook", Keys.ENTER);


        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().macBookV20);

        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().macBookV20Icon);
        js.executeScript("arguments[0].click()",mainPage.productPage().macBookV20Icon);
        ReusableMethods.waitForSecond(3);




        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().macBookPro);
        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().macBookProIcon);
        js.executeScript("arguments[0].click()",mainPage.productPage().macBookProIcon);
        ReusableMethods.waitForSecond(3);



        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().wishlistIcon);
        js.executeScript("arguments[0].click()",mainPage.productPage().wishlistIcon);
        ReusableMethods.waitForSecond(3);


        Assertions.assertTrue(mainPage.productPage().wishlistIcon.isEnabled(),"Kullanıcı sectigi urunleri WishListe ekleyebildi.");

        Driver.closeDriver();

    }


    @Test
    public void TC02_productsMustBeViewable() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        mainPage.productPage().searchbox.click();
        mainPage.productPage().searchbox.sendKeys("MacBook", Keys.ENTER);



        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().macBookV20);
        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().macBookV20Icon);
        js.executeScript("arguments[0].click()",mainPage.productPage().macBookV20Icon);
        ReusableMethods.waitForSecond(3);


        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().macBookPro);
        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().macBookProIcon);
        js.executeScript("arguments[0].click()",mainPage.productPage().macBookProIcon);
        ReusableMethods.waitForSecond(3);

        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().wishlistIcon);
        js.executeScript("arguments[0].click()",mainPage.productPage().wishlistIcon);
        ReusableMethods.waitForSecond(3);


        Assertions.assertTrue(mainPage.productPage().whishListPageText.getText().contains("Wishlist"),"kullanıcı eklemis oldugu urunleri wishliste gorebildi ");

        Driver.closeDriver();
    }


    @Test
    public void TC03_viewfeaturesOftheProductsInWhistList() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        mainPage.productPage().searchbox.click();
        mainPage.productPage().searchbox.sendKeys("MacBook", Keys.ENTER);


        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().macBookV20);
        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().macBookV20Icon);
        js.executeScript("arguments[0].click()",mainPage.productPage().macBookV20Icon);
        ReusableMethods.waitForSecond(3);



        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().macBookPro);
        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().macBookProIcon);
        js.executeScript("arguments[0].click()",mainPage.productPage().macBookProIcon);
        ReusableMethods.waitForSecond(3);


        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().wishlistIcon);
        js.executeScript("arguments[0].click()",mainPage.productPage().wishlistIcon);
        ReusableMethods.waitForSecond(3);






        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().quickButton1);
        js.executeScript("arguments[0].click()",mainPage.productPage().quickButton1);
        ReusableMethods.waitForSecond(3);




        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().closeButton);
        js.executeScript("arguments[0].click()",mainPage.productPage().closeButton);
        ReusableMethods.waitForSecond(3);



        js.executeScript("arguments[0].scrollIntoView(true)",mainPage.productPage().quickButton2);
        js.executeScript("arguments[0].click()",mainPage.productPage().quickButton2);
        ReusableMethods.waitForSecond(3);


        Driver.closeDriver();

    }


    @Test
    public void TC04_addProductAndBuyIt() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        mainPage.productPage().searchbox.click();
        mainPage.productPage().signInButton.click();


        //username
        actions.moveToElement(mainPage.productPage().userName).perform();
        mainPage.productPage().userName.sendKeys("naime");

        //password
        actions.moveToElement(mainPage.productPage().password).perform();
        mainPage.productPage().password.sendKeys("naime.7895243");

        actions.moveToElement(mainPage.productPage().loginButton).perform();
        mainPage.productPage().loginButton.click();

            waitForSecond(3);



        actions.moveToElement(mainPage.productPage().searchbox).perform();
        mainPage.productPage().searchbox.click();
        mainPage.productPage().searchbox.sendKeys("MacBook", Keys.ENTER);

        waitForSecond(3);

        actions.moveToElement(mainPage.productPage().macBookPro).perform();

        actions.moveToElement(mainPage.productPage().macBookProIcon).perform();

        mainPage.productPage().macBookProIcon.click();

        waitForSecond(3);

        actions.moveToElement(mainPage.productPage().wishlistIcon).perform();
        mainPage.productPage().wishlistIcon.click();

        waitForSecond(3);

        actions.moveToElement(mainPage.productPage().quickButton2).perform();
        mainPage.productPage().quickButton2.click();

        waitForSecond(3);



        actions.moveToElement(mainPage.productPage().addCartButton).perform();
       mainPage.productPage().addCartButton.click();

        waitForSecond(3);

        actions.moveToElement(mainPage.productPage().closeButton).perform();
        mainPage.productPage().closeButton.click();



        actions.moveToElement(mainPage.productPage().cartIcon).perform();
        mainPage.productPage().cartIcon.click();

        waitForSecond(3);

        actions.moveToElement(mainPage.productPage().viewButton).perform();
        mainPage.productPage().viewButton.click();


        actions.moveToElement(mainPage.productPage().proceedCheckOut).perform();
        mainPage.productPage().proceedCheckOut.click();


        WebElement placeOrder= getDriver().findElement(By.xpath("//button[@name='woocommerce_checkout_place_order']"));
         jse.executeScript("arguments[0].scrollIntoView(true);",placeOrder);

        actions.moveToElement(mainPage.productPage().placeOrder).perform();
        mainPage.productPage().placeOrder.click();

        Assertions.assertTrue(mainPage.productPage().competeOrderText.getText().contains("Thank you. Your order has been received."));

    }




}