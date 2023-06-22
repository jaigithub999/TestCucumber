package org.floto.objectrepository;

import org.floto.utilities.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessorisePagePojo extends BaseClass {
	public AccessorisePagePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Positano Travel Kit']")
	private WebElement positanoTravelKit;

	@FindBy(xpath = "(//span[text()='Add To Cart'])[2]")
	private WebElement addToCartBtn;

	@FindBy(xpath="//a[text()='Remove']")
	private WebElement removeBtn;
	
	public WebElement getRemoveBtn() {
		return removeBtn;
	}

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public WebElement getPositanoTravelKit() {
		return positanoTravelKit;
	}

}
