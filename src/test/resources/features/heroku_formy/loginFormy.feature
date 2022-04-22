Feature: loginFormyPage feature

  Background:
    Given user is navigated to formy application

  Scenario: click desired link

    When user login formy homepage  app
    Then user clicks on desired link

    Then user close the browser

  Scenario Outline: click desired linkName

    When user login formy homepage  app
    Then user clicks on desired link "<Link_Name>"

    Then user close the browser
    Examples:
      | Link_Name    |
      | Autocomplete |
      | Modal |


  #ex:
#  Scenario Outline: eating
#
#    Given there are <start> cucumbers
#    When I eat <eat> cucumbers
#    Then I should have <left> cucumbers
#
#    Examples:
#      | start | eat | left |
#      |    12 |   5 |    7 |
#      |    20 |   5 |   15 |