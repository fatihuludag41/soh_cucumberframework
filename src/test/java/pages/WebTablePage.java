package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class WebTablePage {

    public WebTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public String getCellValue(int row, int col){
        String path = "//table/tbody/tr["+row+"]/td["+col+"]";
        WebElement cell = Driver.getDriver().findElement(By.xpath(path));
        return cell.getText();
    }

    public int getNumOfRows(){
        List<WebElement> rows = Driver.getDriver().findElements(By.xpath("//table/tbody/tr"));
        return rows.size();
    }

    public int getNumOfCols(){
        List<WebElement> cols = Driver.getDriver().findElements(By.xpath("//table/thead/tr/th"));
        return cols.size();
    }
}
