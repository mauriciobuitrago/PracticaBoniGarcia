Feature: Login

  Scenario: Login successfull
    Given open Url and user  login
    When user into data successfull
    Then login successfull

  Scenario: Login Unsuccesssfull
    Given open Url and user  login
    When user into data Unsuccesssfull
    Then login Unsuccesssfull

  Scenario: login without user
    Given open Url and user  login
    When does not enter user
    Then login Unsuccesssfull

  Scenario: login without password
    Given open Url and user  login
    When does not enter password
    Then login Unsuccesssfull