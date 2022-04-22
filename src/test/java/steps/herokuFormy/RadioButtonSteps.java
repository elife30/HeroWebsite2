package steps.herokuFormy;

 import Pages.HomePage_pages;
import io.cucumber.java.en.Then;
import utils.CommonMethods;

public class RadioButtonSteps extends CommonMethods {

//objcet creation to use on whole page
    public HomePage_pages homePage = new HomePage_pages();


    @Then("user verifies each radio buttons")
    public void userVerifiesEachRadioButtons() throws InterruptedException {

       homePage.clickLink("Radio Button");


    }


    @Then("user clicks {int}")
    public void userClicks(int num) throws InterruptedException {
        homePage.clickRadioButtonk(num);

    }


}
