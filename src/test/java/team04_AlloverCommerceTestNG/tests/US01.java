package team04_AlloverCommerceTestNG.tests;
import com.github.javafaker.Faker;
import org.openqa.selenium.NoSuchElementException;
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
    P00_MainPage mainPage = new P00_MainPage();
    Faker faker = new Faker();

    @BeforeMethod
    public void setUp() {
        // Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        // Sağ üst köşedeki Register linkine tıkla
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(mainPage.homePage().registerButton)).click();
        // I agree to the privacy policy kontrol kutusunu seç
        wait.until(ExpectedConditions.elementToBeClickable(mainPage.registerPage().checkBox)).click();
    }

    @AfterMethod
    public void tearDown() {
        ReusableMethods.waitForSecond(3);
        //Driver.closeDriver(); // Tarayıcıyı tamamen kapatır
    }

    @Test
    public void loginPozitifTest() {
        // Kullanıcı bilgilerini gir
        ReusableMethods.customerlogin(faker.name().username(), faker.internet().emailAddress(), faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}"));
        // SIGN UP butonuna tıkla
        mainPage.registerPage().signUpButton.click();

        // Anasayfanın açıldığını ve Sign Out linkinin göründüğünü doğrula
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(mainPage.registerPage().singOutLink));
        Assert.assertTrue(mainPage.registerPage().singOutLink.isDisplayed(), "Sing up linki  goruntulenmedi");

        //mainPage.myAccountPage().logoutButton.click();
        ReusableMethods.click(mainPage.registerPage().singOutLink);
        ReusableMethods.click(mainPage.myAccountPage().logoutButton);
    }

    @Test(dataProvider = "UserNameDataPositiveTest", dataProviderClass = DataProviderUtils.class)
    public void userNamePositiveTest(String username, String email, String password) {
        // Kullanıcı bilgilerini gir
        mainPage.registerPage().userNameBox.sendKeys(username);
        mainPage.registerPage().yourEmailBox.sendKeys(email);
        mainPage.registerPage().passWordBox.sendKeys(password);

        // SIGN UP butonuna tıkla
        // mainPage.registerPage().signUpButton.click();
        ReusableMethods.click(mainPage.registerPage().signUpButton);//*
        // Anasayfanın açıldığını ve Sign Out linkinin göründüğünü doğrula
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(mainPage.registerPage().singOutLink));
        ReusableMethods.click(mainPage.registerPage().singOutLink);
        Assert.assertTrue(mainPage.registerPage().singOutLink.isDisplayed(), "Sing up linki  goruntulenmedi");
        ReusableMethods.click(mainPage.myAccountPage().logoutButton);
    }

    @Test(dataProvider = "UserNameDataNegativeTest", dataProviderClass = DataProviderUtils.class)

    public void userNameNegativeTest(String username, String email, String password) {
        // Kullanıcı bilgilerini gir
        mainPage.registerPage().userNameBox.sendKeys(username);
        mainPage.registerPage().yourEmailBox.sendKeys(email);
        mainPage.registerPage().passWordBox.sendKeys(password);
        // SIGN UP butonuna tıkla
        // mainPage.registerPage().signUpButton.click();
        ReusableMethods.click(mainPage.registerPage().signUpButton);//*
        // Hatalı giriş sonrası SIGN UP butonunun göründüğünü doğrula
        ReusableMethods.waitForSecond(5);
        Assert.assertTrue(mainPage.registerPage().signUpButton.isDisplayed(), "SING IN butonu  goruntulenmedi");

    }

    @Test(dataProvider = "AcceptEmailData", dataProviderClass = DataProviderUtils.class)

    public void AcceptEmailTest(String username, String email, String password) {

        // Kullanıcı bilgilerini gir
        mainPage.registerPage().userNameBox.sendKeys(username);
        mainPage.registerPage().yourEmailBox.sendKeys(email);
        mainPage.registerPage().passWordBox.sendKeys(password);

        // SIGN UP butonuna tıkla
        // mainPage.registerPage().signUpButton.click();
        ReusableMethods.click(mainPage.registerPage().signUpButton);//*
        // Anasayfanın açıldığını ve Sign Out linkinin göründüğünü doğrula

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(mainPage.registerPage().singOutLink));
        ReusableMethods.click(mainPage.registerPage().singOutLink);
        Assert.assertTrue(mainPage.registerPage().singOutLink.isDisplayed(), "Sing up linki  goruntulenmedi");
        ReusableMethods.click(mainPage.myAccountPage().logoutButton);
    }


    @Test(dataProvider = "InAcceptEmailData", dataProviderClass = DataProviderUtils.class)

    public void InAcceptEmailTest(String username, String email, String password) {

        // Kullanıcı bilgilerini gir
        mainPage.registerPage().userNameBox.sendKeys(username);
        mainPage.registerPage().yourEmailBox.sendKeys(email);
        mainPage.registerPage().passWordBox.sendKeys(password);

        // SIGN UP butonuna tıkla
        // mainPage.registerPage().signUpButton.click();
        ReusableMethods.click(mainPage.registerPage().signUpButton);

        // Anasayfanın açıldığını ve Sign Out linkinin göründüğünü doğrula
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(25));
// Hatalı giriş sonrası SIGN UP butonunun göründüğünü doğrula
        ReusableMethods.waitForSecond(5);
        Assert.assertTrue(mainPage.registerPage().signUpButton.isDisplayed(), "SING IN butonu  goruntulenmedi");

    }


    @Test
    public void paswordKontroltest() {

        //Web sitesine git
        //Sağ üst koşedeki Register linkine tıkla
        //Username alanına bir veri gir
        //Your Email address alanını bir adres gir
        //Password alanına 8 karakterden olusan bir sifre gir
        ReusableMethods.customerlogin(faker.name().username(), faker.internet().emailAddress(), "Test123?");
        //SIGN UP butonuna tıkla
        ReusableMethods.click(mainPage.registerPage().signUpButton);
        // Anasayfanın açıldığını ve Sign Out linkinin göründüğünü doğrula
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(mainPage.registerPage().singOutLink));
        //Kayıt işlemi gerçeklesdigini doğrula
        Assert.assertTrue(mainPage.registerPage().singOutLink.isDisplayed(), "Sing Up linki  goruntulenmedi");
        //I agree to the privacy policy kontrol kutusunu seç
        //mainPage.myAccountPage().logoutButton.click();
        ReusableMethods.click(mainPage.registerPage().singOutLink);
        ReusableMethods.click(mainPage.myAccountPage().logoutButton);

    }

    @Test(dataProvider = "PassWordNegativeData", dataProviderClass = DataProviderUtils.class)

    public void passWordNegativeTest(String username, String email, String password) {
        // Kullanıcı bilgilerini gir
        mainPage.registerPage().userNameBox.sendKeys(username);
        mainPage.registerPage().yourEmailBox.sendKeys(email);
        mainPage.registerPage().passWordBox.sendKeys(password);

        // SIGN UP butonuna tıkla
        // mainPage.registerPage().signUpButton.click();
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
            wait.until(ExpectedConditions.visibilityOf(mainPage.registerPage().signUpButton));
        } catch (NoSuchElementException e) {
            // Eleman bulunamazsa hata ile ilgilen
            System.out.println("Eleman bulunamadı: " + e.getMessage());
        }

        // Ana sayfa acilmamali  SIGN UP butonunun görüntülenemedigini doğrula

        ReusableMethods.waitForSecond(10);
        Assert.assertFalse(mainPage.registerPage().signUpButton.isDisplayed(), "SING UP butonu  goruntulenemedi");
    }


    @Test
    public void CheckBoxTest() {
        ReusableMethods.waitForSecond(5);
        if (mainPage.registerPage().checkBox.isSelected()) {
            mainPage.registerPage().checkBox.click();
        }
        // Kullanıcı bilgilerini gir
        ReusableMethods.customerlogin(faker.name().username(), faker.internet().emailAddress(), faker.regexify("[A-Za-z0-9!@#$%^&*()-_=+<>?]{9}"));
        // I agree to the privacy policy kontrol kutusuna tiklama
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        // SIGN UP butonuna tıkla
        mainPage.registerPage().signUpButton.click();
        // Anasayfanın açıldıgini ve Sign Up butonunun göründüğünü doğrula

        ReusableMethods.waitForSecond(10);
        Assert.assertTrue(mainPage.registerPage().signUpButton.isDisplayed(), "SING UP butonu  goruntulenemedi");

    }

}

