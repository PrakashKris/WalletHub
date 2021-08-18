package com.walletHub.assignment.cucumber.stepDefinition;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.walletHub.assignment.cucumber.model.facebook.FacebookHomePage;
import com.walletHub.assignment.cucumber.model.facebook.LoginPage;
import com.walletHub.assignment.cucumber.utils.Driver;
import com.walletHub.assignment.cucumber.utils.PropertyLoader;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLoginTest {
private WebDriver driver;
private Properties property;
private LoginPage loginPage;
private FacebookHomePage homePage;

@Before
public void before(){
	driver=Driver.getChromerDriver("chrome");
	property=PropertyLoader.getInstance();
}
	@Given("user launches facebook url and enters {string} and {string}")
	public void user_launches_facebook_url_and_enters_and(String userName, String password)  {	    
			driver.get(property.getProperty("facebook.url"));
			loginPage=new LoginPage(driver);
			loginPage.getUsername().sendKeys(userName);
			loginPage.getPassword().sendKeys(password);			
	}

	@And("clicks login button")
	public void clicks_login_button() {
		loginPage.getLogIn().click(); 	    
	}

	@When("user post status message as {string}")
	public void user_post_status_message_as(String word) {		
		homePage=new FacebookHomePage(driver);		
	     new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(homePage.getPostTextBox()));
	     homePage.getPostTextBox().click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(homePage.getPostTextBoxToEnterValue()));
	     homePage.getPostTextBoxToEnterValue().sendKeys(word);
	}

	@Then("post should be successful")
	public void post_should_be_successful() {
//	     homePage.getSubmitPost().click();
		//Add validation after posting the text.
	    
	}

}
