Feature: Step definition overloading

  @S11
  Scenario: Feel the rhythm
    Given You are happy and you know it
    And I'm happy and I know it
    When I really want to show it
    Then we're happy and we know it

  Scenario: Overloading with unmatched arguments
    Given you clap your hands 2 times
    And I clap 2 hands 1 times
    When "four" more people with all 2 hands clap 4 times
    Then we're happy and we know it