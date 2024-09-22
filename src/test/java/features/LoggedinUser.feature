Feature: LoggedIn User
  As a logged in user
  I want to be able to see my profile
  So that I can see my information

  Scenario: Validade user is ale to view afer login
    Given User navigates to the login page
    When User sucessfully logs in
    Then User sucessfully be able to view product category page