Feature: Using yandex search

  Scenario: Search "qwerty"
    Given Open 'https://yandex.ru/'
    When write word 'qwerty' into search bar
    And  click search button
    Then The page with search-result has loaded completely

  Scenario: Search "Yaroslavl"
    Given Open 'https://yandex.ru/'
    When write word 'Yaroslavl' into search bar
    And  click search button
    Then Check yandex map is visible