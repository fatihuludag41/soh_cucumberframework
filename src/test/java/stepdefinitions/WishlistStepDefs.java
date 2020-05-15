package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GlbHomePage;
import pages.GlbProductPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class WishlistStepDefs {
    GlbHomePage glbHomePage = new GlbHomePage();
    GlbProductPage glbProductPage = new GlbProductPage();

    @Given("user clicks on iPad pro image unser Todays deals")
    public void user_clicks_on_iPad_pro_image_unser_Todays_deals() {
        glbHomePage.tabletPicture.click();
    }

    @Given("user clicks on add to wishlist")
    public void user_clicks_on_add_to_wishlist() {
        glbProductPage.addToWishlist.click();
    }

    @Then("verify error message")
    public void verify_error_message() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(glbProductPage.login_message));
        Assert.assertEquals(glbProductPage.login_message.getText(), ConfigurationReader.getProperty("please_login_message"));
    }
}
