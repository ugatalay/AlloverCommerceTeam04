package team04_AlloverCommerceTestNG.tests.us01test;


import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Sağ üst köşedeki Register linkine tıkla
        mainPage = new P00_MainPage();
        mainPage.homePage().registerButton.click();
        //I agree to the privacy policy kontrol kutusunu seç
        mainPage.registerPage().checkBox.click();


    }

    @AfterMethod
    public void tearDown() {
        //  Driver.closeDriver();
    }

    @Test
    public void tesTC01() {

        mainPage.registerPage().userNameBox.sendKeys(faker.name().username(), Keys.TAB, //Username alana veri gir
                faker.internet().emailAddress(), Keys.TAB,                              //Your Email address alanına bir adres  gir
                faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}"));                     //Password alanına güçlü bir şifre oluştur

        //SIGN UP butonuna tıkla
        mainPage.registerPage().SignInBox.click();
        ReusableMethods.waitForSecond(4);

        //Anasayfanın açıldığını ve Sign Out linkinin göründüğünü doğrula

        Assert.assertTrue(mainPage.registerPage().signOutLink.isDisplayed());


    }


















}


