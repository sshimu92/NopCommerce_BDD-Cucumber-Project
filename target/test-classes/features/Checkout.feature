
@Checkout
Feature: Checkout feature
  As a user i want to checkout items from Shopping cart

  @positive
  Scenario: Checkout items from Shopping cart
    Given User already open the website nopcommerce
    When User input "shawon.shimu@yahoo.com" as Email "uN6P@NS7AEp8yz" as Password
    Then User click on Electronics
    And User click on Cell phones
    And User clicking "Nokia Lumia 1020" into a cart
    Then User clicking "HTC One Mini Blue" into a cart
    #And User click on Close notification 
    And User navigating to cart page
    Then User already on "Shopping cart" as cart page
    And User select "No" as Gift wrapping option
    And User verifying total item and total price
    And User click on Terms of service option
    Then User click on CHECKOUT button
    Then User navigate to Billing address page
    And User input "Shawon" as First name "Shimu" as Last name
    Then User input "shawon.shimu@yahoo.com" as Email
    And User select "United States" as Country Name
    #And User select "Oregon" as State
    Then User input "Corvallis" as City
    Then User input "1540 crystal rd" as Address 1
    And User input "85333" as Zip code
    And User input "23546689" as Phone number
    Then User click on CONTINUE button
    Then User verify Checkout page
    And User click on Ground ($0.00)option
    Then User click on CONTINUE button
    Then User click on Check Money Order as payment option
    And User click on CONTINUE button
    Then User again click on CONTINUE button
    And User verify Checkout complete page
    And User click on CONFIRM button
    And User should be able to see "Your order has been successfully processed!" message
    When User again click on CONTINUE button
    Then User navigate to Home page
    
    

    
    
    
    
    
    

  