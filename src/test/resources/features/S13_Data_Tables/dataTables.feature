Feature: Data Tables

  @S13
  Scenario: Add multiple items to the shopping cart
    Given I go to the webshop
    And I open the "All products" page
    When I add these products to my shopping cart:
      | Hummingbird printed t-shirt |
      | Mug The best is yet to come |
      | Mountain fox cushion        |
    Then I have 3 products in my shopping cart

    @S13
  Scenario: Add multiple items to the shopping cart
    Given I go to the webshop
    And I open the "All products" page
    When I add this amount of products to my shopping cart:
      | Product                     | Amount |
      | Hummingbird printed t-shirt | 2      |
      | Mug The best is yet to come | 3      |
      | Mountain fox cushion        | 4      |
    Then I have 9 products in my shopping cart