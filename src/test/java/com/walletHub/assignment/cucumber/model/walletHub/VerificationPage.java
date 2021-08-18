package com.walletHub.assignment.cucumber.model.walletHub;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerificationPage {

	
public VerificationPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="h1-heading")
	private WebElement confirmationText;

	public WebElement getConfirmationText() {
		return confirmationText;
	}

	public void setConfirmationText(WebElement confirmationText) {
		this.confirmationText = confirmationText;
	}

	
}
