Feature: Register

  Scenario: User register
    Given open Url and register user in login
    When user into data register
    Then register successfull
