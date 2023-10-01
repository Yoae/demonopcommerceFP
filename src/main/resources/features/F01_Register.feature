@smoke
  Feature: F01_Register | users could register with new accounts
    Scenario: guest user could register with valid data successfully
      Given user go to register page
      When  user selects gender type
      And   user enters first name "atumation" and last name "tester"
      And   user enters birth of date
      And   user enters email "test@example.com" field
      And   user fills Password fields "P@ssw0rd""P@ssw0rd"
      And   user clicks on register button
      Then  success message is displayed