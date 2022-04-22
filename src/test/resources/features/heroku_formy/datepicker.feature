Feature:Date Picker

  Background:
    Given user is navigated to formy application


  Scenario: click desired date

   When user clicks on datepicker button
    Then user cliskc on  datepicker form
    Then user choses date on table

    Then user close the browser


  Scenario Outline: click desired date2

    Then user clicks on desired link "<Link_Name>"

    Then user close the browser
    Examples:
      | Link_Name    |
      | Datepicker |