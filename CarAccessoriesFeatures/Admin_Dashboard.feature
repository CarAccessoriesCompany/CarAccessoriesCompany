Feature: Admin Dashboard

#############    Manage product categories (add, edit, delete).

    #1st scenario
		Scenario: Add a New Product Category
		
    Given the admin is on the product categories management page
    When the admin adds a new product category named "Electrical"
    Then the system should create a new product category "Electrical"
    
    # Second Scenario
    Scenario: Edit an Existing Product Category

Given the admin is on the product categories management page
When the admin edits the product category "Electronics" and changes its name to "Gadgets"
Then the system should update the product category to "Gadgets"



   # Third Scenario
   Scenario: Delete an Existing Product Category

Given the admin is on the product categories management page
When the admin deletes an exsiting product category "Electronics"
Then the system should remove the product category "Electronics"




################     Add and update product listings.  

   # Fourth Scenario
   Scenario: Add a New Product Listing
   Given the Admin is on the product listings management page
   When the Admin adds a new product with name "Sample Product",Description "speed sensor" ,price "$100",Availability "yes" ,category "Electronics",
   Then the product "Sample Product" should be added to the product listings
   
   
   #5th
   Scenario: Add a Product Listing with Invalid Price
  Given the Admin is on the product listings management page
  When the Admin attempts to add a new product with name "Invalid Product",Description "Invalid Description" ,price "Invalid Price",Availability "Invalid" and category "Electronics"
  Then the product should not be added to the product listings

  
  #6th
  Scenario: Update a Product Listing
  Given the Admin is on the product listings management page
  When the Admin updates the product name to "new name", which the name of the product is "Sample Product"
  Then the product name should be updated to "new name" in the product listings
  
  
  
  Scenario: Update a Product Listing
   Given the Admin is on the product listings management page
  When the Admin updates the product price to "100", which the name of the product is "Sample Product"
  Then the product  price of "Sample Product" should be updated to "100" in the product listings
  
  
  Scenario: Update a Product Listing
   Given the Admin is on the product listings management page
  When the Admin updates the product Description to "hello its me", which the name of the product is "Sample Product"
  Then the product Description of "Sample Product" should be updated to "hello its me" in the product listings
  
  
  Scenario: Update a Product Listing
   Given the Admin is on the product listings management page
  When the Admin updates the product Availability to "No", which the name of the product is "Sample Product"
  Then the product Availability of "Sample Product" should be updated to "No" in the product listings
  
  
  
  Scenario: Update a Product Listing
   Given the Admin is on the product listings management page
  When the Admin updates the product Category to "Interior", which the name of the product is "Sample Product"
  Then the product Category of "Sample Product" should be updated to "Interior" in the product listings
  
  
  


  
  
  
  ###################    View and manage customer accounts
  
  #8th
  Scenario: View Customer Account Details
  Given the Admin is on the customer accounts management page
  When the Admin selects a customer account with username "john_doe"
  Then the Admin should see the details of the customer account, including name, email, and contact information
  
  
  
  
  

  
  
  
  #11th
  
   Scenario: Update Customer Account Information 
  Given the Admin is on the customer accounts management page
  When the Admin updates the customer username "john_smith" to a new username "dabahne_smith"
  Then the customer account’s should be updated with the new username 
  
  
  
  
  
  
  
  #12th
  Scenario: Delete Customer Account 
  Given the Admin is on the customer accounts management page
  When the Admin deletes the customer account with username "john_doe"
  Then the customer account "john_doe" should be deleted
  
  
  
  
  
  
  
  
  
  #13th
  Scenario: Attempt to Delete Nonexistent Customer Account
  Given the Admin is on the customer accounts management page
  When the Admin attempts to delete a customer account with username "nonexistent_user"
  Then the customer account should not be deleted
  
  
  
  
  
  
  ###################   Schedule and manage installation appointments.
  
  
  
  
  #14th
  
  Scenario: Schedule an Installation Appointment
  Given the Admin is on the appointment scheduling page
  When the Admin schedules an installation appointment for "October 20, 2023, 10:00 AM" with technician "John Doe" for customer "Jane Smith"
  Then the appointment for "Jane Smith" on "October 20, 2023, 10:00 AM" with technician "John Doe" should be scheduled
  
  
  
  
  
  
  
  #15th
  
  Scenario: View Scheduled Appointments
  Given the Admin is on the appointment management page
When the Admin selects the option to view scheduled appointments for "October 20, 2023"
Then the Admin should see a list of all scheduled appointments for "October 20, 2023"
And each appointment entry should display customer name, appointment time, and assigned technician
  
  
  
  
  
  
  
  
  #16th
  
  Scenario: Reschedule an Appointment
 Given the Admin is on the appointment management page
When the Admin reschedules the appointment for "October 20, 2023, 10:00 AM" with technician "John Doe" for customer "Jane Smith"  to "October 21, 2023, 2:00 PM"
Then the appointment for "Jane Smith" on "October 20, 2023, 10:00 AM" with technician "John Doe" should be updated to "October 21, 2023, 2:00 PM"
  
  
  
  
  
  
  
  
  
  #17th
  Scenario: Cancel an Appointment
 Given the Admin is on the appointment management page
When the Admin cancels the appointment for "Jane Smith" on "October 21, 2023, 2:00 PM" with technician "John Doe"
Then the appointment for "Jane Smith" on "October 21, 2023, 2:00 PM" with technician "John Doe" should be canceled
  
  
  
  
  
  
  
  
  
  
 #18th 
  
  Scenario: View Technician’s Schedule
 Given the Admin is on the appointment management page
When the Admin selects to view "John Doe"’s schedule for "October 20, 2023" but he is a one of multiple technicians available
Then the Admin should see a list of all appointments assigned to "John Doe" on "October 20, 2023"
And each appointment entry should display customer name, appointment time, and service details
  
  
  
  
  
  
  
  
  
  #19th
  
   Scenario: Attempt to Schedule Overlapping Appointments
 Given the Admin is on the appointment scheduling page
And there exists a scheduled appointment for "October 21, 2023, 2:00 PM" with technician "John Doe" for customer "Jane Smith"
When the Admin attempts to schedule another appointment for "October 21, 2023, 1:00 PM" with technician "John Doe"
Then the appointment should not be scheduled