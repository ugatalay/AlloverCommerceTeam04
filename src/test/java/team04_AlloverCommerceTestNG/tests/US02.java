package team04_AlloverCommerceTestNG.tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import team04_AlloverCommerceTestNG.pages.P00_MainPage;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.Driver;

public class US02 {
        P00_MainPage mainPage = new P00_MainPage();
        Faker faker = new Faker();
        @BeforeMethod
        public void beforeMethod (){
            //Web sitesine git      (     https://allovercommerce.com/    )
            Driver.getDriver().get(ConfigReader.getProperty("url"));

            //Register linkine tıkla
            mainPage.homePage().registerButton.click();

        }

       @AfterMethod
       public void afterMethod (){      Driver.closeDriver();   }

       @Test
       public void TestTC01 () {

           //Test Objective  : Siteye müşteri olarak daha once kayıtlı bilgiler ile kayıt yapılamamalı

            //Username alanına kayıtlı username gir    (  manualtestertry   )
            mainPage.registerPage().userName.sendKeys("manualtestertry", Keys.TAB);

            //Your Email address alanına kayıtlı emaili gir   (  manualtestertry@gmail.com   )
            mainPage.registerPage().yourEmailAddress.sendKeys("manualtestertry@gmail.com",Keys.TAB);

            //Password alanına kayıtlı passwordu gir          (  Manualtestertry_03   )
            mainPage.registerPage().password.sendKeys("Manualtestertry_03",Keys.TAB);

            //I agree to the privacy policy kontrol kutusunu seç
            if (!mainPage.registerPage().iAgreeToThePrivacyPolicy.isSelected()){
               mainPage.registerPage().iAgreeToThePrivacyPolicy.click();       }

           //SİGN UP butonuna tıkla
           mainPage.registerPage().signUp.click();

           //Kayıt yapılamadığını ve "An account is already registered with your email address." uyarı notu ile birlikte
           //"Please log in." metninin gorüldüğünü doğrula
           Assert.assertTrue(mainPage.registerPage().pleaseLogIn.getText().contains("Please log in"));
    }

       @Test
       public void TestTC02 (){

           //Test Objective  : Siteye müşteri olarak daha once kayıtlı username ile kayıt yapılamamalı

           //Username alanına kayıtlı username gir    (  manualtestertry   )
           mainPage.registerPage().userName.sendKeys("manualtestertry", Keys.TAB);

           //Your Email address alanına bir veri gir	{email adresi}
           mainPage.registerPage().yourEmailAddress.sendKeys(faker.internet().emailAddress(),Keys.TAB);

           //Password alanına bir veri gir	Ab123456789?
           mainPage.registerPage().password.sendKeys("Ab123456789?",Keys.TAB);

           //I agree to the privacy policy kontrol kutusunu seç
           if (!mainPage.registerPage().iAgreeToThePrivacyPolicy.isSelected()){
               mainPage.registerPage().iAgreeToThePrivacyPolicy.click();       }

           //SİGN UP butonuna tıkla
           mainPage.registerPage().signUp.click();

           //Kayıt yapılamadığını "An account is already registered with that username. Please choose another." uyarı
           //metninin gorüldüğünü doğrula
           Assert.assertTrue(mainPage.registerPage().pleaseChooseAnother.getText().
                   contains("An account is already registered with that username"));
       }

    @Test
    public void TestTC03 (){

        //Test Objective  : Siteye müşteri olarak daha once kayıtlı email ile kayıt yapılamamalı

        //Username alanına bir veri gir	{Username}
        mainPage.registerPage().userName.sendKeys(faker.name().firstName(), Keys.TAB);

        //Your Email address alanına kayıtlı emaili gir	  ( manualtestertry@gmail.com   )
        mainPage.registerPage().yourEmailAddress.sendKeys("manualtestertry@gmail.com",Keys.TAB);

        //Password alanına bir veri gir	Ab123456789?
        mainPage.registerPage().password.sendKeys("Ab123456789?",Keys.TAB);

        //I agree to the privacy policy kontrol kutusunu seç
        if (!mainPage.registerPage().iAgreeToThePrivacyPolicy.isSelected()){
            mainPage.registerPage().iAgreeToThePrivacyPolicy.click();       }

        //SİGN UP butonuna tıkla
        mainPage.registerPage().signUp.click();

        //Kayıt yapılamadığını ve "An account is already registered with your email address." uyarı notu ile birlikte
        //"Please log in." metninin gorüldüğünü doğrula
        Assert.assertTrue(mainPage.registerPage().pleaseLogIn.getText().contains("Please log in"));
    }

    @Test
    public void TestTC04 (){

        //Test Objective  : Siteye müşteri olarak daha once kayıtlı password ile kayıt yapılabilmeli

        //Username alanına bir veri gir	{Username}
        mainPage.registerPage().userName.sendKeys(faker.name().firstName(), Keys.TAB);

        //Your Email address alanına bir veri gir	{email adresi}
        mainPage.registerPage().yourEmailAddress.sendKeys(faker.internet().emailAddress(),Keys.TAB);

        //Password alanına kayıtlı passwordu gir          (  Manualtestertry_03   )
        mainPage.registerPage().password.sendKeys("Manualtestertry_03",Keys.TAB);

        //I agree to the privacy policy kontrol kutusunu seç
        if (!mainPage.registerPage().iAgreeToThePrivacyPolicy.isSelected()){
            mainPage.registerPage().iAgreeToThePrivacyPolicy.click();       }

        //SİGN UP butonuna tıkla
        mainPage.registerPage().signUp.click();

        //Anasayfanın açıldığını ve Sign Out linkinin gorüldüğünü doğrula
        Assert.assertTrue(mainPage.registerPage().signOut.getText().contains("Sign Out"));
    }
}


