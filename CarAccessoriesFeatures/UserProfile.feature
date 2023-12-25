Feature: User Profile

  Scenario: Customer edits their profile
    Given a customer is logged into their account
    When a cutomer enter command "MyProfile"
    Then a cutomer in his/her profile
    And Choose what field he/she want to edit "FirstName"
    Then their profile should be updated with the new contact information

  Scenario: Customer views their order history
    Given a customer is logged into their account
    When a cutomer enter specific number on the list (My Orders)
    Then they should see a list of their past orders

  Scenario: Customer views their installation requests
    Given a customer is logged into their account
    When a cutomer enter specific number on the list (My Installation Requests)
    Then they should see a list of their installation requests
    