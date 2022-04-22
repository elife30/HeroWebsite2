package steps.ebay.EbayLinks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.List;

public class EbayLinkStep extends CommonMethods {


    @Then("finding all links with <a> tag")
    public void finding_all_links_with_a_tag() {

        List<WebElement> links = driver.findElements(By.tagName("a"));
        //System.out.print(links);
        //bu sekilde istersen ham linklerin yazilisini elde edersin bu da senin hic isine yaramaz .
        // yazdirmak istersen getTExt,size gibi methodlari kullanmalisin
        //sadece for loop ile tum linkleri aldik ama data temiz degil cok bosluk ve link disinda seyler var
        //if ile bosluk olmayani istedik
        //get atribute ile de href tag sayesinde linkleri aldik.
        System.out.println(links.size());
        for (WebElement link : links) {

            String linktext = link.getText();

            if (!linktext.isEmpty()) {
               System.out.println(linktext);
                String linkAdress = link.getAttribute("href");
                System.out.println(linkAdress);

            }


        }
    }
}
//             hepsine tiklamak istersen
//    List<WebElement els = driver.findElements(By.xpath("//input[@type='checkbox']"));
//for ( WebElement el : els ) {
//        if ( !el.isSelected() ) {
//        el.click();
//        }
//        }