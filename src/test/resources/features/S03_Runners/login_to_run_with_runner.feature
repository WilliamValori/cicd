Feature: As a user I want to log into my personal account page

Rule: After a user logs in, the profile page should always be the first page visible

  @S03 @Smoke @MyAccount @Runner
  Scenario: Existing user logs in
    Given the user is on the homepage
    When the user logs into his personal account
    Then the user should be taken to his profile page as a logged in user
