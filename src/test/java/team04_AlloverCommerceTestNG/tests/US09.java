package team04_AlloverCommerceTestNG.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.devtools.v122.page.Page;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import team04_AlloverCommerceTestNG.pages.P00_MainPage;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.Driver;
import team04_AlloverCommerceTestNG.utilities.ReusableMethods;

public class US09 {

     P00_MainPage mainPage = new P00_MainPage();


    @Test
    public void testCase01() throws InterruptedException {

      // Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("url"));

      // Register alanına tıkla
        mainPage.homePage().registerButton.click();

      // Açılan pop-up ta "Become a Vendor" alanına tıkla
        mainPage.registerPage().becomeAVendorLink.click();

      // Email alanına veri gir
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        String fakeEmail = mainPage.fakeMailPage().fakeEmail.getText();

        ReusableMethods.switchToWindow(0);
        mainPage.vendorRegisterPage().emailBox.sendKeys(fakeEmail);

      // Verification Code alanına tıkla
        mainPage.vendorRegisterPage().verificationCodeBox.click();

      // Mail adresine gelen kodu Verification Code alanına gir
        ReusableMethods.switchToWindow(1);
        ReusableMethods.visibleWait(mainPage.fakeMailPage().verificationCodeMail,5);
        mainPage.fakeMailPage().verificationCodeMail.click();
        ReusableMethods.scrollEnd();
        Driver.getDriver().switchTo().frame("iframeMail");
        String code =mainPage.fakeMailPage().verificationCode.getText();
        ReusableMethods.switchToWindow(0);
        mainPage.vendorRegisterPage().verificationCodeBox.sendKeys(code);

        // Password alanına veri 'Pass12.%-' gir
        // Confirm Password alanına aynı password'u 'Pass12.%-' gir
        // Register butonu tıkla
        String password="Pass12.%-";
        mainPage.vendorRegisterPage().passwordBox.sendKeys(password, Keys.TAB,
                password,Keys.TAB,Keys.ENTER);

      // "Welcome to Allover Commerce! " sayfasının açıldığını ve kayıt işleminin tamamlandığını doğrula
        Assert.assertTrue(mainPage.vendorRegisterPage().welcomePageText.getText().contains("Welcome to Allover Commerce!"));

    }

    @Test
    public  void testCase02() {

      // Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("url"));

      // Register alanına tıkla
         mainPage.homePage().registerButton.click();

      // Açılan pop-up ta "Become a Vendor" alanına tıkla
         mainPage.registerPage().becomeAVendorLink.click();

      //  Email alanını boş bırak
      //  Verification Code alanına tıkla
         mainPage.vendorRegisterPage().verificationCodeBox.click();

      //  Verification Code alanına bir veri '123' gir
         mainPage.vendorRegisterPage().verificationCodeBox.sendKeys("123");

      // Password alanına veri 'Pass12.%-' gir
      // Confirm Password alanına aynı password'u 'Pass12.%-' gir
      // Register butonu tıkla
         String password="Pass12.%-";
         mainPage.vendorRegisterPage().passwordBox.sendKeys(password, Keys.TAB,
                password,Keys.TAB,Keys.ENTER);

      //  Kayıt işleminin gerçekleşmediğini ve uyarı 'Email: This field is required.' çıktığını doğrula

        String actualMessage=mainPage.vendorRegisterPage().verificationSendMessage.getAttribute("textContent");
        String expectedMessage ="Email: This field is required.";

        Assert.assertEquals(actualMessage,expectedMessage);

    }

    @Test
    public void testCase03() {

        // Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // Register alanına tıkla
        mainPage.homePage().registerButton.click();

        // Açılan pop-up ta "Become a Vendor" alanına tıkla
        mainPage.registerPage().becomeAVendorLink.click();

       //  Email alanına veri  'Mustafa.gmail.com' gir
        mainPage.vendorRegisterPage().emailBox.sendKeys("Mustafa.gmail.com");

        //  Verification Code alanına tıkla
        mainPage.vendorRegisterPage().verificationCodeBox.click();

        //  Verification Code alanına bir veri '123' gir
        mainPage.vendorRegisterPage().verificationCodeBox.sendKeys("123");

        // Password alanına veri 'Pass12.%-' gir
        // Confirm Password alanına aynı password'u 'Pass12.%-' gir
        // Register butonu tıkla
        String password="Pass12.%-";
        mainPage.vendorRegisterPage().passwordBox.sendKeys(password, Keys.TAB,
                password,Keys.TAB,Keys.ENTER);

       //  Kayıt işleminin gerçekleşmediğini ve uyarı 'Please provide a valid email address.' çıktığını doğrula

       // JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
       // String actualMessage = (String) js.executeScript("return arguments[0].textContent;",mainPage.vendorRegisterPage().mailSendMessage);
//
        String actualMessage=mainPage.vendorRegisterPage().mailSendMessage.getAttribute("textContent");
        System.out.println("------=======-------");
        System.out.println(actualMessage);
        String expectedMessage="Please provide a valid email address.";

        //Assert.assertEquals(actualMessage,expectedMessage);


    }
}
