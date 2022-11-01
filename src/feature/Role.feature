Feature: Role Creation functionality

Scenario Outline: Verify Role creation with Multiple sets od Data

Given Tester Should on Ranford Home Page

When Tester Enters Admin Login Details

Then Tester Click on Role button

When Tester Click on New role and enter "<RoleName>" and "<RoleType>"

Then Tester Close the Application

Examples:

    | RoleName | RoleType |
    | GenManager | E |
    | AsstManager | E |
    | Manager | E |