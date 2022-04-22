package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;



public class Complate_pages extends CommonMethods {



    //store as a list
    public WebElement firstname =driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
    public WebElement lastname =driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
    public WebElement jobtitle =driver.findElement(By.xpath("//*[@id=\"job-title\"]"));





















}
