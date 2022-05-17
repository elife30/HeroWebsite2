package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class CommonMethods {

    //object creation  bos
    public static WebDriver driver;



    public static void openBrowserAndLaunchApplication() {

        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);


        switch (ConfigReader.getPropertyValue("browser")) {
            case "chrome":
//                WebDriverManager.chromedriver().setup();
//                driver = new ChromeDriver();
//                break;
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setHeadless(true);
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver(chromeOptions);

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");

        }

        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }


    public static void goToWebsite(String WebsiteName) {

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get(WebsiteName);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }





    //for secound url.

    public static void openBrowserAndLaunchFormyApplication() {

        ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
        switch (ConfigReader.getPropertyValue("browser")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name");
        }

        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("formyUrl"));
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }


    public static void closeBrowser() throws InterruptedException {

        //kapanmadan once gorelim diye thread ekledik.driver common methoddan geliyor.driverin quitini kullandik
        // close da var ama onu  kullanmiyoruz genelde.
        Thread.sleep(3000);
        driver.quit();


    }



}
