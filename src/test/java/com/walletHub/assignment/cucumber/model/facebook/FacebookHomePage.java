package com.walletHub.assignment.cucumber.model.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookHomePage {
	
public FacebookHomePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[span[contains(text(),'on your mind')]]")
	private WebElement postTextBox;
	
	
	@FindBy(css="div[class*='notranslate'] div div div")
	private WebElement postTextBoxToEnterValue;
	
	@FindBy(xpath="//span[contains(text(),'Post')]")
	private WebElement submitPost;

	public WebElement getPostTextBox() {
		return postTextBox;
	}

	public void setPostTextBox(WebElement postTextBox) {
		this.postTextBox = postTextBox;
	}

	public WebElement getPostTextBoxToEnterValue() {
		return postTextBoxToEnterValue;
	}

	public void setPostTextBoxToEnterValue(WebElement postTextBoxToEnterValue) {
		this.postTextBoxToEnterValue = postTextBoxToEnterValue;
	}

	public WebElement getSubmitPost() {
		return submitPost;
	}

	public void setSubmitPost(WebElement submitPost) {
		this.submitPost = submitPost;
	}

	
	
}
