package team04_AlloverCommerceTestNG.tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import team04_AlloverCommerceTestNG.pages.P00_MainPage;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.DataProviderUtils;
import team04_AlloverCommerceTestNG.utilities.Driver;
import team04_AlloverCommerceTestNG.utilities.ReusableMethods;

public class US09 {

     P00_MainPage mainPage = new P00_MainPage();

    @Test (description = "US 09 - TC 01 Vendor Registiration")
    public void vendorRegister() throws InterruptedException {

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
        //ReusableMethods.visibleWait(mainPage.fakeMailPage().verificationCodeMail,5);
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

        Driver.closeDriver();

    }

    @Test (description = " US 09 - TC 02 Vendor Register Without Mail Data")
    public  void vendorRegisterWithoutMail() {

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

        Driver.closeDriver();

    }

    @Test (dataProvider = "vendorRegisterNegativeMailData",dataProviderClass = DataProviderUtils.class,
            description = "US 09 - TC 03, 04, 05, 06 Vendor Register With Negative Mail Data use DataProvider ")
    public void vendorRegisterNegativeMail (String mail) {

        // Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // Register alanına tıkla
        mainPage.homePage().registerButton.click();

        // Açılan pop-up ta "Become a Vendor" alanına tıkla
        mainPage.registerPage().becomeAVendorLink.click();

        //  Email alanına hatalı veri  gir
        mainPage.vendorRegisterPage().emailBox.sendKeys(mail);

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
        String actualMessage=mainPage.vendorRegisterPage().mailSendMessage.getAttribute("textContent");
        String expectedMessage="Please provide a valid email address.";

        Assert.assertEquals(actualMessage,expectedMessage);

        Driver.closeDriver();


    }

    @Test (description = "US 09 - TC 07  Vendor Registration without veritification code")
    public void vendorRegistrationwWithoutCode() {

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

        // Password alanına veri 'Pass12.%-' gir
        // Confirm Password alanına aynı password'u 'Pass12.%-' gir
        // Register butonu tıkla
        String password="Pass12.%-";
        mainPage.vendorRegisterPage().passwordBox.sendKeys(password, Keys.TAB,
                password,Keys.TAB,Keys.ENTER);

        // Kayıt işleminin gerçekleşmediğini ve 'Email Verification Code: This field is required.' uyarısı çıktığını doğrula

        String actualMessage=mainPage.vendorRegisterPage().mailSendMessage.getAttribute("textContent");
        String expectedMessage="Email Verification Code: This field is required.";

        Assert.assertEquals(actualMessage,expectedMessage);

        Driver.closeDriver();
    }

    @Test (description = "US 09 - TC 08  Vendor Registration with wrong veritification code")
    public void vendorRegistrationWithWrongCode() {

        // Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // Register alanına tıkla
        mainPage.homePage().registerButton.click();

        // Açılan pop-up ta "Become a Vendor" alanına tıkla
        mainPage.registerPage().becomeAVendorLink.click();

        // Email alanına veri gir
        // ReusableMethods.vendorRegisterMailInput();
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        String fakeEmail = mainPage.fakeMailPage().fakeEmail.getText();
        ReusableMethods.switchToWindow(0);
        mainPage.vendorRegisterPage().emailBox.sendKeys(fakeEmail);

      //  Verification Code alanına tıkla
        mainPage.vendorRegisterPage().verificationCodeBox.click();

      //  Verification Code alanına 11 gir
          mainPage.vendorRegisterPage().verificationCodeBox.sendKeys("11");
        // Password alanına veri 'Pass12.%-' gir
        // Confirm Password alanına aynı password'u 'Pass12.%-' gir
        // Register butonu tıkla
        String password="Pass12.%-";
        mainPage.vendorRegisterPage().passwordBox.sendKeys(password, Keys.TAB,
                                                           password, Keys.TAB, Keys.ENTER);

      //  Kayıt işleminin gerçekleşmediğini ve uyarı çıktığını doğrula
        String actualMessage =mainPage.vendorRegisterPage().mailSendMessage.getAttribute("textContent");
        String expectedMessage="Email verification code invalid.";

        Assert.assertEquals(actualMessage,expectedMessage);

        Driver.closeDriver();
    }

    @Test  ( description ="US 09 - TC 09  Vendor Register without Password Data in first Password Box" )
    public void withoutPasswordRegistiration() {
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
        //ReusableMethods.visibleWait(mainPage.fakeMailPage().verificationCodeMail,5);
        mainPage.fakeMailPage().verificationCodeMail.click();
        ReusableMethods.scrollEnd();
        Driver.getDriver().switchTo().frame("iframeMail");
        String code =mainPage.fakeMailPage().verificationCode.getText();
        ReusableMethods.switchToWindow(0);
        mainPage.vendorRegisterPage().verificationCodeBox.sendKeys(code);

        // Password alanını boş bırak
        // Confirm Password alanına 'Pass12.%-' gir
        // Register butonu tıkla
        String password="Pass12.%-";
        mainPage.vendorRegisterPage().confirmPasswordBox.sendKeys(password, Keys.TAB, Keys.ENTER);


      //  Kayıt işleminin gerçekleşmediğini ve  "Password : This field is required." uyarısı çıktığını doğrula
        String actualMessage =mainPage.vendorRegisterPage().mailSendMessage.getAttribute("textContent");
        String expectedMessage="Password : This field is required.";

        SoftAssert softAssert =new SoftAssert();
        softAssert.assertEquals(actualMessage,expectedMessage);

        Driver.closeDriver();

    }

    @Test (dataProvider = "passwordInputNegativeData", dataProviderClass = DataProviderUtils.class,
            description = "US 09 - TC 10 Vendor Register with  Negative Password Data 'Only lowerCase' ")
    public void vendorRegisterWithNegativePassword01(String password) {

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
        //ReusableMethods.visibleWait(mainPage.fakeMailPage().verificationCodeMail,5);
        mainPage.fakeMailPage().verificationCodeMail.click();
        ReusableMethods.scrollEnd();
        Driver.getDriver().switchTo().frame("iframeMail");
        String code =mainPage.fakeMailPage().verificationCode.getText();
        ReusableMethods.switchToWindow(0);
        mainPage.vendorRegisterPage().verificationCodeBox.sendKeys(code);

        // Password alanına veri 'sadecekucukharf' gir
        // Confirm Password alanına aynı password'u 'sadecekucukharf' gir
        // Register butonu tıkla

        //String password="sadecekucukharf";
        mainPage.vendorRegisterPage().passwordBox.sendKeys(password, Keys.TAB,
                password,Keys.TAB,Keys.ENTER);

        //  Kayıt işleminin gerçekleşmediğini ve "Password strength should be atleast 'Good'."  uyarısı çıktığını doğrula
        String actualMessage =mainPage.vendorRegisterPage().mailSendMessage.getAttribute("textContent");
        String expectedMessage="Password strength should be atleast \"Good\".";

        Assert.assertEquals(actualMessage,expectedMessage);

        Driver.closeDriver();

    }
    /*
    tc 15 kadar olan testler gelecek
     */

    @Test  ( description ="US 09 - TC 15  Vendor Register without Confirm Password Data " )
    public void withoutConfirmPasswordRegistiration() {
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
        //ReusableMethods.visibleWait(mainPage.fakeMailPage().verificationCodeMail,5);
        mainPage.fakeMailPage().verificationCodeMail.click();
        ReusableMethods.scrollEnd();
        Driver.getDriver().switchTo().frame("iframeMail");
        String code =mainPage.fakeMailPage().verificationCode.getText();
        ReusableMethods.switchToWindow(0);
        mainPage.vendorRegisterPage().verificationCodeBox.sendKeys(code);

        // Password alanını alanına 'Pass12.%-' gir
        // Confirm Password alanını boş bırak
        // Register butonu tıkla
        String password="Pass12.%-";
        mainPage.vendorRegisterPage().passwordBox.sendKeys(password,Keys.TAB,Keys.TAB,Keys.ENTER);



        //  Kayıt işleminin gerçekleşmediğini ve  "Confirm Password : This field is required" uyarısı çıktığını doğrula
        String actualMessage =mainPage.vendorRegisterPage().mailSendMessage.getAttribute("textContent");
        String expectedMessage="Confirm Password : This field is required";
        System.out.println("==============");
        System.out.println(actualMessage);

        SoftAssert softAssert =new SoftAssert();
        softAssert.assertEquals(actualMessage,expectedMessage);

        Driver.closeDriver();

    }
    @Test  ( description ="US 09 - TC 16  Vendor Register with Wrong Confirm Password Data " )
    public void withWrongConfirmPasswordRegistiration() {
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
        //ReusableMethods.visibleWait(mainPage.fakeMailPage().verificationCodeMail,5);
        mainPage.fakeMailPage().verificationCodeMail.click();
        ReusableMethods.scrollEnd();
        Driver.getDriver().switchTo().frame("iframeMail");
        String code =mainPage.fakeMailPage().verificationCode.getText();
        ReusableMethods.switchToWindow(0);
        mainPage.vendorRegisterPage().verificationCodeBox.sendKeys(code);

        // Password alanını alanına 'Pass12.%-' gir
        // Confirm Password alanına 'Pass12' gir
        // Register butonu tıkla

        mainPage.vendorRegisterPage().passwordBox.sendKeys("Pass12.%-",Keys.TAB,"Pass12",Keys.TAB,Keys.ENTER);

        //  Kayıt işleminin gerçekleşmediğini ve  "Password and Confirm-password are not same" uyarısı çıktığını doğrula
        String actualMessage =mainPage.vendorRegisterPage().mailSendMessage.getAttribute("textContent");
        String expectedMessage="Password and Confirm-password are not same";

        SoftAssert softAssert =new SoftAssert();
        softAssert.assertEquals(actualMessage,expectedMessage);

        Driver.closeDriver();

    }
    @Test (description = "US 09 - TC 17 Vendor Register With Exists Mail Data ")
    public void vendorRegisterWithExistsMail (){

        // Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // Register alanına tıkla
        mainPage.homePage().registerButton.click();

        // Açılan pop-up ta "Become a Vendor" alanına tıkla
        mainPage.registerPage().becomeAVendorLink.click();

        //  Email alanına "pollux.kyeson@foodfarms.net"  gir
        mainPage.vendorRegisterPage().emailBox.sendKeys("pollux.kyeson@foodfarms.net");

        //  Verification Code alanına tıkla
        mainPage.vendorRegisterPage().verificationCodeBox.click();

        //  Verification Code alanına bir veri '123456' gir
        mainPage.vendorRegisterPage().verificationCodeBox.sendKeys("123456");

        // Password alanına veri 'Pass12.%-' gir
        // Confirm Password alanına aynı password'u 'Pass12.%-' gir
        // Register butonu tıkla
        String password="Pass12.%-";
        mainPage.vendorRegisterPage().passwordBox.sendKeys(password, Keys.TAB,
                password,Keys.TAB,Keys.ENTER);

        //  Kayıt işleminin gerçekleşmediğini ve 'This Email already exists. Please login to the site and apply as vendor.' uyarısı çıktığını doğrula
        String actualMessage=mainPage.vendorRegisterPage().mailSendMessage.getAttribute("textContent");
        String expectedMessage="This Email already exists. Please login to the site and apply as vendor.";
        System.out.println("==========");
        System.out.println(actualMessage);

        Assert.assertEquals(actualMessage,expectedMessage);

        Driver.closeDriver();


    }








}

