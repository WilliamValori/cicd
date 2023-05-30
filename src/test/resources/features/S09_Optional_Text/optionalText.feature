Feature: Optional text to increase readability

  @S09
  Scenario: Mugs amount on receipt is correct
    Given I login as user Henk
    When I purchase 2 mugs
    Then the receipt will show I have purchased 2 mugs

  Scenario: Mug purchase receipt is correct
    Given I login as user Henk
    When I purchase 1 mug
    Then the receipt will show I have purchased 1 mug