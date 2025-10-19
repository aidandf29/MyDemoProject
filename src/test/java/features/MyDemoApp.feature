
Feature: Validate cart update flow in My Demo App

  Scenario: User adds product to cart with specific quantity
    Given the user launches the application
    And he selects product "Sauce Lab Back Packs"
    When he increases quantity to 2 and adds it to cart
    Then the cart should display quantity 2
    And the product "Sauce Lab Back Packs" should be shown in cart
