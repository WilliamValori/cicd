Feature: Smoke check for cucumber test framework

  @smoke
  Scenario: Selenium is able to navigate webshop
    Given I go to the webshop
    When I go to the fruit page
    Then there is a banana for scale