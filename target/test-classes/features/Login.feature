
@Login
Feature: Login
  As a user i want login to nopcommerce

  @positive
  Scenario: Login with valid credential
    Given user already open the website nopcommerce
    When user click on Log in button
    Then user input "shawon.shimu@yahoo.com" as Email "uN6P@NS7AEp8yz" as Password
    And user click on LOG IN button
    Then user already on homepage
    

  #@negative 
  #Scenario Outline: Login with invalid credential
    #Given user already open the website nopcommerce
    #When user input "<email>" as Email "<password>" as Password
    #Then user get error "<error>" as error message
#
    #Examples: 
      #| email                   | password      | error                                                               |
      #|                         |               |Epic sadface: Email is required                                      | 
      #|shawon.shimu@yahoo.com   |               |Epic sadface: Password is required                                   |
      #|                         |uN6P@NS7AEp8yz |Epic sadface: Email is required                                      |
      #|shawon.shimu@yahoo.com   |uN6P@NS        |Epic sadface:Email and Password do not match any user in this service|