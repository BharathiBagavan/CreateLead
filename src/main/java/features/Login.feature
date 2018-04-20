Feature: Login for Leaftaps
#Background: 
#Given open the browser
#And load url
#And settimeouts
#And Maximize the browser
Scenario: Login for Leaftaps positive
#Given open the browser
#And load url
#And settimeouts
#And Maximize the browser
And Enter the username as DemoSalesManager
And Enter the password as crmsfa
When click on login buton
And click on CRMSFA
And click on Leads
And click on createLead
Then Enter company name as Intellect
Then Enter First name as Karthik
Then Enter Last name as XCX
Then click on create Lead button

Scenario Outline: Login for Leaftaps positive
#Given open the browser
#And load url
#And settimeouts
#And Maximize the browser
And Enter the username as <uName>
And Enter the password as <pwd>
When click on login buton
#And click on CRMSFA
#And click on Leads
#And click on createLead
#Then Enter company name as Intellect
#Then Enter First name as Karthik
#Then Enter Last name as XCX
#Then click on create Lead button
Examples:
|uName|pwd|
|DemoSalesManager|crmsfa|
|DemoSalesCSR|crmsfa|