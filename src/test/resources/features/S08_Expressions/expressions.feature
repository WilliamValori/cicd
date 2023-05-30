Feature: Regular expressions and Cucumber expressions

  @S08
  Scenario: Explanation Cucumber Expression
    Given I look at the clock
    Then the CE clock will show 11:30 PM

  @S08
  Scenario: Explanation Regex
    Given I look at the clock
    Then the RE clock will show 12:59 PM

  @S08
  Scenario: Limit user options
    Given I login as user Henk
    When I set my country code to NL
    And I change my cellphone number to 0612345678

  Scenario: S08_01_cucumber-expression
    Given I look at the thermostat
    Then the temperature is 9.5°C


  Scenario: S08_02_regular_expression
    Given I live in Utrecht
    Then my zipcode is 1234AB