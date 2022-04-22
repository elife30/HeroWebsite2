package steps.herokuFormy;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class DropDownSteps extends CommonMethods {
    @Then("user cliks on dropdown button")
    public void user_cliks_on_dropdown_button() {
        WebElement dropdown_button =driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]"));
        dropdown_button.click();



    }

    @Then("user clicks displayed to dropdown")
    public void userClicksDisplayedToDropdown() {

        //sor bu kismini
       // WebEldriver.findElements(By.xpath("/html/body/div/div/div/a"))
      //  Select select = new Select(dropdown_button);





    }
}