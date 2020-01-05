Feature: Create lead
Background: 
Given Launch the browser
And maximize the browser
And Load the url

Scenario: positive  testcase flow
And Enter the username
And Enter the password 
When user clicks on the login button
Then verify login is successfull
When user clicks on crm/sfa button
And user clicks on lead button
And user clicks on creadlead button
And user enters the mandatory fields
And user clicks on creadlead submit button
And close the browser



