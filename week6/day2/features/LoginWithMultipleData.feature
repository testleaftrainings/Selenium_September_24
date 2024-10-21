Feature: Login for Leaftaps Application

Scenario Outline: Login with Multiple sets of  data
Given Launch the browser and Load the url 
When Enter the username as <userName>
And Enter the password as <passWord>
And Click on loginbutton
Then Verify the title
But Verify the title login is not

Examples:
|userName|passWord|
|'DemoCsr'|'crmsfa'|
|'demo'|'crmsfa'|
|'demosalesmanager'|'crmsfa'|



