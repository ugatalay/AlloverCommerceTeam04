package team04_AlloverCommerceTestNG.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team04_AlloverCommerceTestNG.utilities.*;

public class P08_ProductPage {

    public P08_ProductPage (){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath="//img[@width='180']")
    public WebElement macBookV20;

    @FindBy(xpath="(//a[@rel='nofollow'])[2]")
    public WebElement macBookV20Icon;

    @FindBy(xpath="(//img[@width='300'])[2]")
    public WebElement macBookPro;

    @FindBy(xpath="(//a[@rel='nofollow'])[5]")
    public WebElement macBookProIcon;


    @FindBy(xpath="//i[@class='w-icon-heart']")
    public WebElement wishlistIcon;

    @FindBy(xpath="//input[@class='form-control']")
    public WebElement searchbox;

    @FindBy(xpath="//h2[@class='page-title']")
    public WebElement whishListPageText;


    @FindBy(xpath = "//button[@title='Quick View'][1]")
    public WebElement quickButton1;


    @FindBy(xpath = "//button[@data-product='16777']")
    public WebElement quickButton2;



    @FindBy(xpath = "//button[@title='Close (Esc)']")
    public WebElement closeButton;





    @FindBy(xpath = "//button[@name='add-to-cart']")
    public WebElement addCartButton ;

    @FindBy(xpath = "//div[@data-id='fbb1175']")
    public WebElement cartIcon ;

    @FindBy(xpath = "//a[@class='button wc-forward']")
    public WebElement viewButton ;

    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    public WebElement proceedCheckOut ;

    @FindBy(xpath = "//button[@id='place_order']")
    public WebElement placeOrder ;

    @FindBy(xpath = "//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received order-success']")
    public WebElement competeOrderText ;



    @FindBy(xpath = "//*[.='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButton;


}
