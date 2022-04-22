package steps.Syntax;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class SyntaxAlertStep extends CommonMethods {

    @Then("verify alert")
    public void verify_alert() throws InterruptedException {


        WebElement alertbtn = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button"));
        alertbtn.click();
        String actualtext = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println(actualtext);


        Thread.sleep(2000);

        String expectedtext = "I am an alert box!";

        Assert.assertEquals(actualtext, expectedtext);
        System.out.println("Assert passed");



    }


}
