package steps.herokuWebsite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class HomePageSteps extends CommonMethods {

    @Given("user is navigated to heroku application")

    public void user_is_navigated_to_hrms_application() {

        openBrowserAndLaunchApplication();
    }



    @When("user login homepage  app")
    public void user_login_homepage_app() {
       String actual_url= ConfigReader.getPropertyValue("url");
        String expected_url = driver.getCurrentUrl();
        Assert.assertEquals(actual_url,expected_url);

    }
    @Then("user verify homepage title")
    public void user_verify_homepage_title() {

        String actual_title = "The Internet";
        String expected_title = driver.getTitle();


        Assert.assertEquals(actual_title,expected_title);


    }


}
