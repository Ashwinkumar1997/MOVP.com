Feature: PIM

Scenario: Add a new user
Given User launch Chrome browser
When User opens url "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login"
And User enters Username as "Admin" and Password as "Qedge123!@#"
And click on Login
Then Page title should be displayed
When User click Add Employee button
Then Add employee page should be displayed
When user enters firsname as "Sachin" and lasname as "Ghode"
And enter employee id as "0892"
And click on save button
Then New user should be created successfully
And close the browser