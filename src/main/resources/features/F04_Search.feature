@smoke

  Feature: F04_Search | user could search for products
    Scenario Outline: user could search using product name
      Given user search by products name or sku as "<name>"
      When  user clicks on search button
      Then  product page is displayed with "<name>" in the results
      Examples:
        |name|
        |book|
        |laptop|
        |nike|

    Scenario Outline: user could search using product sku
      Given user search by products name or sku as "<name>"
      When  user clicks on search button
      And   user clicks on product
      Then  product page is displayed with products sku as "<name>"
      Examples:
        |name|
        |SCI_FAITH|
        |APPLE_CAM|
        |SF_PRO_11|
