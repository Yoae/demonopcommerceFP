@smoke
  Feature: users can wishlist products
    Scenario: user wishlist "HTC One M8 Android L 5.0 Lollipop"
      Given user wishlists HTC One M8 Android L 5.0 Lollipop
      Then  success message is displayed for wishlist

    Scenario: verify users wishlisted products are in the wishlist page
      Given user wishlists HTC One M8 Android L 5.0 Lollipop
      When  success message dissapears
      And   user goes to wishlist page
      Then  Qty is bigger than "1"