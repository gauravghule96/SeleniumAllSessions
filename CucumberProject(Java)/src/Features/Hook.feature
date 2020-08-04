Feature: Facebook appliction testing

Scenario: Create a friends
Given user use on friends page
When user watch friend on page
Then suggection the friend

Scenario: Create a videos
Given user create own video
When user use on features in video page
Then  upload creatindg the video

Scenario Outline:Create a profile
Given user use on profile page
When user fill the information in data
Then prifile created
Examples:
 |name|Mail|password|
 |rrr|rr@gmail.com|125367|
 |ass|asd@gmail.com|86968|