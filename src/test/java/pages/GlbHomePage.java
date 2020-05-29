package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GlbHomePage {
    public GlbHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name = "email")
    public WebElement subcription;

    @FindBy(name = "submit")
    public WebElement subcribeButton;

    @FindBy(xpath = "//*[@class=\"alert alert-success\"]")
    public WebElement subcriptionMessage;

    @FindBy(xpath = "//*[@class=\"img-responsive\"]")
    public WebElement tabletPicture;

}
