package team04_AlloverCommerceTestNG.pages;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team04_AlloverCommerceTestNG.utilities.*;


public class P07_ShoppingPage{


    public P07_ShoppingPage(){PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath="//input[@class='form-control']")
    public WebElement searchbox;

    @FindBy(xpath="//main[@class='main']")
    public WebElement anaEkran;

    @FindBy(xpath="(//a[@class='compare btn-product-icon'])[1]")
    public WebElement iphone15ProMaxIcon;



    @FindBy(xpath="(//a[@class='compare btn-product-icon'])[1]")
    public WebElement iphone8Icon;


    @FindBy(xpath="(//a[@class='compare btn-product-icon'])[3]")

    public WebElement hiPhoneIcon;


    @FindBy(xpath="(//a[@class='compare btn-product-icon'])[1]")
    public WebElement samsungGalaxyS23UltraIcon;


    @FindBy(xpath="//div[@class='container slider-relative']")
    public WebElement CompareProductPanel;


    @FindBy(xpath="(//a[@class='compare btn-product-icon'])[5]")
    public WebElement basicCoachBag;


    @FindBy(xpath="//div[@class='container slider-relative']")
    public WebElement comparePanel;


// urun silmek icin

//
    @FindBy(xpath="(//a[@class='btn-remove remove_from_compare fas fa-times'])[2]")
    public WebElement secondProductDeleteCruz;  // IPhone


}
