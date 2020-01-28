Feature: Sign In
  I want to login to application with my credentails
  In order to use the application features.

  Background: User navigates to Application URL
    Given I am on the Login page URL "https://www.facebook.com/"

  @smoke
  Scenario: Sign In with valid credential
    When I enter username as "mani"
    And I enter password as "password"
    And click on login button
    Then I sould see application homepage

  @sanity
  Scenario Outline: Sign In with valid credentials
    When I enter username as "<userName>"
    And I enter password as "<password>"
    And click on login button
    Then I sould see application homepage

    Examples: 
      | userName | password |
      | admin1   | password |
      #| admin2   | password |
      #| admin3   | password |
