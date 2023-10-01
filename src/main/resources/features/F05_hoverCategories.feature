@smoke
  Feature: F05_hoverCategories | user could hover over the categories
    Scenario: user hovers a category and selects an option
      Given user hovers over a category
      When  user clicks on subcategory
      Then  subcategory page appears with the title containing subcategory name
