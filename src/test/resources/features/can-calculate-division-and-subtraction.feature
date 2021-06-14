
Feature: Can calculate division and multiplication correctly?
To test whether division and multiplication return the correct results.

  
  Scenario: 3 and 9 is 3
    Given a calculator
    When 3 is divided from 9
    Then the result should be 3

 	Scenario: 3 multiplied by 3 is 9
    Given a calculator
    When 3 is multiplied by 3
    Then the result should be 9
   
