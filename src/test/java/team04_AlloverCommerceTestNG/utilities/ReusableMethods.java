package team04_AlloverCommerceTestNG.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import team04_AlloverCommerceTestNG.pages.P00_MainPage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import static team04_AlloverCommerceTestNG.utilities.Driver.getDriver;

public class ReusableMethods {


    protected ExtentReports extentReports;
    protected ExtentHtmlReporter extentHtmlReporter;
    protected ExtentTest extentTest;

    protected static P00_MainPage mainPage;

    public void createExtentReport(String testName, String qaName, String name) {
        //Bu objecti raporlari olusturmak ve yönetmek icin kullanacağız
        extentReports = new ExtentReports();

        //Oncelikle olusturmak istedigimiz html report projemizde nerede saklamak istiyorsak bir dosya yolu olusturmaliyz
        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(LocalDateTime.now());
        String path = name + "target/extentReport/" + date + "htmlReport.html";
        extentHtmlReporter = new ExtentHtmlReporter(path);

        //ExtentsReports'a html raporlayici ekler,ve bu raporun html formatinda olusturulmasini saglar
        extentReports.attachReporter(extentHtmlReporter);

        //HTML raporun belge basligini ayarlar
        extentHtmlReporter.config().setDocumentTitle("Allover Commerce Test Raporu");

        //Raporda gösterilecek olan genel basligi ayarlar
        extentHtmlReporter.config().setReportName("My Extent Report");

        //Bu html raporunda görmek isteyebileceğimz diger bilgileri asagidaki sekilde ekleyebiliriz
        extentReports.setSystemInfo("Environment", "QA");
        extentReports.setSystemInfo("Browser", "Chrome");
        extentReports.setSystemInfo("Test Automation Engineer ", qaName);

        //AmazonTest adinda yeni bir test olusturur ve Test Steps aciklamasini ekler
        extentTest = extentReports.createTest(testName, "Test Steps");
    }

    //HARD WAIT METHOD
    public static void waitForSecond(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //Alert ACCEPT
    public static void alertAccept() {
        Driver.getDriver().switchTo().alert().accept();
    }

    //Alert DISMISS
    public static void alertDismiss() {
        Driver.getDriver().switchTo().alert().dismiss();
    }

    //Alert getText()
    public static void alertText() {
        Driver.getDriver().switchTo().alert().getText();
    }

    //Alert promptBox
    public static void alertprompt(String text) {
        Driver.getDriver().switchTo().alert().sendKeys(text);
    }

    //DropDown VisibleText
   /*
       Select select2 = new Select(gun);
       select2.selectByVisibleText("7");
       //ddmVisibleText(gun,"7"); --> Yukarıdaki kullanım yerine sadece method ile handle edebilirim
    */
    public static void ddmVisibleText(WebElement ddm, String secenek) {
        Select select = new Select(ddm);
        select.selectByVisibleText(secenek);
    }

    //DropDown Index
    public static void ddmIndex(WebElement ddm, int index) {
        Select select = new Select(ddm);
        select.selectByIndex(index);
    }

    //DropDown Value
    public static void ddmValue(WebElement ddm, String secenek) {
        Select select = new Select(ddm);
        select.selectByValue(secenek);
    }

    //SwitchToWindow1
    public static void switchToWindow(int sayi) {
        List<String> tumWindowHandles = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tumWindowHandles.get(sayi));
    }

    //SwitchToWindow2
    public static void window(int sayi) {
        Driver.getDriver().switchTo().window(Driver.getDriver().getWindowHandles().toArray()[sayi].toString());
    }

    //EXPLICIT WAIT METHODS
    //Visible Wait
    public static void visibleWait(WebElement element, int sayi) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //VisibleElementLocator Wait
    public static WebElement visibleWait(By locator, int sayi) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    //Alert Wait
    public static void alertWait(int sayi) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
        wait.until(ExpectedConditions.alertIsPresent());
    }

    //Tüm Sayfa ScreenShot
    public static void screenShot(String name) {
        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(LocalDateTime.now());
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        String dosyaYolu = System.getProperty("user.dir") + "/src/test/java/techproed/testOutputs/Screenshots/" + name + date + ".png";
        try {
            Files.write(Paths.get(dosyaYolu), ts.getScreenshotAs(OutputType.BYTES));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //WebElement ScreenShot
//webelement screenshot
    public static void screenShotOfWebElement(WebElement webElement) {
        String date = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss").format(LocalDateTime.now());
        String dosyaYolu = System.getProperty("user.dir") + "/src/test/java/techproed/testOutputs/webElementScreenshots/" + date + ".png";
        try {
            Files.write(Paths.get(dosyaYolu), webElement.getScreenshotAs(OutputType.BYTES));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //WebTable
    public static void printData(int satir, int sutun) {
        WebElement satirSutun = Driver.getDriver().findElement(By.xpath("(//tbody)[1]//tr[" + satir + "]//td[" + sutun + "]"));
        System.out.println(satirSutun.getText());
    }

    //Click Method
    public static void click(WebElement element) {
        try {
            element.click();
        } catch (Exception e) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            js.executeScript("arguments[0].click();", element);
        }
    }

    //JS Scroll
    public static void scroll(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //JS Sayfa Sonu Scroll
    public static void scrollEnd() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    //JS Sayfa Başı Scroll
    public static void scrollHome() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
    }

    //JS SendKeys
    public static void sendKeysJS(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].value='" + text + "'", element);
    }

    //JS SetAttributeValue
    public static void setAttributeJS(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].setAttribute('value','" + text + "')", element);
    }

    //JS GetAttributeValue
    public static void getValueByJS(String id, String attributeName) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String attribute_Value = (String) js.executeScript("return document.getElementById('" + id + "')." + attributeName);
        System.out.println("Attribute Value: = " + attribute_Value);
    }

    public static void clickBecomeVendor() {
        // Web sitesine git
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // Register alanına tıkla
        mainPage.homePage().registerButton.click();

        // Açılan pop-up ta "Become a Vendor" alanına tıkla
        mainPage.registerPage().becomeAVendorLink.click();

    }

    public static void vendorRegisterMailInput() {
        // Email alanına veri gir
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("fakeMailUrl"));
        String fakeEmail = mainPage.fakeMailPage().fakeEmail.getText();
        ReusableMethods.switchToWindow(0);
        mainPage.vendorRegisterPage().emailBox.sendKeys(fakeEmail);

    }

    public static void vendorRegisterCodeInput() {
        // Mail adresine gelen kodu Verification Code alanına gir
        ReusableMethods.switchToWindow(1);
        ReusableMethods.visibleWait(mainPage.fakeMailPage().verificationCodeMail, 5);
        mainPage.fakeMailPage().verificationCodeMail.click();
        ReusableMethods.scrollEnd();
        Driver.getDriver().switchTo().frame("iframeMail");
        String code = mainPage.fakeMailPage().verificationCode.getText();
        ReusableMethods.switchToWindow(0);
        mainPage.vendorRegisterPage().verificationCodeBox.sendKeys(code);

    }


    public static void textlereGiris() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
        mainPage.shoppingPage().searchbox.click();
        mainPage.shoppingPage().searchbox.sendKeys("Iphone", Keys.ENTER);

    }

    public static void IphoneProMax15() {

        WebDriver driver = Driver.getDriver();
        driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        actions.moveToElement(mainPage.shoppingPage().iphone15ProMaxIcon).perform();
        mainPage.shoppingPage().iphone15ProMaxIcon.click();
    }
    public static void Iphone8() {

        WebDriver driver = Driver.getDriver();
        driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        actions.moveToElement(mainPage.shoppingPage().iphone8Icon).perform();
        mainPage.shoppingPage().iphone8Icon.click();
    }

    public static void hiPhone() {

        WebDriver driver = Driver.getDriver();
        driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        actions.moveToElement(mainPage.shoppingPage().hiPhoneIcon).perform();
        mainPage.shoppingPage().hiPhoneIcon.click();

    }


    public static void samsung() {

        WebDriver driver = Driver.getDriver();
        driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        actions.moveToElement(mainPage.shoppingPage().searchbox).perform();
      mainPage.shoppingPage().searchbox.sendKeys("Samsung Galaxy S23 ULtra", Keys.ENTER);
        actions.moveToElement(mainPage.shoppingPage().samsungGalaxyS23UltraIcon).perform();
        mainPage.shoppingPage().samsungGalaxyS23UltraIcon.click();

    }

    public static void Bag() {

        WebDriver driver = Driver.getDriver();
        driver = Driver.getDriver();
        Actions actions = new Actions(driver);


        actions.moveToElement(mainPage.shoppingPage().searchbox).perform();
        mainPage.shoppingPage().searchbox.sendKeys("bag", Keys.ENTER);
     mainPage.shoppingPage().basicHandBag.click();

    }

    public static void compareButonu() {

        WebDriver driver = Driver.getDriver();
        driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        actions.moveToElement(mainPage.comparePage().compareButonu).perform();
       mainPage.comparePage().compareButonu.click();

    }


        public static void comparePopArea() {

            WebDriver driver = Driver.getDriver();
            driver = Driver.getDriver();
            Actions actions = new Actions(driver);

            actions.moveToElement(mainPage.comparePage().comparePopup).perform();
        mainPage.comparePage().comparePopup.click();


    }
    public static void cleanAllButon() {

        WebDriver driver = Driver.getDriver();
        driver = Driver.getDriver();
        Actions actions = new Actions(driver);

        actions.moveToElement(mainPage.shoppingPage().cleanAllButonu).perform();
       mainPage.shoppingPage().cleanAllButonu.click();

    }
    public static void macBookV20Tikla() {

        Actions actions = new Actions(getDriver());
        actions.moveToElement(mainPage.productPage().macBookV20).perform();
        actions.moveToElement(mainPage.productPage().macBookV20Icon).perform();
         mainPage.productPage.macBookV20Icon.click();

    }


    public static void macBookProTikla() {

        Actions actions = new Actions(getDriver());

        actions.moveToElement(mainPage.productPage().macBookPro).perform();
        waitForSecond(3);
        actions.moveToElement(mainPage.productPage().macBookProIcon).perform();
        waitForSecond(3);
        mainPage.productPage().macBookProIcon.click();

    }

    public static void mainWishlistIconTikla() {

        Actions actions = new Actions(getDriver());
        actions.moveToElement(mainPage.productPage().wishlistIcon).perform();
        mainPage.productPage().wishlistIcon.click();

    }

}