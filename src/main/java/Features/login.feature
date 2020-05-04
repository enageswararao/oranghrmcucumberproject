Feature: Orage HRM login feature
@test
Scenario: Login into Orange HRM  Application
 
Given user is already on Login page 
When user enter username
And user enter password
And user click Login button
Then verify profile icon
