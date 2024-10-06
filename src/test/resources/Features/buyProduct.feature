Feature: feature test login functionality

  Scenario Outline: Check Login is successful with valid credentials

    Given User is on LoginPage
    When User enters username and password
    And Click on login button
    Then User is navigated to the homepage

    Examples:
      | username             | password       |
      | efmlolipop@gmail.com | Kevinunited42! |
