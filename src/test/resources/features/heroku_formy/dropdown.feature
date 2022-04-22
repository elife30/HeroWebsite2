Feature: Drop down feature
  Background:
    Given user is navigated to formy application


  Scenario Outline: click to display DropDown
    Then user clicks on desired link "<Link_Name>"
    Then user cliks on dropdown button
    Then user clicks displayed to dropdown




    Then user close the browser
    Examples:
      | Link_Name    |
      | Dropdown|
