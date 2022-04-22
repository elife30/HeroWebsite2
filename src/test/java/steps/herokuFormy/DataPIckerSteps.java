package steps.herokuFormy;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;


public class DataPIckerSteps extends CommonMethods {

    @When("user clicks on datepicker button")
    public void user_clicks_on_datepicker_button() {

        WebElement Datepickerbutton =driver.findElement(By.xpath("/html/body/div/div/li[4]/a"));
        Datepickerbutton.click();


    }


    @Then("user cliskc on  datepicker form")
    public void userCliskcOnDatepickerForm() {
        WebElement Datepickerform = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        Datepickerform.click();

    }

    @Then("user choses date on table")
    public void userChosesDateOnTable() throws InterruptedException {

        WebElement Datepickerform = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        Datepickerform.sendKeys("01/01/2000");
        Datepickerform.click();
        Thread.sleep(1000);

    }
}
