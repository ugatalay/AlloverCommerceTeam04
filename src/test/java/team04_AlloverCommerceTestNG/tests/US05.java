package team04_AlloverCommerceTestNG.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import team04_AlloverCommerceTestNG.pages.P00_MainPage;
import team04_AlloverCommerceTestNG.utilities.ConfigReader;
import team04_AlloverCommerceTestNG.utilities.Driver;
import team04_AlloverCommerceTestNG.utilities.ReusableMethods;
import org.testng.annotations.Test;
import team04_AlloverCommerceTestNG.pages.*;
import team04_AlloverCommerceTestNG.utilities.*;

public class US05 {

    @Test
    public void US05_TC01() throws InterruptedException {

        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        /*
        Web sitesine git
        Sign in butonuna tikla
        Gecerli bir user name yaz
        Gecerli bir password yaz
        Sign out butonuna tikla
        Sag üstteki Sign Out yazan kisma tikla
         */


        mainPage.homePage().signIn.click();
        mainPage.userVendorLoginPage().usernameBox.click();
        mainPage.userVendorLoginPage().usernameBox.sendKeys(ConfigReader.getProperty("username1"));
        mainPage.userVendorLoginPage().passwordBox.sendKeys(ConfigReader.getProperty("userpassword1"));
        mainPage.userVendorLoginPage().signInButton.click();
        ReusableMethods.waitForSecond(3);
        mainPage.homePage().myAccount.click();
        ReusableMethods.waitForSecond(5);

        /*
        Sol tarafdaki Menu gorünümünün icinden Account details'e tikla
        Kullanici Account Details'in gorüldügünü dogrula
       */

        WebDriver driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        WebElement accountDetailsLink = driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/my-account-2/edit-account/']"));
        actions.moveToElement(accountDetailsLink).click().perform();



    }

    @Test
    public void US05_TC02() throws InterruptedException {


        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        /*
        Web sitesine git
        Sign in butonuna tikla
        Gecerli bir user name yaz
        Gecerli bir password yaz
        Sign out butonuna tikla
        Sag üstteki Sign Out yazan kisma tikla
         */


        mainPage.homePage().signIn.click();
        mainPage.userVendorLoginPage().usernameBox.click();
        mainPage.userVendorLoginPage().usernameBox.sendKeys(ConfigReader.getProperty("username1"));
        mainPage.userVendorLoginPage().passwordBox.sendKeys(ConfigReader.getProperty("userpassword1"));
        mainPage.userVendorLoginPage().signInButton.click();
        ReusableMethods.waitForSecond(3);
        mainPage.homePage().myAccount.click();
        ReusableMethods.waitForSecond(5);


        WebDriver driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        WebElement accountDetailsLink = driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/my-account-2/edit-account/']"));
        actions.moveToElement(accountDetailsLink).click().perform();
        ReusableMethods.waitForSecond(5);

        /*
        First Name kismina bir isim gir
        Last Name kismina bir isim gir
        Display Name'deki eski ismi sil ve yeni isim gir
        Eski E-Mail adresini sil ve yeni bir email adresi gir
         */

        mainPage.accountDetails().firstName.clear();
        mainPage.accountDetails().firstName.sendKeys(ConfigReader.getProperty("firstName1"));
        mainPage.accountDetails().lastName.clear();
        mainPage.accountDetails().lastName.sendKeys(ConfigReader.getProperty("lastName1"));
        mainPage.accountDetails().displayName.clear();
        mainPage.accountDetails().displayName.sendKeys(ConfigReader.getProperty("displayName1"));
        mainPage.accountDetails().email.clear();
        mainPage.accountDetails().email.sendKeys(ConfigReader.getProperty("email1"));

        //Alta scroll yap ve Save Changes butonuna tikla
        WebElement saveChange = driver.findElement(By.xpath("//button[.='Save changes']"));
        actions.moveToElement(saveChange).click().perform();


    }

    @Test
    public void US05_TC03() throws InterruptedException {


        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        /*
        Web sitesine git
        Sign in butonuna tikla
        Gecerli bir user name yaz
        Gecerli bir password yaz
        Sign out butonuna tikla
        Sag üstteki Sign Out yazan kisma tikla
         */


        mainPage.homePage().signIn.click();
        mainPage.userVendorLoginPage().usernameBox.click();
        mainPage.userVendorLoginPage().usernameBox.sendKeys(ConfigReader.getProperty("username1"));
        mainPage.userVendorLoginPage().passwordBox.sendKeys(ConfigReader.getProperty("userpassword1"));
        mainPage.userVendorLoginPage().signInButton.click();
        ReusableMethods.waitForSecond(3);
        mainPage.homePage().myAccount.click();
        ReusableMethods.waitForSecond(5);

        WebDriver driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        WebElement accountDetailsLink = driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/my-account-2/edit-account/']"));
        actions.moveToElement(accountDetailsLink).click().perform();
        ReusableMethods.waitForSecond(5);

        /*
        First Name kismina bos birak
        Last Name kismina bos birak
        Display Name'deki eski ismi sil ve bos birak
        Mail adresini bos birak
         */

        mainPage.accountDetails().firstName.clear();

        mainPage.accountDetails().lastName.clear();

        mainPage.accountDetails().displayName.clear();

        mainPage.accountDetails().email.clear();

        //Alta scroll yap ve Save Changes butonuna tikla
        WebElement saveChange = driver.findElement(By.xpath("//button[.='Save changes']"));
        actions.moveToElement(saveChange).click().perform();


    }

    @Test
    public void US05_TC04() throws InterruptedException {


        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        /*
        Web sitesine git
        Sign in butonuna tikla
        Gecerli bir user name yaz
        Gecerli bir password yaz
        Sign out butonuna tikla
        Sag üstteki Sign Out yazan kisma tikla
         */


        mainPage.homePage().signIn.click();
        mainPage.userVendorLoginPage().usernameBox.click();
        mainPage.userVendorLoginPage().usernameBox.sendKeys(ConfigReader.getProperty("username1"));
        mainPage.userVendorLoginPage().passwordBox.sendKeys(ConfigReader.getProperty("userpassword1"));
        mainPage.userVendorLoginPage().signInButton.click();
        ReusableMethods.waitForSecond(3);
        mainPage.homePage().myAccount.click();
        ReusableMethods.waitForSecond(5);

        WebDriver driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        WebElement accountDetailsLink = driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/my-account-2/edit-account/']"));
        actions.moveToElement(accountDetailsLink).click().perform();
        ReusableMethods.waitForSecond(5);

        //Account Details kismindaki Biography kismina yazi gir
        driver.switchTo().frame("user_description_ifr");
        WebElement biography = driver.findElement(By.xpath("//p"));
        biography.sendKeys("I am Rana, I am housewife and I have two sons");
        driver.switchTo().defaultContent();

        //Alta scroll yap ve Save Changes butonuna tikla
        ReusableMethods.waitForSecond(5);
        WebElement saveChange = driver.findElement(By.xpath("//button[.='Save changes']"));
        actions.moveToElement(saveChange).click().perform();




    }

    @Test
    public void US05_TC05() throws InterruptedException {


        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        /*
        Web sitesine git
        Sign in butonuna tikla
        Gecerli bir user name yaz
        Gecerli bir password yaz
        Sign out butonuna tikla
        Anasayfanın açıldığını ve Sign Out linkinin goründüğünü doğrula
        Yol- Sag üstteki Sign Out yazan kisma tikla
         */


        mainPage.homePage().signIn.click();
        mainPage.userVendorLoginPage().usernameBox.click();
        mainPage.userVendorLoginPage().usernameBox.sendKeys(ConfigReader.getProperty("username1"));
        mainPage.userVendorLoginPage().passwordBox.sendKeys(ConfigReader.getProperty("userpassword1"));
        mainPage.userVendorLoginPage().signInButton.click();
        ReusableMethods.waitForSecond(3);
        mainPage.homePage().myAccount.click();
        ReusableMethods.waitForSecond(5);

        WebDriver driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        WebElement accountDetailsLink = driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/my-account-2/edit-account/']"));
        actions.moveToElement(accountDetailsLink).click().perform();
        ReusableMethods.waitForSecond(5);

        /*
        Current password leave blank to leave unchanged kismina eski password'u gir
        New password leave blank to leave unchanged kismina yeni password'u gir
        Confirm password kismina New Password kisminda verdigin password'u gir
         */
        mainPage.accountDetails().passwordCurrent.sendKeys(ConfigReader.getProperty("userpassword1"));

        mainPage.accountDetails().newPassword.sendKeys(ConfigReader.getProperty("userpassword2"));
        mainPage.accountDetails().confirmPassword.sendKeys(ConfigReader.getProperty("userpassword2"));
        /*
        Uyari! Eger ki bu TC_05 calistirildikrtan sonra girisde hata aliyorsaniz, bilin ki password degismistir ve eski passwordla giris yapmaya calisiyorsunuzdur
         */

        //Alta scroll yap ve Save Changes butonuna tikla
        ReusableMethods.waitForSecond(3);
        WebElement saveChange = driver.findElement(By.xpath("//button[.='Save changes']"));
        actions.moveToElement(saveChange).click().perform();


    }

    @Test
    public void US05_TC06() throws InterruptedException {


        P00_MainPage mainPage = new P00_MainPage();

        Driver.getDriver().get(ConfigReader.getProperty("url"));

        /*
        Web sitesine git
        Sign in butonuna tikla
        Gecerli bir user name yaz
        Gecerli bir password yaz
        Sign out butonuna tikla
        Sag üstteki Sign Out yazan kisma tikla
         */


        mainPage.homePage().signIn.click();
        mainPage.userVendorLoginPage().usernameBox.click();
        mainPage.userVendorLoginPage().usernameBox.sendKeys(ConfigReader.getProperty("username1"));
        mainPage.userVendorLoginPage().passwordBox.sendKeys(ConfigReader.getProperty("userpassword1"));
        mainPage.userVendorLoginPage().signInButton.click();
        ReusableMethods.waitForSecond(3);
        mainPage.homePage().myAccount.click();
        ReusableMethods.waitForSecond(3);

        WebDriver driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        WebElement accountDetailsLink = driver.findElement(By.xpath("//a[@href='https://allovercommerce.com/my-account-2/edit-account/']"));
        actions.moveToElement(accountDetailsLink).click().perform();
        ReusableMethods.waitForSecond(3);

        /*
        Current password leave blank to leave unchanged kismina eski password'u gir
        New Passworda kisa kombinasyonlu sayi gir
        Confirm password kismina ayni passwordu gir
         */
        mainPage.accountDetails().passwordCurrent.sendKeys(ConfigReader.getProperty("userpassword1"));

        mainPage.accountDetails().newPassword.sendKeys(ConfigReader.getProperty("weakpassword"));
        driver.switchTo().defaultContent();
        mainPage.accountDetails().confirmPassword.sendKeys(ConfigReader.getProperty("weakpassword"));
        /*
        Hata! Manuel olarak password degistirilmek istendiginde ve kisa(4 haneli) bir password verildiginde hata verirken
        otomasyonda hata vermiyor!*
         */

        //Alta scroll yap ve Save Changes butonuna tikla
        ReusableMethods.waitForSecond(3);
        WebElement saveChange = driver.findElement(By.xpath("//button[.='Save changes']"));
        actions.moveToElement(saveChange).click().perform();


    }

}
