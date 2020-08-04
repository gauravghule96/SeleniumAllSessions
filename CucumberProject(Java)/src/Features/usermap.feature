Feature: add user creation 
Scenario: JavaByKiran login addusers page creation scenario 

	Given login page already login 
	When user enter username and password and click on loginbtn 
		| username | password |
		| kiran@gmail.com | 123456 |
		
	Then user on homepage click on user link 
	Then user click on Add User button 
	Then enter add user page details and click on submit bt 
		| usernames | email            | mobile  | courses  | passwords |
		| rameshgg  | ramesh@gmail.com | 9999999 | java     | 123456    |
		| rajurato  | raju@gmail.com   | 9999999 | java22   | 1234556   |
		| dinesh    | dinesh@gmail.com | 9999999 | selenium | 120000    |
		
	Then Close the browser