Feature: Login Orange HRM application
 As a test engeneer to validate login functionality of the Orange HRM application with all the combinations
  
@test
Scenario: Login Orange HRM application with Valid cradentials
	Given load the Orange HRM application url
	When Enter the user name in Username textbox     
	And Enter the Password in Password Textbox
	And Click on Login Button
	Then Verify the message,"Welcome Admin"
	
	@test
Scenario: Login Orange HRM application with Valid cradentials
	Given load the Orange HRM application url
	When Enter the user name in Username textbox     
	And Enter the Password in Password Textbox
	And Click on Login Button
	Then Verify the message,"LoginFailed"