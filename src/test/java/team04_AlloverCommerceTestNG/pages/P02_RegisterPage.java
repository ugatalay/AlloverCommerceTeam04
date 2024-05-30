package team04_AlloverCommerceTestNG.pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team04_AlloverCommerceTestNG.utilities.Driver;

public class P02_RegisterPage {

    public  P02_RegisterPage() { PageFactory.initElements(Driver.getDriver(), this); }


    @FindBy(linkText = "Become a Vendor")
    public WebElement becomeAVendorLink;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement userName;

    @FindBy(xpath = "(//input[@type='email'])[1]")
    public WebElement yourEmailAddress;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement password;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement iAgreeToThePrivacyPolicy;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signUp;

    @FindBy(xpath = "//a[.='Please log in.']")
    public WebElement pleaseLogIn;

    @FindBy(xpath = "//p[.='An account is already registered with that username. Please choose another.']")
    public WebElement pleaseChooseAnother;

    @FindBy(linkText = "Sign Out")
    public WebElement signOut;

    @FindBy(id = "reg_username")
    public WebElement userNameBox;

    @FindBy(id = "reg_email")
    public WebElement yourEmailBox;

    @FindBy(id = "reg_password")
    public WebElement passWordBox;

    @FindBy(id = "register-policy")
    public WebElement checkBox;

    @FindBy(name = "register")
    public WebElement SignInBox;

    @FindBy(xpath = "//button[@name='register']")
    public WebElement signUpButton;

    @FindBy(xpath = "//a[@class='login logout inline-type']")
    public WebElement singOutLink;

    // interactWithElements metodu, her bir elementle etkileşime geçer.
    public void interactWithElements() {
        interactWithElement(signUpButton, "signUpButton");
        interactWithElement(singOutLink, "signOutLink");
    }

    //interactWithElement metodu, belirli bir elementle etkileşime geçmeye çalışır ve
    // StaleElementReferenceException hatasını yakalar ve yeniden dener.
    private void interactWithElement(WebElement element, String elementName) {
        boolean successful = false;
        for (int i = 0; i < 5; i++) {
            try {
                element.click();
                successful = true;
                System.out.println(elementName + " clicked successfully.");
                break; // İşlem başarılı olduğunda döngüden çık
            } catch (StaleElementReferenceException e) {
                System.out.println("StaleElementReferenceException caught for " + elementName + ". Retrying... (" + (i + 1) + "/5)");
                try {
                    Thread.sleep(1000); // 1 saniye bekle ve tekrar dene
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }

        if (!successful) {
            System.out.println("Failed to interact with " + elementName + " after 5 attempts.");
        }
    }

}






















