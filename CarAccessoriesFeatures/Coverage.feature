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
    
  