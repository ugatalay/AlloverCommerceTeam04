package team04_AlloverCommerceTestNG.tests;


import org.testng.annotations.Test;
import team04_AlloverCommerceTestNG.pages.P00_MainPage;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.Driver;

public class US01 {
      P00_MainPage mainPage = new P00_MainPage();

    @Test
    public void testName() {    

        //Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //Sağ üst köşedeki Register linkine tıkla
         mainPage.homePage().registerButton.click();
        //Username alana veri gir


        //Your Email address alanına bir adres  gir

        //Password alanına güçlü bir şifre oluştur

        //I agree to the privacy policy kontrol kutusunu seç

        //SIGN UP butonuna tıkla

        //Anasayfanın açıldığını ve Sign Out linkinin göründüğünü doğrula


    }

}