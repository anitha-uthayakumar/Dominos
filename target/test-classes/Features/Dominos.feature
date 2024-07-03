  Feature: To test Dominos Application
  Scenario: To order pizza from Dominos
    Given To open the browser for Dominos application
    When To Click on Order Now
    And To Select Area or Locality 
    And To Go to Veg Pizza section
    And To select MArgherita Pizza with Quantity
    Then To Validate margherita pizza with quantity
    And To select Peppy Panneer with Quantity
    Then To Validate Peppy panneer with Quantity
    And To Select Gourmet Pizza with Quantity
    Then To Validate Goument Pizza with Quantity
    Then To Check SubTotal value of Pizzas
    
 