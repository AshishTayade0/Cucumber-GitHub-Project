Feature: Ensure that the GitHub HomePage is working as expected

  Background:
    Given User is on GitHub HomePage

  @SmokeTest
  Scenario: To verify that the all header WebElements are available on GitHub HomePage
    When User is able see Product button
    And User is able see Solutions button
    And User is able see Resources button
    And User is able see Open Source button
    And User is able see Enterprise button
    And User is able see Pricing button
    And User is able see SearchBar button
    And User is able see Sign-In button
    And User is able see Sign-Up button

  @RegressionTest
  Scenario Outline: To verify the user is not able to login with multiple fake credentials
    When User click on Sign-In button from HomePage
    And User enters username as <Username>
    And User enters password as <Password>
    And User click on SignIn Button
    Then User gets error message

    Examples:
      | Username  | Password |
      | testuser1 | name_1   |
      | testuser2 | name_2   |
      | testuser3 | name_3   |










