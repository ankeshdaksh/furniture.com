Feature: As a user I want to login made.com
  and want to see all the features
  @kaialsh
  Scenario Outline: Add to cart items  from each category
    Given user is on home page
    When He looks for a Product in "<productTitle>"
    And selects a product from "<subCategory>" and add to cart
    Then item should be in basket
    Examples:
      | productTitle | subCategory        |
      | NEW          | New In Living Room |

  @smoke
  Scenario: user wants to Refer friends to get the discount
    Given user is on home page
    When he navigate to invite friend and
    Then he can see the message














