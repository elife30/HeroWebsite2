Feature: complete form feature

  Background:
    Given user is navigated to formy application




  Scenario Outline: click desired linkName1
    Then user clicks on desired link "<Link_Name>"
    Then user fills out complete form
      | elife | mert | QA | 2022 | student |
    Then user close the browser

    Examples:
      | Link_Name    |
      | Complete Web Form|



  Scenario Outline: click desired linkName2
    Then user clicks on desired link "<Link_Name>"
    Then user fills out complete form with header
      | FirstName | lastname | jobtitle |
      | elife     | Joy       | qa      |
      | emre      | jan        | datasience    |
    Then user close the browser

    Examples:
      | Link_Name    |
      | Complete Web Form|
