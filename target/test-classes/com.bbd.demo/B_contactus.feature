Feature: Send contact message
  In order to contact the administrator 
  As a customer 
  I want to send a contact message to administrator

  Scenario: Send contact message to administrator
    Given I am on the home page
    When I navigate to contact page
    And I fill in form with data
    And I submit my information
    Then I get confirmation message
