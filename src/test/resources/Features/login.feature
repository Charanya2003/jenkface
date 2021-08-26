Feature: To validate the login functionality of facebook app

  Background: 
    Given The user should be in facebook page

@sanity
  Scenario: To validate login functionality with invalid data
    When The user has to fill username and password
    And Click the login button
    Then user should be in invalid page

@smoke
  Scenario: To validate the registration functionality
    When The user has to fill firstname and lastname
    And The user should click the signup button
    Then The user successfully registered

@retest
  Scenario: To validate login functionality1 with invalid data
    When The user has to fill username "vijay" and password "1234"
    Then user should be in invalid page again
