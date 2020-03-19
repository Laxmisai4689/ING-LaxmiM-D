Feature: Verify the FirstCry Home Page

Scenario: Launching FirstCry Home Page
Given User Successfully Launches the FirstCry.com site 
When perform navigation to the All Categories link
Then user hover on the Stores and playschools link 
And click on the Playschools tab
Then verify the maps for Hyderabad and Bengaluru 
Then user click on the Hyderabad map
Then verify the Hyderabad city playscools is displayed
Then verify the list of the centers shown 

