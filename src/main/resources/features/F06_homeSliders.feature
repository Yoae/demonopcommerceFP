@smoke
  Feature: Users could click on sliders
    Scenario: Users can click on slider GalaxyS22 and get redirected to sliders page
      Given user clicks on slider "1"
      Then  user gets redirected to sliders page "https://demo.nopcommerce.com/nokia-lumia-1020"

    Scenario: Users can click on slider Iphone and get redirected to sliders page
      Given user clicks on slider "0"
      Then  user gets redirected to sliders page "https://demo.nopcommerce.com/iphone-6"