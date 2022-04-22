Feature: Links feature
  
  Scenario: take all links 

    Given  user  is open browser and navigates to webpage "https://www.ebay.com/"
    Then finding all links with <a> tag
    Then  user close the browser