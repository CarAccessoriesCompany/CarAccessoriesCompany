	Feature: Product Catalog
	
		# First Scenario
	  Scenario: List Products in a Interior Category
    Given I am in the main menu
    When I enter the command "Category"
    Then I should be prompted to enter the category name
    When I enter command "Interior"
    Then I should see a list of products with details (product name,description, price, availability)
    
 