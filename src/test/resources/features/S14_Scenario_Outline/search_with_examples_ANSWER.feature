Feature: As user I want to search for specific items

Rule: specific search queries should return correct results

  @S14 @Examples @ScenarioOutline
  Scenario Outline: Search for "<ProductName>"
    Given I am on the homepage
    When I search a product called "<ProductName>"
    Then at least one "<ProductName>" should appear in the results

    Examples:
      | ProductName |
      | mug         |
      | orange      |
      | Sweater     |
      | Cushion     |
      | Vector      |

