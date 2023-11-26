Feature: Installation Requests

# First Scenario
Scenario: Customer requests installation services
    Given the customer in installation services page
    When they provide the necessary details (e.g., car make/model, preferred date).
    Then the installation request should be submitted successfully

# Third Scenario
Scenario: Installer availability and appointment scheduling
    Given the customer has submitted an installation request
    When the system checks installer availability
    Then the customer should be able to schedule an appointment with the installer
