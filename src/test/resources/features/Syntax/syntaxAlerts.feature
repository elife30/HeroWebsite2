Feature:Alerts  check
  Scenario: handle alerts
    Given user  is open browser and navigates to webpage "http://syntaxprojects.com/javascript-alert-box-demo.php"
    Then verify alert
    Then user close the browser
  