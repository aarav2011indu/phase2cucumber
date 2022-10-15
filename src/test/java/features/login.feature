Feature: Login Feature Scenario

  Background: 
    Given I have launched the application
    

@sanity
  Scenario: This sceanrio is to define the failure path
    When I enter the incorrect Username as "abc@xyz.com" and Passowrd as "Test@1234"
      And I click on the Login Link
    Then I should get the error message "Epic sadface: Username and password do not match any user in this service"

  Scenario: This scenario is to define the login happy path
    When I enter the correct Username as "standard_user" and Passowrd as "secret_sauce"
      And I click on the Login Link
    Then I should land on the home page
