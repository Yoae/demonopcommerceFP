@smoke
  Feature: F03_currencies | prices changes after user selects different currency
    Scenario: user changes to euro
      Given user changes currency to euro
      Then  all prices changes to euro