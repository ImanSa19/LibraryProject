Feature: As user I want to be able to login under different roles

  Scenario: Login as a Librarian
    Given user is on the login page
    When user logs in user should see dashboard page
