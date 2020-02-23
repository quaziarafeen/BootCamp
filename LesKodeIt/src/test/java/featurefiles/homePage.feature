Feature: LetsKodeIt HomePage

  Background: LetsKodeIt HomePage
    Given I am at Letskodeit Homepage

#  Scenario 1
  Scenario: Test Practice Button
    Given I click on PracticeButton
    Then I Close Browser
#  Scenario 2
  Scenario:Test Select ClassBar
    Given I Select ClassBar
    Then I Close Browser
#  Scenario 3
  Scenario:Test Click Radio Button
    Given I am clicking on radio button
    Then I Close Browser
#  Scenario 4
  Scenario: Test Select Class Example
    Given I am clicking on drop down button
    And I am selecting Benz
    Then I Close Browser
#  Scenario 5
  Scenario: Test Multiple Select Example
    Given I am selecting Apple And Orange
    Then I Close Browser
#  Scenario 6
  Scenario: Test Checkbox Example
    Given I am Testing checkbox By Selecting BMW
    Then I Close Browser
#  Scenario 7
  Scenario: Test Switch Window Example
    Given I click on open new window
    And I close the new window
#    Then I Close Browser
#  Scenario 8
  Scenario: Test Switch Tab Example
    Given I click on open new Tab
    And I close the new tab
#    Then I Close Browser
#  Scenario 9
  Scenario: Test Alert Confirm Button Ok
    Given I click on Confirm button
    And I Accept The Alert
    Then  I Close Browser
#  Scenario 10
  Scenario: Test Alert Confirm Button Cancel
    Given I Cancel The Alert
    Then I Close Browser
#  Scenario 11
  Scenario: Test Web Table Example
    Given I Have to get text from web table in the Console
    Then I Close Browser
#  Scenario 12
  Scenario: Test Mouse Hover
    Given I mouse hover into mouse hover webElement
    Then I Close Browser
#  Scenario 13
  Scenario: Test iFrame Example
    Given I get the iFrame
    And I search PNT
    And I Clear The SearchBar
    Then I Close Browser




