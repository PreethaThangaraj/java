package com.NykaaIpt.NykaaPom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.NykaaIpt.NykaaBase.NykaaBaseClass;

public class AddToBagPageImp extends NykaaBaseClass implements AddToBagPage {
	public AddToBagPageImp() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=click_btn_xpath)
	private WebElement clickButton;
	@FindBy(css=select_Frame_cssselector)
	private WebElement selectFrame;
	
	@FindBy(xpath=select_image_xpath)
	private WebElement selectImage; 
	@FindBy(xpath=selectQuantity_xpath)
	private WebElement selectQuantity;
	@FindBy(xpath=selectThree_xpath)
	private WebElement selectQtyThree;
	@FindBy(xpath=clickProceed_btn_xpath)
	private WebElement clickProceed;
	
	public WebElement getClickButton() {
		return clickButton;
	}
	public WebElement getSelectFrame() {
		return selectFrame;
	}
	public WebElement getSelectImage() {
		return selectImage;
	}
	public WebElement getSelectQuantity() {
		return selectQuantity;
	}
	public WebElement getSelectQtyThree() {
		return selectQtyThree;
	}
	public WebElement getClickProceed() {
		return clickProceed;
	}
		public static void main(String[] args) {
		

	}

}
