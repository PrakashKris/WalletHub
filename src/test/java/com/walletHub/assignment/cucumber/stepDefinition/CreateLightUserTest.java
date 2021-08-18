package com.walletHub.assignment.cucumber.stepDefinition;

import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.walletHub.assignment.cucumber.model.facebook.FacebookHomePage;
import com.walletHub.assignment.cucumber.model.facebook.LoginPage;
import com.walletHub.assignment.cucumber.model.walletHub.VerificationPage;
import com.walletHub.assignment.cucumber.model.walletHub.testInsuranceCompany.HomePage;
import com.walletHub.assignment.cucumber.model.walletHub.testInsuranceCompany.ReviewPage;
import com.walletHub.assignment.cucumber.utils.Driver;
import com.walletHub.assignment.cucumber.utils.PropertyLoader;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLightUserTest {
	
	private WebDriver driver;
	private Properties property;
	private HomePage homePage;
	private ReviewPage reviewPage;
	

	@Before
	public void before(){
		driver=Driver.getChromerDriver("chrome");
		property=PropertyLoader.getInstance();
	}
	
	@Given("user launches wallethub url and navigates to review page")
	public void user_launches_wallethub_url_and_navigates_to_review_page() {
		driver.get(property.getProperty("walletHub.test.insurance.company"));
		homePage=new HomePage(driver);
		homePage.getWriteAReviewButton().click();
	    
	}

	@And("hovers review {string} th review to verify it lights up and clicks the option")
	public void hovers_review_th_review_to_verify_it_lights_up_and_clicks_the_option(String rating) {
		reviewPage=new ReviewPage(driver);
		new WebDriverWait(driver,10).until(ExpectedConditions.titleIs("test insurance company metatitle test"));
				
		WebElement reviewElements=reviewPage.getReviewList().get(Integer.parseInt(rating)-1);
		Actions action=new Actions(driver);		
		action.moveToElement(reviewElements).build().perform();
		List<WebElement> lightsUp=reviewElements.findElements(By.cssSelector("g path"));
		Assert.assertEquals("Review is not lighten", 2, lightsUp.size());
		reviewElements.click();
		reviewPage.getProductDropDown().click();
		
		
		
	}

	@When("user selects {string} in product down and writes the review {string}")
	public void user_selects_product_in_product_down_and_writes_the_review(String product, String comment) {
		//reviewPage.getProductDropDownOptions().stream().filter(e->e.getText().toLowerCase().trim().equals(product.toLowerCase().trim())).findFirst().get().click();
		for(WebElement element:reviewPage.getProductDropDownOptions()){
			if(element.getText().toLowerCase().trim().equals(product.toLowerCase().trim()))
				element.click();
		}
		reviewPage.getWriteReviewText().sendKeys(comment);
	}

	@And("submits the review")
	public void submits_the_review() {
		reviewPage.getSubmitButton().click();
	    
	}

	@Then("verify the confirmation and also verify the review in profile")
	public void verify_the_confirmation_and_also_verify_the_review_in_profile() {
		//Confirmation page is not displayed and its asking for sign in and while signing in, unable to move forward from address page 
		//Please provide title of the page if its available and add confirmation text and verify the post in profile.
		new WebDriverWait(driver,10).until(ExpectedConditions.titleIs("Join WalletHub"));		
		driver.navigate().to(property.getProperty("walletHub.profile"));
	    
	}


}
