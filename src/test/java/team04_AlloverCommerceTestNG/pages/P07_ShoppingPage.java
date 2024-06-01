package team04_AlloverCommerceTestNG.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team04_AlloverCommerceTestNG.utilities.*;


public class P07_ShoppingPage {
    public P07_ShoppingPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    P00_MainPage mainPage = new P00_MainPage();



    @FindBy(xpath = "//h1[@class='product_title entry-title']")
    public WebElement samsungS23;

    @FindBy(xpath = "//p[@class='alert alert-light alert-info woocommerce-info']")
    public WebElement searchResult;



    @FindBy(xpath="(//a[@class='compare btn-product-icon'])[5]")
    public WebElement basicCoachBag;


    @FindBy(xpath="//div[@class='container slider-relative']")
    public WebElement comparePanel;


// urun silmek icin


    @FindBy(xpath="(//a[@class='btn-remove remove_from_compare fas fa-times'])[2]")
    public WebElement secondProductDeleteCruz;  // IPhone8

    @FindBy(xpath="//a[@class='compare-clean']")
    public WebElement cleanAllButonu;















    @FindBy(css = "[name='add-to-cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='woocommerce-message alert alert-simple alert-btn alert-success']")
    public WebElement productAddedText;

    @FindBy(xpath = "//div[@class='woocommerce-message alert alert-simple alert-btn alert-success']/a[.='View cart']")
    public WebElement viewCartButton;

    @FindBy(xpath = "//td[@class='product-name']//a[.='Samsung Galaxy S23 Ultra']")
    public WebElement productInCart;

    @FindBy(xpath = "//button[@class='quantity-plus w-icon-plus']")
    public WebElement quantityPlus;

    @FindBy(xpath = "//button[@class='quantity-minus w-icon-minus']")
    public WebElement quantityMinus;

    //Methods

    public void searchProduct1() {
        mainPage.homePage().searchBox.sendKeys(ConfigReader.getProperty("product1")+ Keys.ENTER);
        ReusableMethods.waitForSecond(3);
        ReusableMethods.click(mainPage.shoppingPage().addToCartButton);
    }

    public void searchProduct2() {
        mainPage.homePage().searchBox.sendKeys(ConfigReader.getProperty("product2")+ Keys.ENTER);
        ReusableMethods.waitForSecond(3);
        ReusableMethods.click(mainPage.shoppingPage().addToCartButton);
    }

    public void searchProduct3() {
        mainPage.homePage().searchBox.sendKeys(ConfigReader.getProperty("product3")+ Keys.ENTER);
        ReusableMethods.waitForSecond(3);
        ReusableMethods.click(mainPage.shoppingPage().addToCartButton);
    }

    public void invalidSearch() {
        mainPage.homePage().searchBox.sendKeys(ConfigReader.getProperty("invalid_search") + Keys.ENTER);
        ReusableMethods.waitForSecond(3);
    }

















    @FindBy(xpath="//input[@class='form-control']")
    public WebElement searchbox;



    @FindBy(xpath="(//a[@class='compare btn-product-icon'])[1]")
    public WebElement iphone15ProMaxIcon;


    @FindBy(xpath="(//a[@class='compare btn-product-icon'])[1]")
    public WebElement iphone8Icon;

    @FindBy(xpath="(//a[@class='compare btn-product-icon'])[3]")

    public WebElement hiPhoneIcon;


    @FindBy(xpath="(//a[@class='compare btn-product-icon'])[1]")
    public WebElement samsungGalaxyS23UltraIcon;


    @FindBy(xpath="(//a[@class='compare btn-product-icon'])[1]")
    public WebElement basicHandBagIcon;










}
