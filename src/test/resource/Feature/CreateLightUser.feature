Feature: Write a review and verify 

Scenario: Write a review for Health insurance product and verify user is able to submit the review and see it profile page
Given user launches wallethub url and navigates to review page
And hovers review "4" th review to verify it lights up and clicks the option 
When user selects "Health Insurance" in product down and writes the review "sample test to verify whether the content has successfully submitted or not. Hope the content is submitted and able to view it in profile page."
And submits the review
Then verify the confirmation and also verify the review in profile
