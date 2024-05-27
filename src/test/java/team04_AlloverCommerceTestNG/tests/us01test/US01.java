package team04_AlloverCommerceTestNG.tests.us01test;


import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import team04_AlloverCommerceTestNG.pages.P00_MainPage;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.DataProviderUtils;
import team04_AlloverCommerceTestNG.utilities.Driver;
import team04_AlloverCommerceTestNG.utilities.ReusableMethods;

import java.time.Duration;

public class US01 {
    P00_MainPage mainPage;
    Faker faker = faker = new Faker();

    @BeforeMethod
    public void setUp() {
        //Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Sağ üst köşedeki Register linkine tıkla
        mainPage = new P00_MainPage();
        mainPage.homePage().registerButton.click();
        //I agree to the privacy policy kontrol kutusunu seç

        mainPage.registerPage().checkBox.click();

    }

    @AfterMethod
    public void tearDown() {
        ReusableMethods.waitForSecond(3);
      //  Driver.getDriver().quit();
    }


    @Test
    public void tesTC01() {

        ReusableMethods.customerlogin(faker.name().username(), faker.internet().emailAddress(), faker.regexify(("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}")));
        //SIGN UP butonuna tıkla
        mainPage.registerPage().signInButton.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        //Anasayfanın açıldığını ve Sign Out linkinin göründüğünü doğrula
        Assert.assertTrue(mainPage.registerPage().SingOutLink.isDisplayed());

    }


    @Test
    public void testTC02() {
        ReusableMethods.customerlogin(faker.name().username() + "@", faker.internet().emailAddress(), faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}"));
        mainPage.registerPage().SignInBox.click();
        ReusableMethods.waitForSecond(4);

        //Anasayfanın açıldığını ve Sign Out linkinin göründüğünü doğrula
        //Assert.assertTrue(mainPage.registerPage().SingOutLink.isDisplayed());

    }




}
