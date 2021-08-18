#Project Overview
1. Maven project
2. Behavior driven development using cucumber
	a. Feature files are kept under test resource folder
	b. Runner class and Step definition files are kept under Cucumber package in test/java.
3. Model package has page object model for each page. Have used Page object factory design
4. Mostly followed Singleton design pattern. 

#Facebook Login
1. Username and password to be passed in feature file
2. facebook url is picked from application.properties in test resource folder
3. Handled notofication pop up.
4. In case of any other pop up or alert which may occur needs to be handled.

#Create Light User Account
1. Review rating,product and review comment are passed through feature file
2. Step 6 and 7 are not completed. Added comments in step definition, once added we are good to remove this comment as well.

#To run the test
1. Open runner class and run as Junit test
2. Or using Maven goal we can run the test.

#Improvements
1. Logs are not added
2. can use Lombok dependency to remove the boiler plate code in Model class
3. Reporting needs to be added 