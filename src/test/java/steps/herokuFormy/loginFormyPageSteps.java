package steps.herokuFormy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

import java.util.ArrayList;
import java.util.List;

public class loginFormyPageSteps extends CommonMethods {

    @Given("user is navigated to formy application")
    public void userIsNavigatedToFormyApplication() {

        openBrowserAndLaunchFormyApplication();

    }


    @When("user login formy homepage  app")
    public void userLoginFormyHomepageApp() {
        String actual_url = ConfigReader.getPropertyValue("formyUrl");
        String expected_url = driver.getCurrentUrl();
        Assert.assertEquals(actual_url, expected_url);

    }

    @Then("user clicks on desired link")
    public void userClicksOnDesiredLink() throws InterruptedException {
        //locatorlari store icin kullandik
        List<WebElement> links = driver.findElements(By.xpath("/html/body/div[1]/div/li/a"));
        //bos!!!! locatorlarin textlerini depolamak icin kullandik.
        List<WebElement> linksName = new ArrayList<>();

//        for (String linkName:linksName) {
//            linksName.add(links.get(0).getText());
//
//        }

        //bos listin icini doldurdu add methodu ile.
        for (int i = 0; i < links.size(); i++) {
            linksName.add(links.get(i));
            System.out.println(linksName.get(i).getText());

            //if ile aradigimiza tikladi
            if (linksName.get(i).getText().contains("Checkbox")) {

                linksName.get(i).click();
                Thread.sleep(3000);
                break;


            }

        }


//        linksName.get(0).click();
        Thread.sleep(2000);


    }

    @Then("user clicks on desired link {string}")
    public void userClicksOnDesiredLink(String linkname) throws InterruptedException {

        List<WebElement> links = driver.findElements(By.xpath("/html/body/div[1]/div/li/a"));
        //bos!!!! locatorlarin textlerini depolamak icin kullandik.
        List<WebElement> linksName = new ArrayList<>();

//        for (String linkName:linksName) {
//            linksName.add(links.get(0).getText());
//
//        }

        //bos listin icini doldurdu add methodu ile.
        for (int i = 0; i < links.size(); i++) {
            linksName.add(links.get(i));
            //if ile aradigimiza tikladi
            if (linksName.get(i).getText().contains(linkname)) {
                linksName.get(i).click();
                Thread.sleep(1000);
                break;

            }


        }
    }


}
