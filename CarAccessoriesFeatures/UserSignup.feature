Feature: User Sign-Up
	Sign-up should be friendly
	Actor: User
	
	 # First Scenario
	 Scenario: User successfully signs up with valid information 
		
		 Given User in the sign-up page
		 When The user their valid email address "newuser@gmail.com" and password "userpassword"
		 Then The user signs up success
		
	 # Second Scenario
	 Scenario: The user sign-up with an existing email address
	 
		 Given User in the sign-up page
		 When The user enters an existing email address "existinguser@gmail.com"
		 Then The user should stay on the sign-up page
		
	 # Third Scenario
	 Scenario: The user leaves the password field empty
		
		 Given User in the sign-up page
		 When The user enters the email address "useremail@gmail.com" and leaves the password field empty
		 Then The user should stay on the sign-up page
			
#	 # Fourth Scenario
#	 Scenario: The user leaves the email field empty
#		
#		 Given The user in the sign-up page
#		 When The user enters the password "userpassword" and leaves the email address field empty
#		 Then The user should stay on the sign-up page 
			
	 # Fifth Scenario
	 Scenario: User enters a weak password
	 		
	 	 Given User in the sign-up page
	 	 When The user enters a valid email address "useremail@gmail.com" and a weak password "weak"
	 	 Then The user should stay on the sign-up page
	 	 
	 	 # Sixth Scenario
	 	 Scenario: User enters an invalid email address
	 	 
	  	 Given User in the sign-up page
		   When The user enter an invalid email address "invalidemail" and password "userpassword"
		   Then The user should stay on the sign-up page
	 	 
	 	 
	 
	 	
			
			
			
			