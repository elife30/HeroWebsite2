Feature: loginPage feature

  Background:
    Given user is navigated to heroku application

  Scenario: verify login succesfull
    When user login homepage  app

    And user clicks  Form Authentication link
    Then user verify login page title
    Then user enters username and password
    Then user clicks on login button

    Then user close the browser