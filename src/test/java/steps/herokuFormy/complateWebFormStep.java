package steps.herokuFormy;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class complateWebFormStep extends CommonMethods {
    @Then("user fills level of education")
    public void user_fills_level_of_education() throws InterruptedException {

//
//        List<WebElement> btnText =  driver.findElements(By.xpath("/html/body/div/form/div/div[4]/div")); //4 text
//        List<WebElement> educationbtn =  driver.findElements(By.xpath("/html/body/div/form/div/div[4]/div/input"));
//
//        for (int i = 0; i <educationbtn.size() ; i++) {
//            System.out.println(btnText.get(i+1).getText());
//            if(btnText.get(i+1).getText().equalsIgnoreCase("Grad School")){
//                educationbtn.get(i).click();
//            }
//        }
//
//        Thread.sleep(1000);
//        //educationbtn.get(1).click();

        clickRadioButtons("High School");

    }


    public void clickRadioButtons(String name) throws InterruptedException {
        List<WebElement> btnText =  driver.findElements(By.xpath("/html/body/div/form/div/div[4]/div")); //4 text
        List<WebElement> educationbtn =  driver.findElements(By.xpath("/html/body/div/form/div/div[4]/div/input"));

        for (int i = 0; i <educationbtn.size() ; i++) {
            System.out.println(btnText.get(i+1).getText());
            if(btnText.get(i+1).getText().equalsIgnoreCase(name)){
                educationbtn.get(i).click();
            }
        }

        Thread.sleep(1000);

//        fillAutoCompletMethod("Kizilay","Bagcilar","Turkiye");
//        fillAutoCompletMethod("Bahcesheri","Bagcilar","Turkiye");
//        fillAutoCompletMethod("Kizilay","Bagcilar","Turkiye");
//        fillAutoCompletMethod("Kizilay","Bagcilar","Turkiye");
//        fillAutoCompletMethod("Kizilay","Bagcilar","Turkiye");

    }


    public void fillAutoCompletMethod(String address, String Streetaddress, String state)  {
        List<WebElement> autoCompleteList =  driver.findElements(By.xpath("/html/body/div[1]/form/div/div/input")); //7 t

        autoCompleteList.get(0).sendKeys(address);
        autoCompleteList.get(1).sendKeys(Streetaddress);



    }



}