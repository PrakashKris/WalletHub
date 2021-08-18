package com.walletHub.assignment.cucumber.model.walletHub.testInsuranceCompany;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

public HomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="button[class='btn blue-brds']")
	private WebElement writeAReviewButton;

	public WebElement getWriteAReviewButton() {
		return writeAReviewButton;
	}

	public void setWriteAReviewButton(WebElement writeAReviewButton) {
		this.writeAReviewButton = writeAReviewButton;
	}
	
	
	
}
