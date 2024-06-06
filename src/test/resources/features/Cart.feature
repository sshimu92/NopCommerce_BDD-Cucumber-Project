@Cart
Feature: Cart Feature
  As a user i want to add or remove from the cart

  @positive
  Scenario: Adding item to the cart
    Given User already open the website nopcommerce
    When User input "shawon.shimu@yahoo.com" as Email "uN6P@NS7AEp8yz" as Password
    Then User click on Electronics
    And User click on Cell phones
    And User clicking "Nokia Lumia 1020" into a cart
    Then User clicking "HTC One Mini Blue" into a cart
    And User should be able to see "Nokia Lumia 1020" and "HTC One Mini Blue" on Shopping Cart
    
    

  #@negative
  #Scenario Outline: Remove item from the cart
    #Given User input "shawon.shimu@yahoo.com" as Email "uN6P@NS7AEp8yz" as Password
    #When User clicking "Build your own computer" into a cart
    #And User navigating to Shopping cart page
    #Then User remove all item from Shopping cart