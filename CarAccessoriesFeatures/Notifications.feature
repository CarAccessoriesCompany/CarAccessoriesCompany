Feature: Notification System

  Scenario: Customer receives order confirmation and updates
    Given a customer in produt page and wants to order
    When an order is placed by a customer and his email is "customer@example.com"
    Then the customer should receive an email with the subject "Order Confirmation"
    
    
    
    
    
    Scenario: Installer receives notification for new installation request
    Given  a customer has submitted an installation request 
    When a new installation request is sent to the installer with username "installer123"
    Then the installer with username "installer123" should be notified
    