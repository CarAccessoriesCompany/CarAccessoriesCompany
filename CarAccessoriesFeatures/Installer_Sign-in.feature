Feature: Installer sign-in
	sign-in should be quick and friendly
	Actor: Installer
	
	# First Scenario
	Scenario: Successful sign-in for Installer
		The Installer should enter a valid email and valid password
		
		Given The installer is on the sign-in page
		When The installer entered a valid email "validInstaller@gmail.com" and a valid password "correctpassword"
		Then The installer sign-in succeeded

		
		# Second Scenario--
		Scenario: The installer enters an invalid email
			
			Given The installer is on the sign-in page
			When The installer enters the invalid email "invalidInstaller@gmail.com"
			Then The installer should stay on the sign-in page
		
		# Third Scenario	
		Scenario: The Installer enters an incorrect password
			
			Given The installer is on the sign-in page
			When The installer enters valid email "validemil@gmail.com" and incorrect password "incorrectpassword"
			Then The installer should stay on the sign-in page
		
		
			
			
			
			
		
		
		
		