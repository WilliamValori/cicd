Feature: Alternative text

  @S10
  Scenario: Home page displays sale carrousel
    Given I go to the homepage
    Then the sale carrousel is displayed

  @S10
  Scenario: Home page displays sale carrousel
    Given I go to the frontpage
    Then the sale carrousel is displayed

  @S10
  Scenario: Home page displays sale carrousel
    Given I go to the entrypage
    Then the sale slideshow is displayed

  @S10
  Scenario: Home page displays sale carrousel or slideshow
    Given I go to the homepage
    Then the sale slideshow is displayed
