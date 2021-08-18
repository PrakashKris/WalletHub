package com.walletHub.assignment.cucumber.model.walletHub.testInsuranceCompany;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ReviewPage {


public ReviewPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBys(value = { @FindBy(css="write-review review-star[class='rvs-svg'] div svg[class='rvs-star-svg']") })
	private List<WebElement> reviewList;
	
	@FindBy(xpath="//div[@class='dropdown second']/span[@class='dropdown-placeholder']")
	private WebElement productDropDown;
	
	@FindBys(value = { @FindBy(xpath="//div[@class='dropdown second opened']/ul[@class='dropdown-list ng-enter-element']/li") })
	private List<WebElement> productDropDownOptions;
	
	@FindBy(xpath="//div[contains(text(),'Submit')]")
	private WebElement submitButton;
	
	@FindBy(css="textarea[class='textarea wrev-user-input validate']")
	private WebElement writeReviewText;
	
	public List<WebElement> getReviewList() {
		return reviewList;
	}
	public void setReviewList(List<WebElement> reviewList) {
		this.reviewList = reviewList;
	}
	public WebElement getProductDropDown() {
		return productDropDown;
	}
	public void setProductDropDown(WebElement productDropDown) {
		this.productDropDown = productDropDown;
	}
	public List<WebElement> getProductDropDownOptions() {
		return productDropDownOptions;
	}
	public void setProductDropDownOptions(List<WebElement> productDropDownOptions) {
		this.productDropDownOptions = productDropDownOptions;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public void setSubmitButton(WebElement submitButton) {
		this.submitButton = submitButton;
	}
	public WebElement getWriteReviewText() {
		return writeReviewText;
	}
	public void setWriteReviewText(WebElement writeReviewText) {
		this.writeReviewText = writeReviewText;
	}
	
	
}
