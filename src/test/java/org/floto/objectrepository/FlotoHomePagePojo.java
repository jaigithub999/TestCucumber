package org.floto.objectrepository;

import org.floto.utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlotoHomePagePojo extends BaseClass {
	public FlotoHomePagePojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@href='/account']")
	private WebElement accountBtn;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement changeCountryBtn;
	
	@FindBy(xpath="//span[text()='Men']")
	private WebElement menTxtBtn;
	
	@FindBy(xpath="//a[text()='accessories']")
	private WebElement accessoriesTxtBtn;
	
	public WebElement getChangeCountryBtn() {
		return changeCountryBtn;
	}

	public WebElement getAccountBtn() {
		return accountBtn;
	}

	public WebElement getMenTxtBtn() {
		return menTxtBtn;
	}

	public WebElement getAccessoriesTxtBtn() {
		return accessoriesTxtBtn;
	}

}

