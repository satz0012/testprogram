Feature: Login to Leaftaps application

Background:
Given Launch the browser
And Maximize the browser
And Load the url

Scenario Outline: TC001 positive flow for login
Given Enter the username as <Username>
And Enter the password as <Password>
When Click on the login button
Then Verify login is successful 

Examples:
|Username|Password|
|Demosalesmanager|crmsfa|
|DemoCSR|crmsfa|

 
