package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GlbHomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class SubscriptionStepDefs {
    GlbHomePage glbHomePage = new GlbHomePage();

    @Given("user is on glbtrader home page")
    public void user_is_on_glbtrader_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("glbtrader_home_url"));
    }

    @Given("user inputs {string} in subscription textbox")
    public void user_inputs_in_subscription_textbox(String string) {
        glbHomePage.subcription.sendKeys(string);
    }

    @Given("user clicks on Subscribe button")
    public void user_clicks_on_Subscribe_button() {
        glbHomePage.subcribeButton.click();
    }

    @Then("verify subscription success message")
    public void verify_subscription_success_message() {
        Assert.assertEquals(glbHomePage.subcriptionMessage.getText(),ConfigurationReader.getProperty("subs_success_message"));
    }
}
