Feature: Verify Login feature
 
  Background: Verify login with valid credenitals
    Given User is on Login page
    When User entered UserName & password 
    Then User should be on Home Page   
   
 Scenario: Verify Add Employee
    Given User is on Dashboard page
    When Navigate to PIM Menu
    Then Verify User should be on PIM Menu
    When Navigate to Add Employee menu 
    Then User should be on Add Employee page
    When Enter Employee first Name & last name
    And Enter Employee ID
    And Upload the Employee profile
    And Click on Save button
    Then Verify Employee details saved or not
    Then navigate to Employee List menu
    And Verify employee details displaying or not in grid
    