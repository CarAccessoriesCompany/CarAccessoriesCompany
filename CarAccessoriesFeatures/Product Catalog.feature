	Feature: Product Catalog
	
		# First Scenario
	  Scenario: List Products in a Interior Category
    Given I am in the main menu
    When I enter the command "Category"
    Then I should be prompted to enter the category name
    When I enter command "Interior"
    Then I should see a list of products with details (product name,description, price, availability)
    
  # Second Scenario
	  Scenario: List Products in a Exterior Category
    Given I am in the main menu
    When I enter the command "Category"
    Then I should be prompted to enter the category name
    When I enter command "Exterior"
    Then I should see a list of products with details (product name,description, price, availability)
    
    # Third Scenario--
	  Scenario: List Products in a Electronics Category
    Given I am in the main menu
    When I enter the command "Category"
    Then I should be prompted to enter the category name
    When I enter command "Electronics"
    Then I should see a list of products with details (product name,description, price, availability)
    
		# Fourth Scenario
		Scenario: Search for Products
    Given I am in the main menu
    When I enter the command "Search"
    Then I should be prompted to enter the product name
    When I enter command "Steering Wheel"
    Then I should see a list of products containing the keyword
