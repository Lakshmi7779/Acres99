Feature: 99acres insights page

Scenario: Successfully get Home Page by URL
Given I open the web browser
When I navigates to the application URL
Then I should see the Home Page

Scenario: Navigates to Locality Insights successfully
Given I open the web browser
When I navigates to the application URL
And I should see the Home Page
And I click on insights
And I click on Locality insights
Then I navigates to Locality Insights successfully

Scenario: Search Locality Insights successfully
Given I open the web browser
When I navigates to the application URL
And I should see the Home Page
And I click on insights
And I click on Locality insights
And I navigates to Locality Insights successfully
And I am on Locality Insights page
And I enter location as "Bangalore"
Then I should get search results 

Scenario: Getting Recently asked Questions
Given I am on Locality Insights page
When I scroll down the page 
And I see frequently asked Questions
Then I click on the question

Scenario: View all Insights  and Tools Successfully
Given I am on Locality Insights page
When I scroll down the Insights page
And I click on view all insights
Then I successfully see all Insights and Tools
