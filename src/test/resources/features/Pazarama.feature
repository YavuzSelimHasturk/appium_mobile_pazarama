Feature: Pazarama mobil app test
@wip
  Scenario: Adding products to cart

    Given User opens the Pazarama mobile app
    And Reaches the homepage by skipping preview pages
    Then Verify that the app opens correctly
    And Tap on "Categories" tab from the sub tabs
    And Choose the "Mobile Phone and Accessories"
    And Search by typing "Samsung" in the search box
    And The first one of the results is added to the cart
    And Verify that the product has been added to the cart




