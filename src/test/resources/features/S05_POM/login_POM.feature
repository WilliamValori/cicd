Feature: As a user I want to log into my personal account page

Rule: After a user logs in, the profile page should always be the first page visible

  @S05 @Smoke @MyAccount @POM
  Scenario: Existing user logs in
    Given I am on the homepage
    When I log into my personal account
    Then I should be taken to my profile page
