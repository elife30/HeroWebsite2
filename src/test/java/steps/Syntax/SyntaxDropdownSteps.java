package steps.Syntax;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class SyntaxDropdownSteps extends CommonMethods {


//    @Given("user  is open browser and navigates to webpage")
//    public void     user_is_open_browser_and_navigates_to_webpage() {
//
//        goToWebsite("https://syntaxprojects.com/basic-select-dropdown-demo.php");
//    }
//

    @Given("open Syntax")
    public void openSyntax() {
        goToWebsite("https://syntaxprojects.com/basic-select-dropdown-demo.php");
    }

    @Then("user select  a day")
    public void user_select_a_day() throws InterruptedException {

        WebElement SelectBtn =driver.findElement(By.xpath("//*[@id=\"select-demo\"]"));
        SelectBtn.click();
        Select select =new Select(SelectBtn);
        select.selectByIndex(5);
        Thread.sleep(2000);




    }



}
