# new feature
# Tags: optional

Feature: Login Test

  @Positive
  Scenario: Open Feature Setting
    Given Open Store Page
    When Buy the product
    And Click button feature setting
    Then Modal feature setting has displayed

  @Positive
  Scenario: Buy Product With Virtual Account
    Given Open Store Page
    When Buy the product
    And Fill form buyer and go to checkout page
    And Choose bank transfer payment and choose bank
    Then Success buy product

  @Negative
  Scenario: Buy Product With Empty Data Customer
    Given Open Store Page
    When Buy the product
    And Delete all data order
    Then Error message showed

  @Negative @test
  Scenario: Cancel buy product
    Given Open Store Page
    When Buy the product
    And Fill form buyer and go to checkout page
    And Cancel buying product
    Then Store Page is Displayed