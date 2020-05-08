package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.GlbtraderRegistrationPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class glbtraderregistration_stepdef {
    GlbtraderRegistrationPage glbtraderRegistrationPage = new GlbtraderRegistrationPage();

    @Given("user is on glbtrader registration page")
    public void user_is_on_glbtrader_registration_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("glbtrader_registration_url"));
    }

    @Given("user enters email {string}")
    public void user_enters_email(String string) {
        glbtraderRegistrationPage.email.sendKeys(string);
    }
    @Given("user enters name {string}")
    public void user_enters_name(String string) {
        glbtraderRegistrationPage.name.sendKeys(string);
    }
    @Given("user enters mobile {string}")
    public void user_enters_mobile(String string) {
        glbtraderRegistrationPage.mobile.sendKeys(string);
    }
    @Given("user enters password {string}")
    public void user_enters_password(String string) {
        glbtraderRegistrationPage.password.sendKeys(string);
    }
    @Given("user confirms password {string}")
    public void user_confirms_password(String string) {
        glbtraderRegistrationPage.confirm.sendKeys(string);
    }
    @Then("user clicks on signup button")
    public void user_clicks_on_signup_button() {
        glbtraderRegistrationPage.signUpButton.click();
    }
    @Then("verify Success message")
    public void verify_Success_message() {
        Assert.assertTrue(glbtraderRegistrationPage.message.getText().contains("Success"));
    }
}
