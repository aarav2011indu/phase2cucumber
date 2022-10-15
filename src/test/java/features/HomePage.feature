Feature: HomePage Feature Scenario

  Background: 
    Given I have launched the application

  Scenario: This scenario is to define the Add to cart
    When I enter the correct Username as "standard_user" and Passowrd as "secret_sauce"
    And I click on the Login Link
    And I should land on the home page
    And I click on the Add to cart button  for product Sauce Labs Backpack
    Then your cart  should be 1
