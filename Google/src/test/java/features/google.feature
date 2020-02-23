Feature: Google Home

  Background: Google HomePage
    Given I am at "https://www.google.com/"

  Scenario: search on Google
    Given I search "PeopleNTech"
    Then I close Browser

  Scenario Outline: Multiple Search on Google
    Given I search value <value>
    Examples:
      | value        |
      | "Robi"         |
      | "GrammenPhone" |
      | "TeleTalk"     |
    Scenario: Search from DataBase
      Given I am Searching from DataBase
      Then I close Browser
