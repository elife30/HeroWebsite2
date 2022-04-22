package steps.amazon;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;
import utils.ConfigReader;

import java.util.concurrent.TimeUnit;

public class AmazonDropDownSteps extends CommonMethods {


    @Given("user amazon")
    public static void userAmazon() {

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // driver.findElement("").getAttribute();


    }
//    @Given("user  is open browser and navigates to webpage {string} ")
//    public void     user_is_open_browser_and_navigates_to_webpage(String url) {
////        String url ="https://www.amazon.com/";
//        goToWebsite(url);
//    }


    @Given("user  is open browser and navigates to webpage {string}")
    public void user_is_open_browser_and_navigates_to_webpage(String url) {
        goToWebsite(url);
    }



    @When("user clicks All button and select")
    public void user_clicks_all_button_and_select() throws InterruptedException {
       WebElement clickAllbtn = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
        clickAllbtn.click();
        Select select = new Select(clickAllbtn);
        select.selectByVisibleText("Health, Household & Baby Care");

       // [select.getFirstSelectedOption]
        WebElement webElementopt = select.getFirstSelectedOption();
        System.out.println(webElementopt.getText());


        Thread.sleep(2000);

       // System.out.preintln(clickAllbtn.getText());

    }

    @Then("user clicks search button")
    public void user_clicks_search_button() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
        Thread.sleep(1000);
    }











}
//        WebDriverManager.chromedriver().setup();
//       driver= new ChromeDriver();
//
//
//       // WebDriver driver = new ChromeDriver() ;
////        WebDriver driver =new ChromeDriver();
////        driver = new ChromeDriver();
//
//       // WebDriver driver = new ChromeDriver() ;
//        driver.get("https://www.amazon.com/");
// driver.quit();

// goToWebsite("https://www.browserstack.com/guide/drag-and-drop-in-selenium");


