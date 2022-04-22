Feature: complete web234

  Background:
    Given user is navigated to formy application


  Scenario Outline: click desired linkName3
    When user login formy homepage  app
    Then user clicks on desired link "<Link_Name>"
    Then user fills level of education
    Then user close the browser

    Examples:
      | Link_Name    |
      | Complete Web Form|
