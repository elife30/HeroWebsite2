Feature:


  #burada syntaxin sitesinden de dropdownu denemek istedim.siteyi yazmakta kafam karsiti
  #keyword yazarken open browseri kullansam hata veriyor.methodu baska bir grubun icine mi yazmaliyim?burada yeniden mi tanimlamaliyim?
  Scenario: dropdown testing
   Given user  is open browser and navigates to webpage "https://syntaxprojects.com/basic-select-dropdown-demo.php"
   # Given open Syntax
    Then user select  a day
    Then user close the browser

