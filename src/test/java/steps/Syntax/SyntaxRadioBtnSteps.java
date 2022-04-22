package steps.Syntax;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class SyntaxRadioBtnSteps extends CommonMethods {


    @Given("user open browser for radio")
    public void user_open_browser_for_radio() {

        goToWebsite("https://syntaxprojects.com/basic-radiobutton-demo.php");

    }
    @Given("user click on radio btn")
    public void user_click_on_radio_btn() throws InterruptedException {

        WebElement Radibtn =driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input"));
        Radibtn.click();
        driver.findElement(By.xpath("//*[@id=\"buttoncheck\"]")).click();
        Thread.sleep(3000);
        boolean displayed = Radibtn.isDisplayed();
        boolean isenabled= Radibtn.isEnabled();
        boolean isselected = Radibtn.isSelected();
        System.out.println(isenabled  +" "+  isselected );
//        System.out.println(displayed + isenabled1 );


    }
}

