Feature: As a user I want to log into my personal account page

Rule: After a user logs in, the profile page should always be the first page visible

  @S02 @Smoke @MyAccount @Nightly
  Scenario: Existing user logs in
    Given as a user I am on the homepage
    When I log into my personal account as a user
    Then I should be taken to my profile page as a logged in user
