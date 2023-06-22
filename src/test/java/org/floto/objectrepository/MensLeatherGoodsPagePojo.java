package org.floto.objectrepository;

import org.floto.utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MensLeatherGoodsPagePojo extends BaseClass {
	public MensLeatherGoodsPagePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Men']")
	private WebElement menTxtBtn;
	
	@FindBy(xpath="//a[text()='accessories']")
	private WebElement accessoriesTxtBtn;

	public WebElement getMenTxtBtn() {
		return menTxtBtn;
	}

	public WebElement getAccessoriesTxtBtn() {
		return accessoriesTxtBtn;
	}
}
