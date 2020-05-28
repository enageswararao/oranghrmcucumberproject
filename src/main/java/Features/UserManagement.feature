Feature: Search user under user management 
  
@test
Scenario: serach user under user management
#	Given load the Orange HRM application url
#	When Enter the user name in Username textbox     
#	And Enter the Password in Password Textbox
#	And Click on Login Button
#	Then Verify the message,"Welcome Admin"
	When user click on admin link
	When user on add user button
	And use enters the employee name as "Linda Anderson"
	And user enters the user name as "Test for QA"
	And user enters the password as "admin12345678"
	And user enters the confirm password as "admin12345678"
	And user click on save button
	
	