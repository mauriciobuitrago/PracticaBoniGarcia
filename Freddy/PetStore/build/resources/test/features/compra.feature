Feature: Purchase

  Scenario: Buy pets
    Given open Url pets
    When user selects products and makes purchase
    Then successful purchase