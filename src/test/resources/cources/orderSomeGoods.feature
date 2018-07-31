Feature: Order some goods
  Scenario: Checking my box
    Given i go to all restaurants at 'https://www.delivery-club.ru/'
    When i select 1st shop
    And i order 2 goods
    And i open my box
    Then i see goods selected by me moment ago