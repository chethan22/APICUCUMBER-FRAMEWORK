Feature: TO PERFORM GET OPERATION

@reg
Scenario: user is Performing List of user api validation
Given user enter th base url
When user enters the "List_of_user" end point with GET HTTP request
Then user should get the statuscode as "200"

@reg
Scenario: user is Performing Single User api validation
Given user enter th base url
When user enters the "Single_User" end point with GET HTTP request
Then user should get the statuscode as "200"

@demo
Scenario: user is Performing Single User Not Found api validation
Given user enter th base url
When user enters the "Single_User_Not_Found" end point with GET HTTP request
Then user should get the statuscode as "404"

@demo
Scenario: user is Performing List Resource api validation
Given user enter th base url
When user enters the "List_Resource" end point with GET HTTP request
Then user should get the statuscode as "200"