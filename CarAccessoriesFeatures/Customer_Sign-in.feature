Feature: Customer sign-in
	sign-in should be quick and friendly
	Actor: Customer
	
	# First Scenario
	Scenario: Successful sign-in for customer
		The customer should enter a valid email and valid password
		
		Given The customer is on the sign-in page
		When The customer entered a valid email "validcustomer@gmail.com" and a valid password "correctpassword"
		Then The customer sign-in succeeded

		
		# Second Scenario
		Scenario: The customer enters an invalid email
			
			Given The customer is on the sign-in page
			When The customer enters the invalid email "invalidcustomer@gmail.com"
			Then The customer should stay on the sign-in page
		
		# Third Scenario	
		Scenario: The customer enters an incorrect password
			
			Given The customer is on the sign-in page
			When The customer enters valid email "validemil@gmail.com" and incorrect password "incorrectpassword"
			Then The customer should stay on the sign-in page
		
		
		# Fourth Scenario
		Scenario: The customer leaves the password field empty
			
			Given The customer is on the sign-in page
			When The customer enters the email "validcustomer@gmail.com" and leave the password field empty
			Then The customer should stay on the sign-in page
			
			
			
			
			
		
		
		
		