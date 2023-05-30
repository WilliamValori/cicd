Feature: As a user I want to log into my personal account page

Rule: A user should only be able to login with correct credentials

  @Smoke @MyAccount @BackGround
  Scenario: Existing user logs in with correct credentials
    Given I am on the homepage
    And My account is activated
    And I am currently not logged into the site
    When I log into my personal account
    Then I should be taken to my profile page

  @Smoke @MyAccount @BackGround
  Scenario: Existing user logs in with incorrect credentials
    Given I am on the homepage
    And My account is activated
    And I am currently not logged into the site
    When I log into my personal account with faulty credentials
    Then I should get an credentials not valid prompt

  @Smoke @MyAccount @BackGround
  Scenario: Existing user logs in with incorrect credentials
    Given I am on the homepage
    And My account is activated
    And I am currently not logged into the site
    When I log into my personal account with expired credentials
    Then I should be taken to a reset password page

