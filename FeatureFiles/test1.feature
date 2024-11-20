Feature: Login
Scenario: Successful login with valid credential
Given Open the chrome browser
When Open the url "https://opensource-demo.orangehrmlive.com/auth/login"
And Enter username "Admin" and password "admin123"
And Click the login button
Then The user will landing on the home

