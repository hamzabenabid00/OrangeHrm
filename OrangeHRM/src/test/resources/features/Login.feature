Feature: loginn page
Background:
Given Admin is  on login page

Scenario: Login with valid Credentials

When Admin enter correct username "Admin" and coorrect password "admin123"
Then Admin is directed to homepage that contains "Dashboard"

Scenario: login with invalid credentials

When Admin entre incorrect username "hamza" and incorrect password "hamza123"
Then  admin is still on login page that contains message "Invalid credentials"