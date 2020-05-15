package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GlbProductPage {
    public GlbProductPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@onclick=\"addwishlist('132','1574');\"]")
    public WebElement addToWishlist;

    @FindBy(id = "alert_messages_show")
    public WebElement login_message;

}
