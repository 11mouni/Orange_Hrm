Feature: Orange_Hrm
Scenario: Login Orange_Hrm
Given I am in the home page
And Give User_Name
And Give Passwd
And ClickLogin

Scenario: HomePage
Given homePage display
And clickok onAlert
And 