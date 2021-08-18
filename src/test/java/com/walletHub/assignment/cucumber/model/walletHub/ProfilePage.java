package com.walletHub.assignment.cucumber.model.walletHub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {


public ProfilePage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#email")
	private WebElement username;
	
	@FindBy(css="#pass")
	private WebElement password;
	
	
}
