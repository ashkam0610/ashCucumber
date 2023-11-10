#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Bookcart Application Test


  Scenario: Login should be success
    Given User navigate to the BookCart application
    And User clicks on the login button
    And User enter the username as ortoni
    And User enter the password as ashwin
    When User click on the login button
    Then Login should be success

  #@tag2
  #Scenario: Login should be success
    #Given User navigate to the BookCart application
    #And User clicks on the login button
    #And User enter the username as ortoni
    #And User enter the password as Pass12
    #When User click on the login button
    #But Login should fail
