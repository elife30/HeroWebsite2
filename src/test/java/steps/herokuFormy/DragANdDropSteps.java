package steps.herokuFormy;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;

public class DragANdDropSteps extends CommonMethods {
    @Then("user  Drag the image into the box")
    public void user_drag_the_image_into_the_box() throws InterruptedException {

        //WebElement on which drag and drop operation needs to be performed
        WebElement fromElement = driver.findElement(By.xpath("//*[@id=\"image\"]/img"));

        //WebElement to which the above object is dropped
        WebElement toElement = driver.findElement(By.xpath("//*[@id=\"box\"]"));

//Creating object of Actions class to build composite actions
        Actions builder = new Actions(driver);

//Building a drag and drop action
       Action dragAndDrop = builder.clickAndHold(fromElement)
                .moveToElement(toElement)
                .release(toElement)
                .build();

//Performing the drag and drop action

       dragAndDrop.perform();

        Thread.sleep(1000);


    }



}
