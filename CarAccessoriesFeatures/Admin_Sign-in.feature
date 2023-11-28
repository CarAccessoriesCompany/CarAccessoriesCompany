Feature: Administrator sign-in
	sign-in should be quick and friendly
	Actor: Administrator
	
	# First Scenario
	Scenario: Successful sign-in for admin
		The admin should enter a valid email and valid password
		
		Given The admin is on the sign-in page
		When The admin entered a valid email "validadmin@gmail.com" and a valid password "correctpassword"
		Then The admin sign-in succeeded

		
		# Second Scenario
		Scenario: The admin enters an invalid email
			
			Given The admin is on the sign-in page
			When The admin enters the invalid email "invalidadmin@gmail.com"
			Then The admin should stay on the sign-in page
		
		# Third Scenario	
		Scenario: The admin enters an incorrect password
			
			Given The admin is on the sign-in page
			When The admin enters valid email "validemil@gmail.com" and incorrect password "incorrectpassword"
			Then The admin should stay on the sign-in page
		
		
		# Fourth Scenario
		Scenario: The admin leaves the password field empty
			
			Given The admin is on the sign-in page
			When The admin enters the email "validadmin@gmail.com" and leave the password field empty
			Then The admin should stay on the sign-in page
			
			
			
			
			
		
		
		
		