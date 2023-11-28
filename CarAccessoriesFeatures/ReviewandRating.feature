Feature: Review and Rating


# First Scenario
Scenario: Cutomer review an product
	Given customer in products page
	When cutomer enters "product name" then enter "Review"
	Then cutomer should enter review for the product "Good Product"
	
# Second Scenario
Scenario: Customer rating an product
	Given customer in products page
	When cutomer enters "product name" then enter "Rating" to rating the product
	Then cutomer should enter rating for the product "5"
	
# Third Scenario
Scenario: Display  review for products
	Given customer in products page
	When cutomer enters "product name"
	Then cutomer should see the review for the product
	
# Fourth Scenario
Scenario: Display  Rating for products
	Given customer in products page
	When cutomer enters "product name" to display rating
	Then cutomer should see the rating for the product