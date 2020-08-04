Feature: JavaByKiran login page feature


#With Example Keyword
Scenario Outline: JavaByKiran login page scenario

Given user is setup page
When user click on Register a new membership link
Then user enter register details "<name>" and "<mobile>" and "<gmail>" and "<password>"
Then user click on signin button
And close the browser

Examples:

|name| |mobile| |gmail| |password|
|tom| |9999999| |tom@gmail.com| |tom123|
|shizuka| |222222| |shizuka@gmail.com| |shizuka123|
|Doremy| |8888888| |doremy@gmail.com| |doremy123|