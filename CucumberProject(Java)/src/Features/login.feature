Feature: JavaByKiran login page feature


#without Example Keyword
#Scenario: JavaByKiran login page scenario
#Given user is already on login page
#When title of login page JavaByKiran
#Then user enter "kiran@gmail.com" and "123456"
#Then user click on login button
#And user is on home page

#With Example Keyword
Scenario Outline: JavaByKiran login page scenario
Given user is already on login page
When title of login page JavaByKiran
Then user enter "<username>" and "<password>"
Then user click on login button
And user is on home page

Examples:
|username| |password|
|kiran@gmail.com| |123456|
|herry@gmail.com| |22334455|
