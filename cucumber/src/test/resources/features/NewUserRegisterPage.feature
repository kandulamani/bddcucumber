Feature: Register Operation
  I want to Register to application with my credentails
  In order to use the application features.

  Background: User navigates to Application URL
    Given I launch application with "http://automationpractice.com/index.php"

  @Register
  Scenario Outline: Register with valid credential
    When I click on sign in link
    Then I verify create an account page is displayed
    And I enter new email address
    #And I click on Create an account button
    #And I select Mr radio button
    #And I enter first name as "<First name>"
    #And I enter last name as "<Last name>"
    #And I enter random email address
    #And I enter random password
    #And I select date of birth
    #And I enter password as "<password>"
    #And click on login button
    #And I enter first name as "<First name>"
    #And I enter last name as "<Last name>"
    #And I enter Company name as "<Company>"
    #And I enter Address as "<Address>"
    #And I enter Address2 as "<Address2>"
    #And I enter City as "<City>"
    #And I enter State as "<State>"
    #And I enter Postal Code as "<Postal Code>"
    #And I select Country
    #And I enter Home Phone as "<Home Phone>"
    #And I enter Mobile Phone as "<Mobile Phone>"
    #And I enter alias name as "<alias Name>"
    #When I click on Register button
    #Then I verify Registration is success

    Examples: 
      | First name | Last name | password | Company | Address | Address2 | City | State     | Home Phone | Mobile Phone | alias Name |
      | admin1     | password  | mani123  | Demo1   | Hyd     | Nizampet | HYD  | Telangana |      12345 |       998545 | mani1      |
      | admin2     | password  | mani123  | Demo2   | Hyd     | Nizampet | HYD  | Telangana |      12345 |       998545 | mani2      |
      | admin3     | password  | mani123  | Demo3   | Hyd     | Nizampet | HYD  | Telangana |      12345 |       998545 | mani3      |
