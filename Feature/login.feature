Feature: Login functionality
  Scenario: Valid user login
    Given the user is on the login page
    When the user enters valid credentials
    Then the user should be redirected to the homepage
    And the user should see a welcome message
