package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.WebTablePage;
import utilities.Driver;

import java.util.List;

public class tablehandle_stepdef {
    WebTablePage wtp = new WebTablePage();

    @Given("user is on web table page")
    public void user_is_on_web_table_page() {
        Driver.getDriver().get("http://demo.guru99.com/test/web-table-element.php");
    }

    @Then("user prints the Company and Current Price\\(Rs) of the first row")
    public void user_prints_the_Company_and_Current_Price_Rs_of_the_first_row() {
        System.out.println("First row company name: " + wtp.getCellValue(1,1));
        System.out.println("First row current price: " + wtp.getCellValue(1,4));
    }

    @Then("user prints the number of rows and columns")
    public void userPrintsTheNumberOfRowsAndColumns() {
        System.out.println("Number of rows in the table: " + wtp.getNumOfRows());
        System.out.println("Number of columns in the table: " + wtp.getNumOfCols());
    }

    @Then("user verifies that the table has {string}")
    public void userVerifiesThatTheTableHas(String arg0) {
        boolean flag = false;
        List<WebElement> allCells = Driver.getDriver().findElements(By.tagName("td"));
        for (WebElement cell : allCells){
            if (cell.getText().equals(arg0)){
                flag = true;
                break;
            }
        }
        Assert.assertTrue(flag);
        System.out.println(arg0 + " company is in the table.");
    }
}
