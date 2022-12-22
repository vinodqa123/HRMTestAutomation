Feature: Verify Login feature
 
  Background: Verify login with valid credenitals
    Given User is on Login page
    When User entered UserName & password 
    Then User should be on Home Page   
   
 Scenario Outline: Verify Add Employee
    Given User is on Dashboard page
    When Navigate to PIM Menu
    Then Verify User should be on PIM Menu
    When Navigate to Add Employee menu 
    Then User should be on Add Employee page
    When Enter Employee first Name "<FirstName>" & last name "<lastName>"
    And Enter Employee ID: "<EmpID>"
    And Upload the Employee profile
    And Click on Save button
    Then Verify Employee details saved or not
    Then navigate to Employee List menu
    When Enter Employee Name in search
    And Click on Search Button
    Then Verify employee details displaying or not in grid 
    
    Examples:
    |FirstName|lastName|EmpID|
    |Jack    |   |180  |
  