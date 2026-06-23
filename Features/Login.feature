Feature: Login

Scenario: Successfull Login with valid credentials
Given User launch Chrome browser
When User opens url "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login"
And User enters Username as "Admin" and Password as "Qedge123!@#"
And click on Login
Then Page title should be displayed
When User click on logout button
Then Page title login should be displayed
And close the browser

Scenario Outline: Successfull Login with diffrent data
Given User launch Chrome browser
When User opens url "http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login"
And User enters Username as "<Username>" and Password as "<Password>"
And click on Login
Then Page title should be displayed
When User click on logout button
Then Page title login should be displayed
And close the browser

Examples:
| Username | Password |
| Admin | Qedge123!@# |
| Admin | Qedge |
| Suresh | Qedge123!@# |
| Gandec | Qedge2345 |
 
