Feature: As a user I want to subscribe to the newsletter

Rule: User should be able to subscribe to the newsletter with a valid email address

  @S05 @Smoke @NewsLetter @POM
  Scenario: Subscribe with valid email address
    Given I am on the homepage
    When I subscribe to the news letter with a valid email address
    Then I should be shown a successfully subscribed confirmation
