
@Register
Feature: Register
 As a user i want register to nopcommerce

  @positive
  Scenario: Resgister with valid data
    Given user already open the website nopcommerce
    When user click on Register button
    Then user select female as gender
    And user input "Shawon" as First Name "Shimu" as Last Name
    Then user input "shawon.shimu@yahoo.com" as Email
    And  user input "uN6P@NS7AEp8yz" as Password
    Then user confirm "uN6P@NS7AEp8yz" as Password
    Then user click on "REGISTER" button  

  