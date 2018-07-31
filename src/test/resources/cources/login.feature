Feature: Check logins
  Scenario: Checking addresses
    Given i go to 'https://www.delivery-club.ru/'
    When i login
    Then i see my account