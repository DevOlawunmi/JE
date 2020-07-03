Feature: Search Restaurants with my Postcode
  As a customer
  I want the ability to search for restaurants around me
  So that I can know the food options available

  Background:
    Given I navigate to Just Eat website

  Scenario Outline: Customer can search for restaurants with postcode
    When I enter my "<postcode>"
    And I click on the search button
    Then all the restaurants within my "<postcode>" are displayed
    And I click on one of the restaurants currently open

    Examples:
      |postcode|
      |M40 0GE|