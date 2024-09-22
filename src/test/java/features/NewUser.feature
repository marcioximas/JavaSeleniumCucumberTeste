Feature: New User view
  As a logged in user
  I want to be able to see my profile
  So that I can see my information

  Scenario: Validade new user is ale to view after click on register
    Given User navigates to the login page
    When User clicks on new Registration button
    Then User should be able to view the Registration page