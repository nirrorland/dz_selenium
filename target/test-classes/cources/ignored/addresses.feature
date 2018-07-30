Feature: Check some text at search result pare
  Scenario: Checking addresses
    Given i go to 'https://www.delivery-club.ru/'
    When i enter address
    Then i see vendor in result
      |Москва, Шарикоподшипниковская улица, 17|TacoLand|
      |Москва, 3-я Институтская улица, 12|Нияма|
      |Москва, Багратионовский проезд, 7к3|Сити Пицца|