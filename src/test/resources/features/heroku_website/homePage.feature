Feature: homePage feature




  Background:
    Given user is navigated to heroku application

  @smoke @regression
  Scenario: verification title
    When user login homepage  app
    Then user verify homepage title
    Then user close the browser


    # When user enters valid admin username and password
#    And user clicks on login button
#    Then admin user is successfully logged in
