package team04_AlloverCommerceTestNG.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import team04_AlloverCommerceTestNG.utilities.Driver;

public class P21_FakeMailPage {

    public P21_FakeMailPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "email")
    public WebElement fakeEmail;

    @FindBy (xpath = "(//*[@fill='#5F6368'])[1]")
    public WebElement reklamClosedButton;

    @FindBy (xpath = "//td[contains(text(),'[Allover Commerce]')]")
    public WebElement verificationCodeMail;

    @FindBy (tagName = "b")
    public WebElement verificationCode;
    @FindBy (css = "a[title='Delete this email address']")
    public WebElement deleteButton;
}
