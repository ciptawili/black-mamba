Feature: test

  Background:
    * url testUrl


  Scenario: Assertion Total
    * def responseData =
    """
    {
      "name": #string,
      "orderNumber": #string,
      "courier": #string,
      "product": [
          {
              "item": #string,
              "price": #number
          },
          {
              "item": #string,
              "price": #numbe
          },
          {
              "item": #string,
              "price": #numbe
          }
          ],
      "total": #integer.
      "code": #string,
      "success": #boolean
      }
    }
    """
    Given path 'exam'
    And param orderNumber = '76542019'
    When method get
    Then status 200
    And match response contains any responseData
    * match response.total != '20000000'
    * match response.total == '52000000'
    * match response.total == #integer
    * match response.total != #string
