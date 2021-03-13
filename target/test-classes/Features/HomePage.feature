Feature: Login





@Today
Scenario: Verify Search result display

Given launch "<URL>"
Then Enter XPS in Search field
Then Click on Search button
Then Verify Search result Should display   




Scenario: Verify Create account

Given launch "<URL>"
Then Click Signin link
Then Enter Enail

@test
Scenario: Verify Create account

Given launch "<URL>"
Then Click Signin link
Then Enter Enail


@Bari
Scenario: Verify Purchase a Printed Chiffon Dress

Given launch "<URL>"
When Click on Dress Button
Then Click on Add to cart Button
Then Click on Proceed to checkout Button1
Then Verify SHOPPING-CART SUMMARY page should display




