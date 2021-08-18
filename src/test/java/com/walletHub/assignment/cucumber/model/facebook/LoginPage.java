package com.walletHub.assignment.cucumber.model.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#email")
	private WebElement username;
	
	@FindBy(css="#pass")
	private WebElement password;
	
	
	@FindBy(name="login")
	private WebElement logIn;


	public WebElement getUsername() {
		return username;
	}


	public void setUsername(WebElement username) {
		this.username = username;
	}


	public WebElement getPassword() {
		return password;
	}


	public void setPassword(WebElement password) {
		this.password = password;
	}


	public WebElement getLogIn() {
		return logIn;
	}


	public void setLogIn(WebElement logIn) {
		this.logIn = logIn;
	}
	

	
	
}
