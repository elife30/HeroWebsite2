Feature: Radio feature

  Background:
    Given user is navigated to formy application

  Scenario Outline: click radio button

    When user login formy homepage  app
#    Then user clicks on desired link "<Link_Name>"
    Then user verifies each radio buttons
    Then user clicks <radioButton>


    Then user close the browser
    Examples:
      | Link_Name    | radioButton |
      | Radio Button | 1           |
