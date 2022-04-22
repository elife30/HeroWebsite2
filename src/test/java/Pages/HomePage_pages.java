package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.ArrayList;
import java.util.List;

public class HomePage_pages extends CommonMethods {



    //store as a list
    List<WebElement> links =driver.findElements(By.xpath("/html/body/div[1]/div/li/a"));

    List<WebElement> radiobuttons =driver.findElements(By.xpath("/html/body/div/div/input"));




    // store individaual
    WebElement buttonLink = links.get(1);
//    WebElement radiobutton1 = radiobuttons.get(0);
//    WebElement radiobutton2 = radiobuttons.get(1);
//    WebElement radiobutton3 = radiobuttons.get(2);


    public void clickRadioButtonk(int num) throws InterruptedException {
        System.out.println(radiobuttons);
        Thread.sleep(1000);
        radiobuttons.get(num).click();
        Thread.sleep(2000);
    }



    // methods
    public void clickButtonLink(int i) throws InterruptedException {
        buttonLink.click();
        Thread.sleep(2000);
    }

    //dynamic methods ve reusable methods
    public void clickLink(String name) throws InterruptedException {

        List<WebElement > linksName = new ArrayList<>();
        for (int i = 0; i <links.size(); i++) {
            linksName.add(links.get(i));
            if(linksName.get(i).getText().contains(name)){
                linksName.get(i).click();
                Thread.sleep(1000);
                break;
            }
        }

    }











}
