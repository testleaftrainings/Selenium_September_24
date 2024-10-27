Feature: Login for Leaftaps Application

#common line of code it can added in background
#Background:
#Given Launch the browser and Load the url 
#tags

@selenium @java
Scenario: Login with positive data
When Enter the username as 'DemoCsr'
And Enter the password as 'crmsfa'
And Click on Loginbutton
Then Verify the title

@java @cucumber
Scenario: Login with Negative data
When Enter the username as 'Demo'
And Enter the password as 'crmsfa'
And Click on Loginbutton
But Verify the title login is not 


#static parameterization  -give the value in 'DemoCsr' in the feature file
#StepDef- where you declare the value, remove that value and give as {string}
#inside method create input args and remove hard coded value repalce the variable name