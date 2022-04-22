Feature:Drag and Drop Feature
  Background:
    Given user is navigated to formy application


  Scenario Outline: Drag and Drop ability

    Then user clicks on desired link "<Link_Name>"

    Then user  Drag the image into the box

    Then user close the browser

    Examples:
      | Link_Name    |
      | Drag and Drop|