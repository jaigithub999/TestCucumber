Feature: To validate search functionality

  Scenario Outline: To validate search functionality using relevant products
    Given user launch floto application
    When user click search icon
    And user enter relevant "<productname>" and click search icon
    Then user see search results page and relevant products

    Examples:
    |productname|
    |Bagss|
    |Shrit|
    |Wallet|