package org.floto.objectrepository;

import org.floto.utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlotoLoginPagePojo extends BaseClass {
	public FlotoLoginPagePojo() {
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="CustomerEmail")
	private WebElement emailBoxTxt;
	
	@FindBy(id="CustomerPassword")
	private WebElement passwordBoxTxt;
	
	@FindBy(xpath="//input[@value='LOGIN']")
	private WebElement loginBtn;
	
	
	@FindBy(xpath="//a[text()='Forgot Your Password?']")
	private WebElement forgotPasswordBtn;
	
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	private WebElement imNotRobotBtn;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submitBtn; 
	
	@FindBy(xpath="(//iframe[@title='reCAPTCHA'])[1]")
	private WebElement robotFrame; 

	@FindBy(xpath="//li[contains(text(),\"Incorrect email or password.\")]")
	private WebElement loginErrorMsg; 

	
	
	
	public WebElement getLoginErrorMsg() {
		return loginErrorMsg;
	}


	public WebElement getRobotFrame() {
		return robotFrame;
	}


	public WebElement getSubmitBtn() {
		return submitBtn;
	}


	public WebElement getImNotRobotBtn() {
		return imNotRobotBtn;
	}


	public WebElement getEmailBoxTxt() {
		return emailBoxTxt;
	}


	public WebElement getPasswordBoxTxt() {
		return passwordBoxTxt;
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}


	public WebElement getForgotPasswordBtn() {
		return forgotPasswordBtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
