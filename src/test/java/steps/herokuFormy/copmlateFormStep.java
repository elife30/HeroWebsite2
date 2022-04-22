package steps.herokuFormy;

import Pages.Complate_pages;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;


public class copmlateFormStep extends CommonMethods {

    @Then("user fills out complete form")
    public void user_fills_out_complete_form(DataTable complateForm) throws InterruptedException {

        List<String> expectedMenu=complateForm.asList();

        Complate_pages ca = new Complate_pages();
        ca.firstname.sendKeys(expectedMenu.get(0));
        ca.lastname.sendKeys(expectedMenu.get(1));
        ca.jobtitle.sendKeys(expectedMenu.get(2));
        Thread.sleep(3000);


    }

    @Then("user fills out complete form with header")
    public void userFillsOutCompleteFormWithHeader(DataTable complateForm2) throws InterruptedException {


        List<Map<String,String>> fillform = complateForm2.asMaps();
      //  System.out.println(fillform);

//        System.out.println(fillform.get(0).get("FirstName"));
//        System.out.println(fillform.get(1).get("FirstName"));

        Complate_pages ca = new Complate_pages();
        ca.firstname.sendKeys(fillform.get(0).get("FirstName"));
        ca.lastname.sendKeys(fillform.get(0).get("lastname"));
        ca.jobtitle.sendKeys(fillform.get(0).get("jobtitle"));
        Thread.sleep(3000);

        ca.firstname.clear();
        ca.lastname.clear();
        ca.jobtitle.clear();

        ca.firstname.sendKeys(fillform.get(1).get("FirstName"));
        ca.lastname.sendKeys(fillform.get(1).get("lastname"));
        ca.jobtitle.sendKeys(fillform.get(1).get("jobtitle"));

        Thread.sleep(3000);

    }
}
