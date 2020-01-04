Feature: Test Login
Scenario: Admin logs in
Given open the app and navigates to the login page
When the user enters the valid details
Then the system navigates to home page

Scenario: User Registers
Given open the app, click on submit button and navigates to signup page
When the user enters valid details for signup
Then the system displays success message

Scenario: Profile Modify
Given click on profile icon and click change button and clear the address textbox
When Enter the valid credentials in the address textbox
Then click on submit button and ok button on popup windows


Scenario: Admin allow access
Given user should launch the application by entering valid URL and Admit should logged in
When  User gives valid credentials in member login textbox
Then  Click on Submit button and click ok in poppup


Scenario: Member logs in
Given open the app and navigates to the member login page
When the user enters the valid user details
Then system navigates to home page
 


