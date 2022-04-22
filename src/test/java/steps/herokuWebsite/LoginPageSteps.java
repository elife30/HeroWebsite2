package steps.herokuWebsite;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.CommonMethods;
import utils.ConfigReader;

import java.util.concurrent.TimeUnit;

public class LoginPageSteps extends CommonMethods {

    @Then("user clicks  Form Authentication link")
    public void user_clicks_form_authentication_link() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[21]/a")).click();

       // Thread.sleep(2000);
    }

    @And("user verify login page title")
    public void user_verify_loginpage_title() {

        String actual_title = "Login Page";
        String expected_title = driver.findElement(By.xpath("//*[@id=\"content\"]/div/h2")).getText();
        Assert.assertEquals(actual_title, expected_title);
    }


    @Then("user enters username and password")
    public void userEntersUsernameAndPassword() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(ConfigReader.getPropertyValue("username"));
        //Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(ConfigReader.getPropertyValue("password"));

       // Thread.sleep(2000);


    }

    @Then("user clicks on login button")
    public void userClicksOnLoginButton() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"login\"]/button/i")).click();
        Thread.sleep(1000);
    }

    @Then("user close the browser")
    public void userCloseTheBrowser() throws InterruptedException {

        closeBrowser();
    }


}
