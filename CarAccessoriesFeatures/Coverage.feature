Feature: coverage
###############User edits
  
  Scenario: Successful setCustomerInformation
    Given the user has a old email and password
    When the user wants to edit his email and password
    Then the user should be successfully edited his email and password
    
    Scenario: Successful set Installer Information
    Given the Installer has a old email, password, username and avalibilty
    When the Installer wants to edit his email, password, username and avalibilty
    Then the Installer should be successfully edited his email, password, username and avalibilty
    
    Scenario: Successful set Customer Information
    Given the Customer has a old password and Phone number
    When the Customer wants to edit his password and Phone number
    Then the Customer should be successfully edited his password and Phone number
    
    Scenario: when Admin want to edit and get some information about product 
    Given the admin in dashboard
    When the admin wants to edit and get some information about product 
    Then the admin should be successfully edited information about product 
    
    Scenario: Admin User
    Given a valid email address for an admin
    When the user ID is checked
    Then the result should be true

  Scenario: Customer User
    Given a valid email address for a customer
    When the user ID is checked
    Then the result should be true

  Scenario: Installer User
    Given a valid email address for an installer
    When the user ID is checked
    Then the result should be true

  Scenario: Invalid Email Type
    Given an invalid email address
    When the user ID is checked
    Then an invalid email type exception should be raised

  Scenario: Non-Admin, Non-Customer, Non-Installer
    Given an email address that does not belong to an admin, customer, or installer
    When the user ID is checked
    Then the result should be false

    
    Scenario: Verify user ID for a valid email
    Given a valid email address "user@example.com"
    When the user ID is checked
    Then the result should be true

  Scenario: Verify user ID for an invalid email
    Given an invalid email address "invalid-email"
    When the user ID is checked
    Then the result should be false

  Scenario: Verify user ID for a non-matching email
    Given a valid email address "user@example.com"
    And the user ID is checked for a different email "another.user@example.com"
    Then the result should be false
    
    
   
   
#############  Product Information

  Scenario: Get product username
    Given a product with a username
    When I retrieve the username
    Then the username should be the expected value

  Scenario: Get product customer email
    Given a product with a customer email
    When I retrieve the customer email
    Then the customer email should be the expected value

  Scenario: Get product name
    Given a product with a name
    When I retrieve the product name
    Then the product name should be the expected value

  Scenario: Get product price
    Given a product with a price
    When I retrieve the product price
    Then the product price should be the expected value

  Scenario: Set product status
    Given a product with a status
    When the status is updated to "In Stock"
    Then the product status should be "In Stock"

  Scenario: Set product status to an empty string
    Given a product with a status
    When the status is updated to an empty string
    Then the product status should be an empty string

  Scenario: Set product status to null
    Given a product with a status
    When the status is updated to null
    Then the product status should be null    
    
    
#############  add product
	Scenario: Add product
		Given i have array with products
		When i add product
		Then the product shoud add successfuly
    
    #############  add category
	Scenario: Add category
		Given i have array with categorys
		When i add category
		Then the category shoud add successfuly
		
		 #############  add appointment
	Scenario: Add appointment
		Given i have array with appointments
		When i add appointment
		Then the appointment shoud add successfuly
		
		 #############  add order
	Scenario: Add order
		Given i have array with orders
		When i add order
		Then the order shoud add successfuly
		#############  get order
		Scenario: get order
		Given i have array with orders
		When i wnat to get order information
		Then the order shoud back the info successfuly
		
		######## print adminMenu
		Scenario: print adminMenu
		Given the admin is logged in
		When admin join to main
		Then he should see menu
		
		######## print admindashboard
		Scenario: print admindashboard
		Given the admin is logged in
		When admin join to main then enter admin dashboard
		Then he should see dashboard
		
		Scenario: admin edit an product
		Given the admin is logged in
		When admin join to main then enter admin dashboard and chose to "Edit" an product
		Then he should see menu of what he want to edit 
		
		Scenario: admin print categories
		Given the admin is logged in
		When admin join to main then enter admin dashboard and chose to see categories
		Then he should see list of categories
		
		Scenario: admin print users
		Given the admin is logged in
		When admin join to main then enter admin dashboard and chose to see users
		Then he should see list of users
		
		
    
    
    ######## print customerMenu
		Scenario: print customer Menu
		Given the customer is logged in
		When customer join to main
		Then he should see customer menu
		
		Scenario: customer edit his own informations
		Given the customer is logged in
		When customer join to his profile then choose to change his information like username, password and telephone
		Then he should see success msg
		
		########  customer serach for specfic product
		Scenario: customer serach for specfic product
		Given the customer is logged in
		When customer join to main then enter browse product then enter the name of product and which category
		Then he should see the product
		
		
		####### add product after buy to customer list
		Scenario: add product after buy to customer list
		Given the customer is logged in
		When the customer want to buy product he enter product name
		Then the product ad to his list success
		
		
		##### find customer
			Scenario: find customer
			Given the admin is logged in
			When admin enter customer name
			Then he should see success its found msg
			
			##### find installer
			Scenario: find installer
			Given the admin is logged in
			When admin enter installer name
			Then he should see success its found installer msg
			
			##### add request
			Scenario: add Request
			Given the customer is logged in
			When the customer bought a product
			Then he should add request
			
			##### add request to installer
			Scenario: add Request to installer
			Given the customer is logged in
			When the customer bought a product then enter confirm command
			Then the request adds to installer
			
			##### check date avalability
			Scenario: check if date is empty
			Given the customer is logged in
			When the customer bought a product then enter date is taken
			Then he should see is taken msg
			
			
		####  find product
			Scenario: find product
			Given the admin or customer is logged in
			When admin or customer enter product name
			Then he should see success its found product msg
		
		######## print products
		Scenario: print products
		Given the customer or admin is logged in
		When  the customer or admin choose to see the all products
		Then they should see list of products
		
		####### check product exist
		Scenario: check product exist
			Given the admin is logged in
			When the admin want to add product and its exist 
			Then he should see exist msg
			
			####### check category exist
		Scenario: check category exist
			Given the admin is logged in
			When the admin want to add category and its exist 
			Then he should see exist category msg
			
		
		######## print installerMenu
		Scenario: print installer menu
		Given the installer is logged in
		When admin join to installer
		Then he should see installer menu
    
    
########### Customer Verification

  Scenario: Check if a user is a customer with a valid customer email
    Given a valid customer email "customer@example.com"
    When the user ID is checked
    Then the result should be true

  Scenario: Check if a user is a customer with another valid customer email
    Given a valid customer email "another.customer@example.com"
    When the user ID is checked
    Then the result should be true

  Scenario: Check if a user is a customer with an invalid customer email
    Given an invalid customer email "invalid-customer-email"
    When the user ID is checked
    Then the result should be false

  Scenario: Check if a user is a customer with a non-matching email
    Given a valid customer email "customer@example.com"
    And the user ID is checked for a different email "another.user@example.com"
    Then the result should be false
    
    
    

  Scenario: Failed customer login with incorrect password
    Given a valid customer email "customer@example.com"
    And the customer password is "customerPassword"
    And the user tries to log in with an incorrect password "incorrectPassword"
    When the customer tries to log in
    Then the login should fail

  Scenario: Failed customer login with an invalid email
    Given an invalid customer email "invalidEmail"
    When the customer tries to log in
    Then the login should fail
   
   
############### Installer Verification

  Scenario: Check if a user is an installer with a valid installer email
    Given a valid installer email "installer@example.com"
    When the user ID is checked
    Then the result should be true

  Scenario: Check if a user is an installer with another valid installer email
    Given a valid installer email "another.installer@example.com"
    When the user ID is checked
    Then the result should be true

  Scenario: Check if a user is an installer with an invalid installer email
    Given an invalid installer email "invalid-installer-email"
    When the user ID is checked
    Then the result should be false

  Scenario: Check if a user is an installer with a non-matching email
    Given a valid installer email "installer@example.com"
    And the user ID is checked for a different email "another.user@example.com"
    Then the result should be false
    
    
    
############### User Login

  Scenario: Login with a valid admin email and password
    Given a valid admin email "admin@example.com"
    And a valid admin password "admin123"
    When the user tries to log in
    Then the login should be successful

  Scenario: Login with a valid admin email and incorrect password
    Given a valid admin email "admin@example.com"
    And an incorrect admin password "incorrectPassword"
    When the user tries to log in
    Then the login should fail
    
  Scenario: Login with an invalid admin email
    Given an invalid admin email "invalidAdminEmail"
    And a valid admin password "admin123"
    When the user tries to log in
    Then the login should fail

  Scenario: Login with a valid admin email and empty password
    Given a valid admin email "admin@example.com"
    And an empty admin password
    When the user tries to log in
    Then the login should fail
    
    Scenario: Login with a non-matching email
    Given a valid admin email "admin@example.com"
    And the user tries to log in with a different email "another.user@example.com"
    Then the login should fail

    
    
    
################ User Email Validation

  Scenario: Validate a valid email
    Given a valid email "user@example.com"
    When the system validates the email
    Then the email should be considered valid

  Scenario: Validate an invalid email
    Given an invalid email "invalidEmail"
    When the system validates the email
    Then the email should be considered invalid

  Scenario: Validate an empty email
    Given an empty email ""
    When the system validates the email
    Then the email should be considered invalid
    
    
    
    
     Scenario: Failed admin login with incorrect password
    Given a valid admin email "admin@example.com"
    And the admin password is "adminPassword"
    And the user tries to log in with an incorrect password "incorrectPassword"
    When the admin tries to log in
    Then the login should fail
   
    
    
    
    
    
    
################### Customer Login

  Scenario: Successful customer login
    Given a validd customer email "customer@example.com"
    And the customerr password is "customerPassword"
    When the customerr tries to log in
    Then the login should be successfulll

  Scenario: Failed customer login with incorrect password
    Given a valid customerrr email "customer@example.com"
    And the customer passwordd is "customerPassword"
    And the user tries to log in with an incorrect passworddd "incorrectPassword"
    When the customer tries to log innn
    Then the login shoulddd fail

  Scenario: Failed customer login with an invalid email
    Given an invaliddd customer email "invalidEmail"
    When the customeree tries to log in
    Then the loginnn should fail

  Scenario: Failed customer login with an empty password
    Given a valid customer emailll "customer@example.com"
    And the customer password isss an empty string
    When the customer triesss to log in
    Then theee login should fail
    
    
    
    
    
    
############ Installer Login

  Scenario: Successful installer login
    Given a validd installer email "installer@example.com"
    And the installerd password is "installerPassword"
    When the installerd tries to log in
    Then the login shouldd be successful

  Scenario: Failed installer login with incorrect password
    Given a validd installer email "installer@example.com"
    And the installerr password is "installerPassword"
    And the user triess to log in with an incorrect password "incorrectPassword"
    When the installerr tries to log in
    Then the loginn should fail

  Scenario: Failed installer login with an invalid email
    Given aan invalid installer email "invalidEmail"
    When tthe installer tries to log in
    Then tthe login should fail

  Scenario: Failed installer login with an empty password
    Given aa valid installer email "installer@example.com"
    And tthee installer password is an empty string
    When tthee installer tries to log in
    Then tthee login should fail
    
    
    
    
#############  add customer
	Scenario: Add Customer
		Given i have array with customers
		When i add customer
		Then the customer shoud add successfuly
    
    
    
    
############## Check Customer Username Existence

  Scenario: Existing username
    Given a username "existingUsername"
    When the system checks if the username exists
    Then the Signedup should be false

  
    
  ############## Check Customer PhoneNumber Existence

  Scenario: Existing phonenumber
    Given a phonenumber "existingPhoneNumber"
    When the system checks if the phonenumber exists
    Then the Signedupp should be false  
    
  ######### Display Customer Orders

  Scenario: Display orders for an existing customer
    Given an email "existingCustomer@example.com"
    When the system displays orders placed by the customer
    Then the system should show the customer’s orders
    And the result should be true

 

  

############### Date Validation

  Scenario: Valid date string
    Given a valid date string "2023-12-25" and date format "yyyy-MM-dd"
    When the system checks if the date is valid
    Then the resultttt should be true

  Scenario: Invalid date string
    Given an invalid date string "invalid-date" and date format "yyyy-MM-dd"
    When the systemm checks if the date is valid
    Then the resultt should be false


  

#################### Update Product Price

  
  Scenario: User tries to update the price of a non-existent product
    Given there are no products
    When the user tries to update the price of a product with name "Non-existent Product" to "150.00"
    Then the price of the product "Non-existent Product" should not be updated


 

  
############ Product Management

  Scenario: Delete an existing product
    Given there is a product with name "bodyShell" and other details
    When the user deletes the product with name "bodyShell"
    Then the product "bodyShell" should be deleted

  Scenario: Try to delete a non-existing product
    Given there are no products in the system
    When the user tries to delete a product with name "NonExistingProduct"
    Then the product "NonExistingProduct" should not be deleted
  
  
  
  
  
###########Display Installation Requests

  Scenario: Display installation requests for a customer with requests
    Given a customer with email "customer@example.com" and installation requests
    When the user tries to display installation requests for the customer with email "customer@example.com"
    Then the system should display the installation requests for the customer

  Scenario: Display installation requests for a customer with no requests
    Given a customer with email "customer@example.com" and no installation requests
    When the user tries to display installation requests for the customer with emaill "customer@example.com"
    Then the system should not display any installation requests for the customer
  
  
  
  
  
##############Display Customer Orders

  Scenario: Customer has orders and they are displayed
    Given a customer with email "customer@example.com" and orders
    When the user tries to display orders for the customer with email "customer@example.com"
    Then the system should display the orders for the customer

  Scenario: Customer has no orders
    Given a customer with email "customer@example.com" and no orders
    When the user tries to display orders for the customer with emaill "customer@example.com"
    Then the system should indicate that there are no orders for the customer

  Scenario: Customer not found
    When the user tries to display orders for a non-existing customer with email "nonexistent@example.com"
    Then the system should indicate that the customer was not found
  
  
  
  
  
########## Password Update Functionality

  Scenario: Successfully update password for an existing customer with a valid password
    Given a customer with email "john.doe@example.com" and passwordd "oldPassword"
    When the user updates the password for the customer with email "john.doe@example.com" to "newSecurePassword"
    Then the system should update the password for the customer

  Scenario: Fail to update password for a customer with an invalid new password
    Given a customer withh email "jane.smith@example.com" and passwordddddd "oldPassword"
    When the user tries to update the password for the customer with email "jane.smith@example.com" to "weak"
    Then the system should not update the password, and indicate that the new password is invalid

  Scenario: Fail to update password for a non-existing customer
   Given a non-existing customer
    When the user tries to update the password for a non-existing customer with email "nonexistent@example.com" to "newPassword"
    Then the system should indicate that the customer was not found

  Scenario: Fail to update password when new password is null
    Given a customer with emailll "alice@example.com" and password "oldPassword"
    When the user tries to update the password for the customer with email "alice@example.com" to null
    Then the system should not update the password, and indicate that the new password is invalid

  Scenario: Fail to update password when new password is empty
    Given a customer with email "bob@example.com" and passworddddd "oldPassword"
    When the user tries to update the password for the customer with email "bob@example.com" to an empty string
    Then the system should not update the password, and indicate that the new password is invalidd
  
  