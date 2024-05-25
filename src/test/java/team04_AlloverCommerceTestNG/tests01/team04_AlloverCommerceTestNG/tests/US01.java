package team04_AlloverCommerceTestNG.tests;

import org.testng.annotations.Test;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.Driver;

public class US01 {

    @Test
    public void testTC01(){
       // Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("allovercomerceUrl"));


       // Register linkine tıkla

       // Username alana veri gir

       // Your Email address alanına bir adres  gir

       // Password alanına güçlü bir şifre oluştur

       // I agree to the privacy policy kontrol kutusunu seç

       // SIGN UP butonuna tıkla

       // Anasayfanın açıldığını ve Sign Out linkinin göründüğünü doğrula




    }
}
