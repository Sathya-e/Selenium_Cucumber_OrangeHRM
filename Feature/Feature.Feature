Feature: OrangeHRM Login
  Scenario: Logo presence on OrangeHRM Homepage
    Given I launch in chrome browser
    When I open OrangeHRM Homepage
    Then I verify the logo present on the page
    And close Browser
    

  Scenario: Login to OrangeHRM with valid credentials
    Given I launch in chrome browser
    When I open OrangeHRM Homepage
    And Enter username and password
    And click on login button
    Then user must successfully login to the Dashboard page
    And close Browser